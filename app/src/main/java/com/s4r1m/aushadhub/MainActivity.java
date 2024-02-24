package com.s4r1m.aushadhub;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.s4r1m.aushadhub.ml.AushadhubTflite;

import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    TextView resultTv;
    Button button_camera;
    Button button_gallery;
    Button check_usecase;

    int maxPos = 0;

    private final int CAMERA_REQ_CODE = 100;
    private final int GALLERY_REQ_CODE = 200;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        check_usecase = findViewById(R.id.check_usecase);

        button_camera = findViewById(R.id.upload_from_camera);
        button_gallery = findViewById(R.id.upload_from_gallery);
        imageView = findViewById(R.id.upload_image);
        resultTv = findViewById(R.id.result);
        check_usecase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UseCaseActivity.class);
                intent.putExtra("key", maxPos);
                startActivity(intent);
            }
        });

        button_camera.setOnClickListener(v -> {
            Intent iCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(iCamera, CAMERA_REQ_CODE);
        });

        button_gallery.setOnClickListener(v -> {
            Intent iGallery = new Intent(Intent.ACTION_PICK);
            iGallery.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(iGallery, GALLERY_REQ_CODE);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if (resultCode == RESULT_OK) {
            if (requestCode == CAMERA_REQ_CODE) {
                if (data != null) {
                    Bitmap img = (Bitmap) Objects.requireNonNull(data.getExtras()).get("data");
                    if (img != null) {
                        imageView.setImageBitmap(img);
                        classifyImage(img);
                    }
                }
            } else if (requestCode == GALLERY_REQ_CODE) {
                if (data != null) {
                    Uri dat = data.getData();
                    if (dat != null) {
                        Bitmap img = null;
                        try {
                            img = MediaStore.Images.Media.getBitmap(this.getContentResolver(), dat);
                            imageView.setImageBitmap(img);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        classifyImage(img);
                    }
                }
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    public void classifyImage(Bitmap image) {
        try {
            AushadhubTflite model = AushadhubTflite.newInstance(getApplicationContext());
            ByteBuffer byteBuffer = processImage(image);
            // Creates inputs for reference.
            TensorBuffer inputFeature0 = TensorBuffer.createFixedSize(new int[]{1, 3, 224, 224}, DataType.FLOAT32);
            inputFeature0.loadBuffer(byteBuffer);
            // Runs model inference and gets result.
            AushadhubTflite.Outputs outputs = model.process(inputFeature0);
            TensorBuffer outputFeature0 = outputs.getOutputFeature0AsTensorBuffer();

            float[] confidence = outputFeature0.getFloatArray();

            float maxConfidence = Float.NEGATIVE_INFINITY;
            for (int i = 0; i < confidence.length; i++) {
                Log.d("CHeck", "classifyImage: probability :" + confidence[i] + " -- " + i);
                if (confidence[i] > maxConfidence) {
                    maxConfidence = confidence[i];
                    maxPos = i;
                }
            }

            String[] classes = {"Alpinia Galanga (Rasna)",
                    "Amaranthus Viridis (Arive-Dantu)",
                    "Artocarpus Heterophyllus (Jackfruit)",
                    "Azadirachta Indica (Neem)",
                    "Basella Alba (Basale)",
                    "Brassica Juncea (Indian Mustard)",
                    "Carissa Carandas (Karanda)",
                    "Citrus Limon (Lemon)",
                    "Ficus Auriculata (Roxburgh fig)",
                    "Ficus Religiosa (Peepal Tree)",
                    "Hibiscus Rosa-sinensis",
                    "Jasminum (Jasmine)",
                    "Mangifera Indica (Mango)",
                    "Mentha (Mint)",
                    "Moringa Oleifera (Drumstick)",
                    "Muntingia Calabura (Jamaica Cherry-Gasagase)",
                    "Murraya Koenigii (Curry)",
                    "Nerium Oleander (Oleander)",
                    "Nyctanthes Arbor-tristis (Parijata)",
                    "Ocimum Tenuiflorum (Tulsi)",
                    "Piper Betle (Betel)",
                    "Plectranthus Amboinicus (Mexican Mint)",
                    "Pongamia Pinnata (Indian Beech)",
                    "Psidium Guajava (Guava)",
                    "Punica Granatum (Pomegranate)",
                    "Santalum Album (Sandalwood)",
                    "Syzygium Cumini (Jamun)",
                    "Syzygium Jambos (Rose Apple)",
                    "Tabernaemontana Divaricata (Crape Jasmine)",
                    "Trigonella Foenum-graecum (Fenugreek)"};

            String result = classes[maxPos];
            resultTv.setText(result);


            // Releases model resources if no longer used.
            model.close();
        } catch (IOException e) {
            // TODO Handle the exception
        }
    }

    public ByteBuffer processImage(Bitmap image) {

        int width = 256;
        int height = 256;
        int newWidth = 224;
        int newHeight = 224;
        Bitmap resizedBitmap = Bitmap.createScaledBitmap(image, width, height, true);

        int xx = (256 - 224) / 2;  // Calculate the starting X coordinate for center crop
        int yy = (256 - 224) / 2; // Calculate the starting Y coordinate for center crop

        Bitmap croppedBitmap = Bitmap.createBitmap(resizedBitmap, xx, yy, newWidth, newHeight);

        float[] imgArray = new float[224 * 224 * 3]; // Assuming 3 channels (RGB)

// Convert the Bitmap to a float array and normalize
        for (int y = 0; y < 224; y++) {
            for (int x = 0; x < 224; x++) {
                int pixel = croppedBitmap.getPixel(x, y);

                // Extract RGB channels
                float r = ((pixel >> 16) & 0xFF) / 256.0f;
                float g = ((pixel >> 8) & 0xFF) / 256.0f;
                float b = (pixel & 0xFF) / 256.0f;

                // Calculate the index for the current pixel
                int index = (x * 224 + y) * 3;

                // Transpose the color dimension and normalize
                imgArray[index] = r;
                imgArray[index + 1] = g;
                imgArray[index + 2] = b;
            }
        }

        float[] means = {0.485f, 0.456f, 0.406f};
        float[] stds = {0.229f, 0.224f, 0.225f};

        // Apply standardization
        for (int i = 0; i < imgArray.length; i++) {
            int channel = i % 3; // Determine the channel (R: 0, G: 1, B: 2)
            imgArray[i] = (imgArray[i] - means[channel]) / stds[channel];
        }

        float[][][][] expandedImgArray = new float[1][3][224][224];

        for (int c = 0; c < 3; c++) {
            for (int h = 0; h < 224; h++) {
                for (int w = 0; w < 224; w++) {
                    expandedImgArray[0][c][h][w] = imgArray[c * 224 * 224 + h * 224 + w];
                }
            }
        }

        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(224 * 224 * 3 * Float.BYTES);
        byteBuffer.order(ByteOrder.nativeOrder());

        for (int b = 0; b < 1; b++) {
            for (int c = 0; c < 3; c++) {
                for (int h = 0; h < newHeight; h++) {
                    for (int w = 0; w < newWidth; w++) {
                        byteBuffer.putFloat(expandedImgArray[b][c][h][w]);
                    }
                }
            }
        }

        byteBuffer.rewind();
        return byteBuffer;
    }
}