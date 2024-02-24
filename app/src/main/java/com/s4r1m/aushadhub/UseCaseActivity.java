package com.s4r1m.aushadhub;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class UseCaseActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use_case);

        String[] description = {"Alpinia Galanga, also known as Rasna or Greater Galangal, is a perennial herb that belongs to the Zingiberaceae family. It is native to Southeast Asia, specifically Indonesia and Malaysia, but can also be found in other parts of Asia, such as India and China.\n" +
                "\n" +
                "The plant typically grows up to 2 meters in height and has large leaves that can reach up to 60cm in length. The leaves are oblong-shaped, dark green in color, and have prominent veins. The stem is erect with a cluster of small, white or pinkish flowers at the top.\n" +
                "\n" +
                "The roots of Alpinia Galanga are highly valued for their medicinal properties and are used in Ayurvedic and traditional Chinese medicine. They contain a variety of active compounds such as flavonoids, essential oils, and phenolic acids that are known for their anti-inflammatory, analgesic, and antioxidant properties.\n" +
                "\n" +
                "Alpinia Galanga is widely used in herbal medicine to treat a range of health issues, including digestive disorders, respiratory problems, arthritis, and skin conditions. The essential oil extracted from the roots is also used in aromatherapy to alleviate stress and anxiety.\n" +
                "\n" +
                "Apart from its medicinal properties, the plant is also known for its culinary uses. The root has a spicy, pungent flavor and is often used in Southeast Asian cuisine to add flavor to dishes such as curries, soups, and stir-fries.\n" +
                "\n" +
                "Overall, Alpinia Galanga (Rasna) is an important and versatile herb with a long history of use in traditional medicine and culinary traditions. Its unique combination of medicinal and culinary properties makes it a valuable addition to any herbal or spice collection.", "\"Amaranthus Viridis, commonly known as Arive-Dantu, is an annual herbaceous plant belonging to the Amaranthaceae family. It is native to tropical regions of Central and South America but is widely distributed and naturalized in different parts of the world, including India.\n" +
                "\n" +
                "The plant grows up to 1 m tall and has an erect or spreading growth habit. It has a deep-green, smooth, and glossy surface with yellowish-green flowers arranged in clusters. The leaves of Arive-Dantu are alternate, ovate to lanceolate, and measure 2-15 cm in length and 1-10 cm in width. The stem and branches of the plant are smooth, tender, and reddish-brown in color.\n" +
                "\n" +
                "Arive-Dantu is a rapid-growing and adaptable plant that can grow in different soil types but prefers well-draining, fertile, and moist soil. It requires full sun exposure for optimal growth and can tolerate high temperatures and drought conditions.\n" +
                "\n" +
                "The plant is widely consumed as a leafy vegetable and is considered a nutritious and health-promoting food. It is rich in vitamins A, C, and K, minerals such as iron, calcium, and potassium, and antioxidants. The young leaves and stems of Arive-Dantu can be boiled, sautÃ©ed, or stir-fried and used in various dishes such as soups, curries, and salads.\n" +
                "\n" +
                "In traditional medicine, Arive-Dantu is used for its anti-inflammatory, anti-diabetic, and anti-hypertensive properties. It is also known to have anti-microbial and anti-cancer effects.\n" +
                "\n" +
                "Overall, Arive-Dantu is a versatile and beneficial plant that plays a significant role in food and medicine industries.\"\n", "\"Artocarpus heterophyllus, commonly known as jackfruit, is a tropical fruit tree species that belongs to the Moraceae family. It is native to the rainforests of India, Bangladesh, and Sri Lanka, and is now widely grown throughout the tropical regions of the world.\n" +
                "\n" +
                "The jackfruit tree can grow up to 30 meters in height and has a cylindrical trunk with smooth, grayish bark. The leaves are dark green, glossy, and relatively large, measuring between 7 to 8 inches in length and 3 to 4 inches in width. The tree is evergreen and produces both male and female flowers that grow in clusters on the trunk or branches.\n" +
                "\n" +
                "The fruit of the jackfruit tree is the largest tree-borne fruit in the world, weighing up to 45 kilograms (100 lbs). It has a green and spiky outer skin that can be rough and hard to penetrate. Inside the fruit, there are numerous fleshy yellow or orange-colored arils or bulbs, which contain the seeds. The arils are divided into segments, similar to an orange or a grapefruit, and have a sweet, juicy, and musky flavor.\n" +
                "\n" +
                "Jackfruit is a highly nutritious fruit that contains a high amount of dietary fiber, potassium, vitamin C, and other essential nutrients. It is used in many different cuisines, both ripe and unripe, and can be eaten fresh, cooked, or preserved. It is commonly used as a meat substitute in vegan and vegetarian dishes due to its meaty texture and flavor.\n" +
                "\n" +
                "In addition to its culinary uses, the jackfruit tree is also valued for its wood, which is strong, durable, and resistant to pests and rot. The tree is also used in traditional medicine, and various parts of the plant, including the bark, leaves, and roots, have been used to treat a wide range of diseases and ailments.\"\n", "\"Azadirachta Indica, commonly known as neem, is a medium-sized tree that belongs to the Mahogany family (Meliaceae). It is native to the Indian subcontinent but widely distributed in tropical and subtropical regions around the world. The tree has a straight trunk with a diameter of up to 2 meters and can grow up to 20-30 meters tall with a spreading crown. \n" +
                "\n" +
                "The neem tree has many uses, including medicinal, agricultural, and cosmetic. The leaves of the neem tree are known for their antibacterial, antifungal, and antiseptic properties. They are used in traditional medicine to treat skin diseases, infections, and various ailments. The leaves are also used as a natural insecticide, especially in agriculture, to protect crops from pests and insects. \n" +
                "\n" +
                "The neem tree also produces a bitter-tasting fruit that is highly nutritious. The fruit is commonly eaten in India and is rich in essential vitamins and minerals. The fruit also has medicinal properties and is used to treat digestive problems, fever, and other ailments. \n" +
                "\n" +
                "The neem tree bark, seeds, and oil are also used for various purposes. The bark of the neem tree is used to make a tonic that helps to maintain healthy blood sugar levels. The seeds of the neem tree are used to extract an oil that is used in cosmetics, soap making, and as a natural insecticide. The neem oil is also used to treat skin disorders such as eczema, psoriasis, and acne.\n" +
                "\n" +
                "In summary, the Neem tree is a versatile plant that has many benefits and uses. It is a significant component in traditional medicine, agriculture, and cosmetics. Its antibacterial, antifungal, and antiseptic properties make it one of the most sought-after natural remedies. The tree's bitter-tasting fruit and oil are loaded with essential nutrients, making it a valuable source of food and medicine.\"\n", "\"Basella Alba, commonly known as Basale or Malabar Spinach, is a climbing vine that belongs to the Basellaceae family. It is native to India and Southeast Asia but is now cultivated in many parts of the world as a leaf vegetable.\n" +
                "\n" +
                "Basale has slender and succulent stems that can grow up to 10 meters in length. The leaves are dark green, heart-shaped, and have a glossy texture. The plant produces small, fragrant, and white or pink flowers that develop into berries with a shiny black color.\n" +
                "\n" +
                "The leaves and tender stems of Basale are edible and are used as a vegetable in many cuisines. The taste of the leaves is similar to that of spinach, and they are rich in vitamins A and C, iron, calcium, and other essential nutrients. The stems of the plant are also used in dishes, but they need to be cooked longer due to their fibrous texture.\n" +
                "\n" +
                "Basale grows best in warm and humid climates and prefers well-drained soil with good organic content. It is a fast-growing plant and requires regular watering and fertilization to thrive. The plant can be propagated by stem cuttings, and it is usually grown on vertical support structures such as trellises or fences.\n" +
                "\n" +
                "Besides its culinary uses, Basale is also used in traditional medicine for its various health benefits. It is believed to have anti-inflammatory, antioxidant, and hypoglycemic properties and may be used in the treatment of diabetes and other ailments.\n" +
                "\n" +
                "In summary, Basella Alba, or Basale, is a leafy vegetable with a long history of culinary and medicinal uses. It is a fast-growing climbing vine that is easy to grow and is a rich source of essential nutrients.\"\n", "\"Brassica juncea, commonly known as Indian mustard, is a plant species belonging to the Brassicaceae family and is widely grown for its edible leaves, stem, and seeds. It is an annual, herbaceous plant that can grow up to 1.5 meters in height. The leaves of Brassica juncea are simple, flat, and deeply lobed, resembling the leaves of spinach. They are dark green in color with a slightly pungent taste.\n" +
                "\n" +
                "The stem of Indian mustard is thick and woody with a rough texture. It has a branching nature and holds the leaves in an upright position. The flowers of Brassica juncea grow in dense clusters at the top of the stem. The flowers are four-petaled, bright yellow in color, and about 1 cm in diameter. They are self-pollinating and produce legume-like fruits that contain seeds, which are small, oval-shaped, and reddish-brown in color.\n" +
                "\n" +
                "Brassica juncea is a hardy plant that can tolerate a wide range of temperature and soil conditions. It grows well in warm climates and requires well-drained soil with adequate moisture. It is a fast-growing plant that can be harvested within 40-60 days of planting.\n" +
                "\n" +
                "Indian mustard is widely cultivated for its culinary and medicinal properties. The leaves and stem of the plant are used extensively in Indian and Chinese cuisine as a vegetable, known as sarson ka saag and gai choy, respectively. The seeds are used to produce mustard oil, a pungent oil with various culinary and medicinal uses. The oil is also used in the manufacturing of soap, cosmetics, and lubricants.\n" +
                "\n" +
                "Indian mustard is also used in traditional medicine to treat various ailments such as colds, coughs, and asthma. The plant contains a variety of bioactive compounds such as glucosinolates, flavonoids, and phenolic acids, which have antioxidant and anti-inflammatory properties.\n" +
                "\n" +
                "In conclusion, Brassica juncea, or Indian mustard, is a versatile plant with various culinary and medicinal uses. It is a hardy plant that grows well in a wide range of conditions and is an important crop in many parts of the world.\"\n", "\"Carissa carandas, commonly known as Karanda or kerenda, is a small to medium-sized, evergreen and thorny tree, belonging to the Apocynaceae family. It is native to the Indian subcontinent and some parts of Southeast Asia. This plant is cultivated for its edible fruits, which are small, fleshy, and have a tangy taste.\n" +
                "\n" +
                "The tree can grow up to 10-15 feet in height and has a dense, bushy crown. The bark of the tree is grey-brown in color and is smooth when young but becomes rough and fissured as the tree ages. The leaves of the Karanda tree are dark green and glossy, oval to elliptical in shape, and arranged alternately on branched stems.\n" +
                "\n" +
                "The fragrant flowers of the Karanda tree are small, white, and star-shaped, with a waxy texture. They bloom in clusters during the spring and summer months. The fruit of the Karanda tree is a spherical, berry-like drupe that is green when unripe and turns yellow-orange or red when mature. The fruit contains small, flat and hard seeds.\n" +
                "\n" +
                "Karanda is a hardy tree that thrives in a range of soil types, particularly sandy loam, and is well adapted to semi-arid conditions. The tree is drought-resistant and can tolerate short periods of flooding.\n" +
                "\n" +
                "In traditional medicine, Karanda has been used for its medicinal properties, particularly for its anti-inflammatory, digestive, and diuretic effects. It is also rich in vitamin C, iron, phosphorus, and calcium. The fruit of the Karanda tree is used to make jams, chutneys, and pickles. It is also used as a souring agent in curries and soups.\n" +
                "\n" +
                "Overall, Carissa carandas is an attractive, versatile and useful tropical tree, that is known for its ornamental value, medicinal properties, and edible fruit.\"\n", "\"Citrus limon, commonly known as lemon, is a small, evergreen tree native to Asia. The tree typically grows up to 6 meters in height and has thorny branches. The leaves are ovate, with a glossy, dark green color and a slightly serrated margin.\n" +
                "\n" +
                "The fruit of the lemon tree is a bright yellow, oval-shaped fruit with a characteristic bitter taste. The fruit is rich in citric acid, vitamin C, and other antioxidants. The skin of the fruit is thin and smooth and is commonly used for its zest, which adds a tangy flavor to dishes.\n" +
                "\n" +
                "Lemon trees bear fruit throughout the year, with peak harvest periods in the winter and summer. The fruit is commonly used in cooking, baking, and as a garnish. In addition, lemon juice is used in various food and drink preparations, such as lemonade, cocktails, and salad dressings.\n" +
                "\n" +
                "Apart from their culinary uses, lemons also have a range of health benefits. They are rich in Vitamin C, which plays a vital role in boosting the immune system. Studies have shown that the antioxidants present in lemons can help to reduce the risk of heart disease, stroke, and certain cancers. The essential oil extracted from lemon peels is used in aromatherapy and other therapeutic practices for its refreshing and uplifting properties.\n" +
                "\n" +
                "Overall, Citrus limon is a versatile and widely cultivated fruit known for its distinct, tangy flavor and many health benefits.\"\n", "\"Ficus Auriculata, also commonly known as the Roxburgh fig, is a species of fig tree that belongs to the Moraceae family. It is a native plant to the Indian subcontinent and Southeast Asia, including countries such as Myanmar, Thailand, and Bangladesh.\n" +
                "\n" +
                "The Roxburgh fig has an evergreen habit and can grow up to 20 meters in height, while the trunk's girth may exceed 3 meters. Its leaves are glossy, dark green, and oblong-ovate in shape, measuring around 12-15 cm in length and 8-10 cm in breadth. The foliage is typically dense and shades the tree's lower parts.\n" +
                "\n" +
                "The tree produces small, fig-like fruits that are slightly elongated, measuring up to 3 cm in diameter. The fruit's inner flesh is pinkish-white and fibrous, encasing many small seeds. The fruit's skin is thin and yellowish-green, with numerous brownish dots. The fruit is edible, but not commonly consumed as a food item.\n" +
                "\n" +
                "Additionally, the Roxburgh fig tree has a shallow root system that can damage nearby buildings and infrastructure. The tree's sap is milky and may cause skin irritation or allergies, mainly in people with sensitive skin. It is recommended to handle the tree with gloves and protective clothing while pruning or cutting.\n" +
                "\n" +
                "In traditional medicine, the bark and leaves of the Roxburgh fig tree are used as a folk remedy for treating various ailments. Its medicinal properties include anti-inflammatory and anti-diabetic effects, among others.\n" +
                "\n" +
                "Overall, Ficus Auriculata is an attractive, evergreen tree that can add value to any landscape. Its glossy foliage and small fig-like fruits make it a unique species, while its medicinal benefits make it a valuable resource in traditional medicine.\"\n", "\"Ficus Religiosa, commonly known as the Peepal Tree or the Bodhi Tree, is a deciduous tree native to the Indian subcontinent and Southeast Asia. It is considered sacred in Hinduism, Buddhism, and Jainism, and is often planted near temples and homes in these regions. \n" +
                "\n" +
                "The tree can grow up to 30 meters tall and has a thick trunk that can reach a diameter of up to 3 meters. The bark is gray and smooth, with aerial roots that may grow from the branches and descend to the ground, sometimes forming new trunks. The leaves are large, heart-shaped, and grow up to 10-17 cm long, with a pointed tip and a smooth surface. \n" +
                "\n" +
                "The Peepal Tree is significant in several religions and has a deep-rooted symbolism. In Hinduism, it is believed to be the abode of the Trimurti, the three main deities â€“ Brahma, Vishnu, and Shiva. The tree is also associated with the Goddess Lakshmi, the goddess of wealth and prosperity. In Buddhism, the tree is revered as the spot where the Buddha attained enlightenment. The term â€œBodhi Treeâ€\u009D means â€œtree of awakening,â€\u009D and it is believed that meditating under this tree can lead to enlightenment. The tree is also regarded as a symbol of the Buddhaâ€™s teachings and represents the Buddhist concept of the cycle of birth, death, and rebirth. In Jainism, the tree is seen as a symbol of wisdom, patience, and longevity, and is often used in religious rituals and ceremonies.\n" +
                "\n" +
                "The Peepal Tree has several medicinal properties and is used in traditional Ayurvedic medicine to treat a variety of ailments. The leaves of the tree are believed to have anti-inflammatory and antioxidant properties, and are used to treat skin disorders, digestive problems, respiratory infections, and joint pain. The bark of the tree has anti-inflammatory and analgesic properties and is used to treat toothaches, gum disorders, and wounds.\n" +
                "\n" +
                "Overall, the Peepal Tree is an important cultural and spiritual symbol in many parts of the world, and its deep-rooted significance continues to inspire people to this day.\"\n", "\"Hibiscus Rosa-sinensis, commonly known as Chinese hibiscus or shoe flower, is a perennial plant belonging to the Malvaceae family. It is native to East Asia and is often cultivated for its showy, trumpet-shaped flowers, which come in a range of colors, including red, pink, orange, yellow, white, and purple. \n" +
                "\n" +
                "The plant is a small tree or shrub, reaching a height of up to 3 meters. It has oval or elliptical-shaped leaves, which are glossy and green, and can grow up to 15 cm long. The leaves are arranged alternately on the stem and have a slightly serrated edge. The stems of the plant are thick and woody and have a grayish-brown color.\n" +
                "\n" +
                "The most striking feature of the Hibiscus Rosa-sinensis is its large, colorful flowers, which can reach up to 6 inches in diameter. The flowers have brilliant colors and are composed of five petals that are fused together to form a funnel-shaped bloom. The petals are slightly ruffled and have a texture that is velvety or smooth, depending on the cultivar. In the center of the flower, there is a long, protruding pistil surrounded by a ring of stamens. The flowers bloom throughout the year, although the peak blooming season is during the summer.\n" +
                "\n" +
                "The plant is easy to grow and is tolerant of a variety of soil types, although it prefers well-draining and fertile soil. It thrives in full sun or partial shade and requires regular watering to keep the soil moist. It is also relatively resistant to pests and diseases, although it may be susceptible to spider mites and aphids.\n" +
                "\n" +
                "In traditional medicine, Hibiscus Rosa-sinensis has been used to treat a range of ailments, including fever, hypertension, and respiratory problems. The plant's flowers are also used in cosmetic products, such as hair care and skin lotions. The plant has also been used in horticulture as an ornamental plant, and its flowers are often used in flower arrangements and bouquets.\"\n", "\"Jasmine or Jasminum is a genus of flowering plants in the olive family, Oleaceae. It comprises more than 200 species of evergreen or deciduous shrubs and vines, most of which are native to tropical and warm temperate regions of the world, particularly Southeast Asia, South Asia, and Africa.\n" +
                "\n" +
                "The Jasmine plant is known for its fragrant flowers, which are often used in perfumes and as essential oils. The leaves of the Jasmine plant are typically dark green, shiny, and oval shaped, and they grow on opposite sides of the stem. The flowers of the Jasmine plant are typically white or yellow and are tubular in shape. They grow in small clusters and have five to eight lobes. The flowers are highly fragrant and emit a sweet, floral scent that is widely recognized and beloved.\n" +
                "\n" +
                "Jasmine plants are often grown as ornamental plants in gardens and on balconies because of their attractive appearance, especially when they are blooming. They are commonly trained to grow along trellises or other types of support systems, and they can be grown as a climbing vine or a small shrub. The Jasmine plant requires plenty of sunlight and well-drained soil to thrive.\n" +
                "\n" +
                "There are several different species of Jasmine, including common Jasmine (Jasminum officinale), Arabian Jasmine (Jasminum sambac), and Italian Jasmine (Jasminum humile). Each species has its own unique characteristics, but all are loved for their fragrant flowers and attractive foliage. In some cultures, Jasmine is also considered to have medicinal properties, and it is used to treat a variety of ailments.\n" +
                "\n" +
                "In summary, Jasmine is a genus of flowering plants known for their fragrant flowers and attractive foliage. They are commonly used as ornamental plants and have cultural significance in some parts of the world. Despite being native to warmer regions of the world, they can be grown in a variety of climates and are valued for their versatility and beauty.\"\n", "\"Mangifera Indica, commonly known as Mango, is a fruit tree of the family Anacardiaceae, which grows up to 35-40 meters in height. The tree has a thick, grey-brown bark with deep vertical furrows. The leaves are long and pointed, measuring about 30-40 cm in length, and are usually reddish-brown when young, turning dark green as they mature.\n" +
                "\n" +
                "The Mango tree produces large, fragrant, colorful fruits that are fleshy and sweet. The fruit varies in shape, size, color, and taste depending on the variety. The Mango fruit is generally oval or round-shaped, with a length of 5-15 cm, and a weight of 300 gm to 2 kg. The Mango fruit is covered with a smooth, waxy skin that is green when unripe, and turns yellow or red as it ripens. The flesh of the Mango fruit is juicy, soft, and fibrous with a sweet, juicy flavor.\n" +
                "\n" +
                "The Mango tree is native to South Asia, but it is now widely cultivated in many tropical and subtropical regions of the world. The tree requires a hot, humid climate with well-distributed rainfall throughout the year for optimal growth and fruit production. The Mango tree flowers between December to January and fruits between June to September.\n" +
                "\n" +
                "Mangoes are a rich source of minerals such as potassium, magnesium, and calcium. They are also a good source of vitamins such as vitamin A, vitamin C, and vitamin E. The Mango fruit has numerous health benefits and is used in the treatment of many ailments such as fever, diarrhea, dysentery, and anemia.\n" +
                "\n" +
                "In conclusion, Mangifera Indica or Mango is a tropical fruit tree with large, juicy, sweet fruits that are enjoyed around the world. The tree requires a hot, humid climate for proper growth and is a rich source of minerals, vitamins, and other nutrients. The Mango fruit has many health benefits and is used in the treatment of various medical conditions.\"\n", "\"Mentha, commonly known as mint, is a genus of flowering plants in the family Lamiaceae, and it is native to Europe, Asia, Africa, and North America. The plants typically grow in wet, damp areas and are known for their strong, pleasant aroma and their various medicinal properties. They are characterized by square stems, opposite leaves, and small flowers in shades of white, pink, and purple.\n" +
                "\n" +
                "There are over 20 species of mentha, with several varieties of each species. Some of the most common types include peppermint (Mentha x piperita), spearmint (Mentha spicata), and pennyroyal (Mentha pulegium).\n" +
                "\n" +
                "Mint is widely cultivated and used for various purposes, including the production of essential oils for aromatherapy, perfumes, medicines, food flavoring, and as an ingredient in herbal teas. Its leaves, stems, and flowers are rich in essential oils, especially menthol, which gives mint its characteristic coolness and refreshing taste.\n" +
                "\n" +
                "Mint is also known for its medicinal properties, including its ability to relieve digestive disorders, reduce inflammation, and ease headaches. Its essential oils are also commonly used in aromatherapy to promote relaxation, reduce stress, and improve mood.\n" +
                "\n" +
                "Overall, the mentha plant is a versatile herb that is used for a wide range of purposes due to its strong, pleasant aroma, and its various medicinal benefits. It is an important component of many natural remedies and is valued for its soothing and calming effects.\"\n", "\"Moringa Oleifera is a fast-growing, small-to-medium-sized tree that is native to India and widely grown throughout the tropics. It is also known as Drumstick, Horseradish Tree, Ben Oil Tree, or Miracle Tree. It is a perennial plant that grows up to 10 meters in height and can live for up to 20 years.\n" +
                "\n" +
                "Moringa Oleifera has a slender, woody trunk, and light-green, oval-shaped leaves that are packed with nutrients. The tree produces long, slender, green pods that are about 1 foot long.\n" +
                "\n" +
                "The leaves, pods, flowers, and seeds of the Moringa Oleifera tree are all edible and are commonly used in many traditional Indian dishes. The leaves can be eaten fresh or dried, and are often used as a nutritional supplement to help combat malnutrition. The pods, also known as drumsticks, are often used in curries and stews.\n" +
                "\n" +
                "Moringa Oleifera is known for its high nutritional value. The leaves are a rich source of vitamins, minerals, and antioxidants. They are particularly high in vitamin C, calcium, potassium, and iron. The seeds contain a high amount of protein, and the oil extracted from the seeds is rich in essential fatty acids.\n" +
                "\n" +
                "The Moringa Oleifera tree is also used for medicinal purposes. The leaves and pods are used in traditional medicine to treat a range of ailments, including stomach ulcers, infections, diabetes, and hypertension.\n" +
                "\n" +
                "In addition to its nutritional and medicinal benefits, the Moringa Oleifera tree is also used for a range of other purposes. The wood of the tree is used for fuel, and the oil extracted from the seeds is used in cosmetics and for lubrication.\n" +
                "\n" +
                "Overall, Moringa Oleifera is a versatile and valuable plant that offers a range of nutritional, medicinal, and practical benefits.\"\n", "\"Muntingia Calabura, commonly known as Jamaica Cherry or Gasagase, is a fast-growing evergreen tree that belongs to the Muntingiaceae family. This species is native to Central and South America, but it can be found all across the tropics of the world. Jamaica Cherry can reach up to 10-15 meters in height, and its trunk usually has a diameter of 50 cm. \n" +
                "\n" +
                "The leaves of Jamaica Cherry are simple, alternate, and ovate, with a length of 5-15 cm and a width of 3-8 cm. They have a bright green color and are glabrous, glossy, and slightly serrated. This tree starts producing white, fragrant flowers when it is about two years old. The flowers are small (1 cm in diameter), have five petals, and usually appear in clusters of 6-12. \n" +
                "\n" +
                "Jamaica Cherry produces a small red fruit that looks like a cherry, which is why it is called Jamaica Cherry. The fruit measures about 1-2 cm in diameter, and it has a succulent pulp that tastes sweet with a hint of tartness. The fruit is rich in vitamin C, antioxidants, and fiber and has been used traditionally in many cultures as a natural remedy for various health issues. The seed of the fruit is very small, and the fruit is mostly eaten whole. \n" +
                "\n" +
                "The bark of Jamaica Cherry is smooth, thin, and grayish-brown in color, and when it gets damaged, it exudes a white sticky sap. The wood of the tree is brittle and not very durable, so it is not used for construction purposes. However, the tree has a lot of other uses: the leaves and fruit are used in traditional medicine, the fruit is consumed fresh or as a juice, and the tree provides shade and ornamental value. \n" +
                "\n" +
                "Overall, Muntingia Calabura is an important tree species that has a lot of cultural, traditional, and ecological significance. It is a valuable resource for human needs and plays an important role in maintaining the biodiversity of tropical ecosystems.\"\n", "\"Murraya Koenigii, commonly known as curry leaves, is a small, deciduous tree belonging to the Rutaceae family, which is known for its aromatic properties. It is native to South Asia and is widely cultivated in India, Sri Lanka, and other tropical regions. The tree grows up to a height of 5-6 meters and has a slender trunk with small branches that bear clusters of small, white flowers.\n" +
                "\n" +
                "The leaves of the curry tree are its most popular and widely used part. They are small, pinnate, and consist of 11-21 leaflets that are bright green and glossy. Curry leaves are highly aromatic with a distinctive, pungent scent that is similar to that of cumin and lemon. They are commonly used in Indian, Sri Lankan, and other Southeast Asian cuisines as a spice and a flavoring agent in numerous dishes such as curries, stir-fries, chutneys, and soups.\n" +
                "\n" +
                "Apart from its culinary uses, curry leaves are also known for their medicinal properties. They contain essential oils, flavonoids, and alkaloids that have powerful antioxidant and anti-inflammatory properties. They are believed to have numerous health benefits such as aiding digestion, reducing cholesterol levels, improving eyesight, and strengthening the immune system.\n" +
                "\n" +
                "In addition to its culinary and medicinal uses, curry leaves are also used for various other purposes such as in cosmetics, perfumes, and soaps. The essential oil extracted from curry leaves is widely used in aromatherapy and massage oils due to its rejuvenating and relaxing properties.\n" +
                "\n" +
                "In conclusion, Murraya Koenigii or curry leaves are a versatile tree that has numerous culinary, medicinal, and cosmetic uses. Its small and fragrant leaves are a popular spice in South Asian cuisines and are also known for their health benefits and aromatherapy properties.\"\n", "\"Nerium oleander, commonly known as oleander is a plant species belonging to the Dogbane family, Apocynaceae. The plant is native to the Mediterranean region and grows wild in several parts of Asia, Europe, and Africa. It is now widely cultivated in many parts of the world as an ornamental plant due to its attractive flowers which come in shades of pink, white, yellow, and red.\n" +
                "\n" +
                "The oleander plant grows as a shrub or small tree and can reach a height of 20 feet. It has an upright growth habit with branches forming a dense canopy. The leaves are narrow and elongated, measuring up to 12 cm long and 2 cm wide. They are leathery in texture, glossy, and dark green in color. The plant is evergreen in warm climates and deciduous in cooler areas.\n" +
                "\n" +
                "The flowers of the oleander are showy and fragrant, with five petals that form a funnel shape. The flowers grow in clusters at the tips of the branches and bloom from late spring to early fall. The color of the flowers varies depending on the cultivar and can be white, pink, red, or yellow. The flowers are followed by long, narrow seed pods that contain numerous seeds.\n" +
                "\n" +
                "While oleanders are prized for their beauty, they are also known to be extremely poisonous. All parts of the plant contain a potent cardiac glycoside, which can cause severe reactions if ingested. Even the smoke from burning plant material can be toxic if inhaled. Symptoms of poisoning include vomiting, diarrhea, irregular heartbeat, seizures, and in severe cases, death.\n" +
                "\n" +
                "Despite its toxic nature, oleander is still used in traditional medicine for its purported therapeutic benefits. Extracts from the plant have been used for centuries to treat a range of ailments, including heart disease, asthma, and cancer. However, modern medical research has found little evidence to support these claims, and the use of oleander as a medicinal herb is not recommended.\n" +
                "\n" +
                "In conclusion, Nerium Oleander, also known as oleander, is a beautiful but highly poisonous plant species that is valued for its ornamental properties. Its attractive flowers, foliage, and easy-going growing requirements have made it a popular landscaping choice in many parts of the world. However, it is important to exercise caution around this plant, as its toxic properties can pose a danger to humans, pets, and livestock.\"\n", "\"Nyctanthes arbor-tristis, commonly known as Parijata or night-flowering jasmine, is a species of flowering plant that belongs to the family Oleaceae. It is native to South Asia and Southeast Asia, where it can be found in India, Nepal, Bangladesh, Bhutan, Myanmar, Thailand, and Laos.\n" +
                "\n" +
                "The Parijata tree is a small, deciduous tree that grows up to 10 meters in height. It has a smooth, grayish-brown bark and a branching stem that is covered with small, oval-shaped leaves that are arranged opposite each other.\n" +
                "\n" +
                "The most distinctive feature of the Parijata is its flowers, which are delicately fragrant and bloom at night. The flowers are funnel-shaped with an elongated tube and five or six petals that range in color from white to orange-yellow. The flowers are borne in a cluster at the end of the branches and are about 2.5 to 3.5 cm in diameter.\n" +
                "\n" +
                "After blooming, the flowers produce a woody capsule that contains four to eight seeds that are shaped like a mini canoe. The seeds are used in traditional medicine for treating various ailments such as headache, fever, and rheumatism.\n" +
                "\n" +
                "Parijata is considered a sacred tree in Hindu mythology and is often associated with Lord Krishna. According to the legend, the tree was brought to earth from heaven by Lord Krishna's beloved, Satyabhama. It is believed that the flowers of the Parijata tree never touch the earth and are always in the hands of Lord Krishna.\n" +
                "\n" +
                "Parijata is a popular ornamental plant in tropical and subtropical regions, and it is often grown in gardens and parks. It prefers well-drained soil and requires moderate watering. The plant can be propagated by seeds, cuttings or layering.\n" +
                "\n" +
                "In addition to its ornamental value, Parijata has various applications in traditional medicine. The leaves, flowers, and bark of the tree are used to treat a variety of ailments, including fever, cough, asthma, and skin disorders. The plant is also used to prepare herbal remedies that improve digestion, stimulate the liver, and treat diabetes.\n" +
                "\n" +
                "Overall, Parijata is a beautiful and versatile tree that has significant cultural and medicinal value. Its fragrant, night-blooming flowers and rich history make it a fascinating and revered plant in South Asian folklore and culture.\"\n", "\"Ocimum Tenuiflorum, commonly known as tulsi or holy basil, is a herbaceous plant species belonging to the family Lamiaceae. It is an upright, bushy shrub that can grow up to 1 meter tall. The stems and leaves of the plant are purple or dark green in color and give off a strong, aromatic fragrance.\n" +
                "\n" +
                "The leaves of the tulsi plant are small, oval-shaped, and slightly toothed. They grow in pairs on opposite sides of the stem and have a smooth, glossy surface. The flowers of the plant are small and arranged in spikes that grow out of the leaf axils.\n" +
                "\n" +
                "Tulsi is native to India and is widely cultivated throughout Southeast Asia. It is considered a sacred plant in Hinduism and is often grown in the courtyards of Indian homes and temples. The plant is used extensively in Ayurvedic medicine for its many health benefits.\n" +
                "\n" +
                "Tulsi leaves contain essential oils, which give it its characteristic aroma, as well as many health-promoting compounds such as eugenol, camphor, and rosmarinic acid. It has anti-inflammatory and antioxidant properties, and is believed to help boost the immune system.\n" +
                "\n" +
                "The plant is also used in cooking, often as a flavoring in curries and other dishes. The leaves can be dried and used to make teas, which are believed to have many health benefits.\n" +
                "\n" +
                "Overall, tulsi is an important plant in Indian culture and has many uses in both traditional medicine and cooking. Its health benefits and pleasant aroma make it a popular choice for many people seeking natural remedies or flavorful additions to their meals.\"\n", "\"Piper betle, commonly known as betel or betel vine, is a perennial vine that belongs to the family Piperaceae. It is native to South and Southeast Asia and is widely cultivated in India, Thailand, Malaysia, Indonesia, and Vietnam. \n" +
                "\n" +
                "Appearance: The betel vine has smooth, green, and heart-shaped leaves that are clustered at the top of the stem. The leaves are leathery with a glossy surface and are about 6-12 cm long and 5-10 cm wide. The plant produces thin stems that can grow up to 10 meters long, with dark green leaves that are slightly paler on the undersides.\n" +
                "\n" +
                "Flowers: The betel vine produces tiny white flowers that bloom in clusters, and have a faint fragrance. The flowers grow in spikes that are about 4-7 cm long, and each spike has around ten individual flowers.\n" +
                "\n" +
                "Fruit: The betel vine produces small, greenish-brown fruits that are roughly 5 mm in diameter. The fruits are edible but quite bitter, and contain numerous small seeds.\n" +
                "\n" +
                "Cultivation: The betel vine is grown as a dioecious perennial plant, meaning it has separate male and female plants. To grow the plant, the stem cuttings or whole vine attainable are planted in well-draining soil, and the vines are supported by a pole or trellis. The plant thrives in moist, warm conditions and needs regular watering.\n" +
                "\n" +
                "Uses: Betel leaves are commonly chewed in Southeast Asia and India as a mild stimulant and for their refreshing taste. The leaves are wrapped around small pieces of areca nut, slaked lime or betelnut, and sometimes tobacco. The use of betel leaves is deeply ingrained in the cultural and social customs of Southeast Asia and India and is often offered as a symbol of hospitality. The leaves are also used as a medicine to treat various ailments such as coughs, colds, and bad breath. Additionally, betel leaves are used as a seasoning in cooking, particularly in Thai, Malaysian and Indonesian cuisine. \n" +
                "\n" +
                "In conclusion, Piper betle, or betel vine, is a tropical, perennial vine that is widely used in Southeast Asia and India for its stimulating and refreshing properties. The plant has a distinctive aroma and is valued for its cultural and medicinal uses.\"\n", "\"Plectranthus Amboinicus, also known as Mexican Mint or Cuban Oregano, is a perennial herb that belongs to the Lamiaceae family. It is native to Southern and Eastern Africa, Madagascar, and the Arabian Peninsula but has been cultivated extensively around the world for its medicinal benefits and culinary uses.\n" +
                "\n" +
                "This herb grows up to a height of 50 centimeters with large succulent green leaves that are slightly hairy and give off a pungent menthol aroma when crushed. Its leaves are oblong-shaped with a slightly toothed margin and measure 2 to 5 centimeters long and 1 to 3 centimeters wide. The plant produces small bluish-purple flowers that grow in clusters on thick and rigid spikes.\n" +
                "\n" +
                "The Mexican Mint thrives in full sunlight or partial shade and prefers well-drained soil that is slightly acidic. It is drought-tolerant and can withstand high temperatures, making it an ideal herb for arid regions. It is usually propagated through stem cuttings, which root easily and grow quickly.\n" +
                "\n" +
                "Mexican Mint has a wide range of culinary uses and is a popular herb in many cuisines, including Mexican, Caribbean, and Indian. Its leaves are used fresh or dried and can be added to soups, stews, salads, and meat dishes for flavor and aroma. It is also commonly used to make marinades, sauces, and salsas.\n" +
                "\n" +
                "Besides its culinary uses, Mexican Mint has several medicinal properties. It is used to treat various ailments, including respiratory infections, digestive disorders, and skin problems. The herb is also believed to possess anti-inflammatory, antibacterial, antifungal, and antiviral properties that help to boost immunity and fight infections.\n" +
                "\n" +
                "In conclusion, Plectranthus Amboinicus or Mexican Mint is a versatile herb that has many culinary and medicinal uses. Its succulent leaves, pungent aroma, and medicinal properties make it a valuable addition to any herb garden.\"\n", "\"Pongamia pinnata, also known as Indian Beech or Karanj, is a fast-growing, evergreen tree that can reach up to 15-25 meters in height. The tree is widely distributed in tropical and subtropical regions, ranging from Southeast Asia to Northern Australia. It typically grows in well-drained soils, including sandy, loamy, and rocky soils.\n" +
                "\n" +
                "The leaves of Pongamia pinnata are pinnately divided, with 6-9 pairs of leaflets. Each leaflet is lanceolate-shaped and measures around 7-15 cm in length and 2-3 cm in width. The tree produces small, white or pale pink flowers, which are arranged in pendulous racemes that can grow up to 25 cm long. The flowers bloom from April to August, depending on the locality.\n" +
                "\n" +
                "The fruit of Pongamia pinnata is a flat, woody pod that measures around 5-9 cm in length and 2-3 cm in width. It contains 1-5 oval-shaped seeds that are brownish-black in color and have a hard outer coat. The seeds are non-edible and contain a toxic compound called pongamol.\n" +
                "\n" +
                "Pongamia pinnata is an important source of fuel, wood, and medicine in many parts of the world. The wood is used for making furniture, tool handles, and agricultural implements. The oil extracted from the seeds is used as a substitute for diesel fuel, and it is also used in the production of soaps, candles, and varnishes. The seeds are used in traditional medicine to treat various ailments, including skin diseases, diarrhea, and respiratory infections.\n" +
                "\n" +
                "Overall, Pongamia pinnata is a valuable and versatile tree species that plays an important role in providing ecological, economic, and social benefits to many communities around the world.\"\n", "\"Psidium guajava, commonly known as guava, is a tropical evergreen plant and fruit that belongs to the myrtle family, Myrtaceae. The guava tree can grow up to 33 feet tall, with a trunk that is crooked and twisted. It has a smooth, brownish, and peeling bark, and produces leaves that are opposite, simple, and 2-6 inches long.\n" +
                "\n" +
                "The guava fruit is oval or round, ranging from 1.5 to 4 inches in length, and varies in color from green to yellow or pink, depending on the variety. The fruit has a thin, edible skin, juicy flesh, and small, hard seeds that are edible but also can be removed. The flavor of the guava fruit varies, from sweet to sour and tangy, but it is generally described as having a tropical aroma and flavor.\n" +
                "\n" +
                "Guava is native to Mexico, Central America, and the northern regions of South America. However, it is widely cultivated in tropical and subtropical regions worldwide. The fruit is commonly used in beverages, candies, and desserts, and is also eaten fresh. Guava is a rich source of vitamin C, fiber, and other essential nutrients, and has been traditionally used to treat a variety of health conditions, including diarrhea, dysentery, and respiratory infections.\n" +
                "\n" +
                "In addition to its culinary and medicinal uses, guava has also been used for several other purposes. The leaves of the guava tree have antimicrobial and anti-inflammatory properties and have been used to treat wounds and skin problems. The wood of the guava tree is durable and resistant to moisture, and is thus used for cabinet making and carpentry. The bark of the tree has also been used to make paper.\n" +
                "\n" +
                "Overall, Psidium guajava (guava) is a versatile and beneficial plant that has numerous culinary, medicinal, and other uses. Its sweet, tangy flavor and tropical aroma are beloved by many, and its health benefits make it a valuable addition to any diet.\"\n", "\"Punica Granatum, commonly known as Pomegranate, is a deciduous shrub or small tree that belongs to the Lythraceae family. It is native to areas of the Mediterranean, the Middle East, and Asia. Pomegranate is widely cultivated in tropical and subtropical regions for its fruits, which are considered superfoods due to their high nutritional value and health benefits. \n" +
                "\n" +
                "The plant grows up to 5-8m tall with a spiny, multi-branched stem and a narrow canopy of leaves. The leaves are glossy, lance-shaped, and about 3-8 cm long. The flowers are big, showy, and bell-shaped, with a diameter of about 3-5 cm. They are usually red or orange-red, but there are also white, pink, and yellow cultivars. The flowers are followed by a hard, leathery, and rounded fruit that is about the size of an apple. The fruit has a thick skin, and inside it is a distinctive membrane-encased cluster of seeds, covered in a spongy, juicy, edible flesh that ranges in color from pink to deep red.\n" +
                "\n" +
                "Pomegranate is considered as a valuable horticultural crop due to its medicinal and nutritional properties. The fruit is rich in fiber, vitamins (vitamin C and K), minerals (potassium), and antioxidants (flavonoids and polyphenols). It is often consumed fresh, juiced or as a supplement, and is also used to make jams, jellies, and sauces. The seeds of the fruit are also dried and ground into a powder to add flavor to various dishes. \n" +
                "\n" +
                "In addition to its nutritional value, the pomegranate has also been used in traditional medicine for its therapeutic properties. Studies have shown that pomegranate may have anti-inflammatory, anticancer, anti-Diabetic, and cardiovascular benefits, and may help boost the immune system and brain function. Overall, Punica Granatum (Pomegranate) is a beautiful, versatile, and fascinating plant that is valued for its fruit, leaves, flowers, and health benefits.\"\n", "\"Santalum album, commonly known as Sandalwood, is a small evergreen tree found in South Asia, particularly in India, Nepal, Bangladesh, Sri Lanka, Indonesia, and Australia. It is a slow-growing tree that can grow up to 40 feet tall, but the harvested trees are typically around 25-30 feet tall.\n" +
                "\n" +
                "The bark is rough and grayish-brown in color, and the leaves are oval-shaped and smooth, with a glossy finish. The flowers are small and white, while the fruit is a drupe that is red when ripe.\n" +
                "\n" +
                "Sandalwood is best known for its fragrant heartwood, which is a light yellowish-brown color with a distinct, sweet, woody aroma. This heartwood is extracted from the tree's roots and processed into a fragrant, essential oil that is used in perfumes, soaps, cosmetics, and as a flavoring agent. The wood is also prized for its durable, fine-grained and distinctive yellow color, which is used in furniture making and carving.\n" +
                "\n" +
                "Sandalwood has been used for medicinal purposes for centuries. It's been used as an antiseptic, diuretic, and astringent. It's also believed to have anti-inflammatory properties and is used in traditional Ayurvedic medicine to treat skin disorders, anxiety, and digestive issues.\n" +
                "\n" +
                "Sandalwood is a valuable and highly sought-after commodity, with illegal logging and over-harvesting leading to a decline in the species' population in some areas. In response, the Indian government has established protected areas for Santalum album in southern India, where the tree is considered sacred in Hindu culture. Conservation efforts are underway to sustainably manage the remaining Sandalwood populations and to protect this valuable natural resource.\"\n", "\"Syzygium Cumini, commonly known as Jamun or Indian blackberry, is a tropical fruiting tree that belongs to the flowering plant family Myrtaceae. The tree is native to India, Bangladesh, and Indonesia and is widely cultivated in various tropical and subtropical regions of the world. \n" +
                "\n" +
                "Description:\n" +
                "The Syzygium Cumini tree typically grows up to 30 meters tall, with a dense, spreading canopy. The leaves are smooth, glossy, and oval-shaped, measuring up to 10 cm in length. The foliage is generally dark green, but the new growth can be a bronze color. Flowers are small and white, clustered together, and are followed by fruits. \n" +
                "\n" +
                "Fruit:\n" +
                "The fruit of the Syzygium Cumini tree, Jamun, is an oblong berry with a greenish-black outer skin and a juicy, sweet, purple pulp. The fruit is approximately 2.5 to 4 centimeters in diameter and may have a single seed or more. The interior of the fruit is relatively soft and contains a few small, bitter seeds. The fruit has a pleasant taste and is nutritious, containing carbohydrates, protein, iron, and vitamins.\n" +
                "\n" +
                "Medicinal benefits:\n" +
                "Syzygium Cumini has been shown to have several health benefits. The fruit and bark of the plant are used in Ayurveda to treat various ailments, including digestive problems, respiratory infections, and skin diseases. The fruit is known to have a low glycemic index, making it beneficial for people with diabetes. Studies have also shown that the fruit has antidiabetic and antioxidant properties, making it useful in the management of diabetes and preventing oxidative stress.\n" +
                "\n" +
                "In conclusion, the Syzygium Cumini (Jamun) is a fruiting tree that produces juicy, oblong berries with a greenish-black outer skin and a sweet, purple pulp. The tree is native to India, Bangladesh, and Indonesia and is widely cultivated in tropical and subtropical regions. The fruit is nutritious and has several health benefits, including antidiabetic and antioxidant properties.\"\n", "\"Syzygium Jambos, commonly known as Rose Apple, is a tropical fruit tree that belongs to the Myrtaceae family. It is native to Southeast Asia but is cultivated in other tropical regions like India, Malaysia, and Brazil. The tree can grow up to 12 meters tall, has a dense canopy with glossy green leaves, and produces an abundance of flowers.\n" +
                "\n" +
                "The Rose Apple fruit is spherical or oblong-shaped and is about 5-10 cm in diameter. When the fruit is ripe, the skin is thin and delicate, and the color ranges from pale yellow to crimson red. The flesh is firm, juicy, and ranges from crisp to soft depending on the level of ripeness. It is often described as having a mild, sweet fragrance resembling that of roses, hence the name Rose Apple.\n" +
                "\n" +
                "The fruit has a distinctive flavor that is similar to that of an apple with hints of pear, guava, and lychee. The flavor is subtle but delicious, making it a popular fruit in many tropical cuisines. The fruit can be eaten fresh or cooked, and it is commonly used in salads, jams, and desserts.\n" +
                "\n" +
                "The Rose Apple tree is also used for its medicinal properties. The leaves, bark, and fruit contain essential oils, flavonoids, and phenolic compounds that have anti-inflammatory, antimicrobial, and antioxidant properties. The leaves are used to treat hypertension, diabetes, and diarrhea, while the bark is used as an astringent.\n" +
                "\n" +
                "In conclusion, the Rose Apple is a versatile tropical fruit that is widely cultivated for its delicious and subtly fragrant flavor, and for its many medicinal properties.\"\n", "\"Tabernaemontana Divaricata, commonly known as Crape Jasmine or Pinwheel flower, is a species of shrub belonging to the Apocynaceae family. It is native to Southeast Asia, particularly India, and is commonly found in home gardens, parks and along roadsides.\n" +
                "\n" +
                "Crape Jasmine has a compact and bushy growth habit and can grow up to a height of 3 meters. It has smooth, narrow, and bright green leaves that are about 10 to 20 cm long and 3 to 6 cm wide. The leaves grow in opposite pairs on the stem and have prominent veins on the lower surface.\n" +
                "\n" +
                "The plant bears fragrant, white, and star-shaped flowers, which measure around 3.8-5 cm in diameter. The flowers have five petals, each petal being curled upwards at the edge, which gives them a pinwheel-like appearance. The flowers bloom throughout the year, but they are particularly abundant in summer and autumn.\n" +
                "\n" +
                "The fruit of Tabernaemontana Divaricata is a long and narrow capsule. When the fruit mature, they split open to reveal numerous tiny, brownish-red seeds that are dispersed by the wind.\n" +
                "\n" +
                "Crape Jasmine is a popular ornamental plant grown for its beautiful and fragrant flowers. It is easy to grow and can tolerate a wide range of soil and weather conditions. In traditional medicine, various parts of the plant are used to treat a range of ailments, including fever, inflammation, and snake bites.\n" +
                "\n" +
                "However, it should be noted that the plant is toxic if ingested and can cause severe gastrointestinal distress. It is essential to keep the plant away from children and pets.\"\n", "\"Trigonella Foenum-graecum, commonly known as Fenugreek, is an annual herb belonging to the family Fabaceae. It is native to the Mediterranean region, southern Europe, and western Asia. Fenugreek is widely cultivated in many parts of the world, especially in India, Egypt, and Morocco.\n" +
                "\n" +
                "Fenugreek reaches a height of 30-60 cm and has a green stem with a strong, appealing aroma. The leaves appear alternately on the stem, and they are trifoliate, with each leaflet measuring 2-5 cm in length. Fenugreek flowers are small and white, developing into long slender pods that contain brownish-yellow seeds.\n" +
                "\n" +
                "Fenugreek seeds have been used for medicinal and culinary purposes for centuries, and they are packed with many nutrients such as protein, fiber, vitamins, and minerals. The seeds also have a unique chemical composition that includes saponins, flavonoids, and alkaloids, which are responsible for their potent health benefits.\n" +
                "\n" +
                "Fenugreek seeds have a bitter-sweet flavor and are commonly used as a spice in many dishes in India, the Middle East, and North Africa. They are used in curries, stews, and pickles, as well as in bread, pastries, and confectionery. The seeds can also be boiled in water to make a herbal tea, which is known to have several health benefits.\n" +
                "\n" +
                "In traditional medicine, Fenugreek seeds have been used for various ailments such as digestive problems, menstrual cramps, and diabetes. Studies suggest that Fenugreek seeds may help control blood sugar levels, reduce inflammation, and improve digestion.\n" +
                "\n" +
                "In conclusion, Fenugreek is a highly valued herb that has culinary and medicinal uses. Its seeds are packed with nutrients and have potent health benefits. Its use in traditional medicine has been validated by scientific research. Fenugreek continues to be an essential ingredient in many dishes globally, and its popularity is on the rise.\"\n"};

        textView = findViewById(R.id.scrollable_text_view);
        Intent intent = getIntent();
        if (intent != null) {
            int data = intent.getIntExtra("key", -1);
            textView.setText(description[data]);
        }

    }
}