package com.example.thegoldenrecipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class Asweetspage extends AppCompatActivity implements View.OnClickListener{

    private RecyclerView a_s_datalist;
    private List<Sweets_A> sweetsA;
    private A_S_adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asweetspage);




        sweetsA = new ArrayList<>();

        adapter = new A_S_adapter(this, new RecycleViewOnClickItem() {
            @Override
            public void OnItemClick(int position) { details3(position);}


        }, sweetsA);

        a_s_datalist = findViewById(R.id.a_s_datalist);
        Sweets_A food1 = new Sweets_A(R.drawable.umm_ali,  "Video link\n" +
                "https://youtu.be/2zpxAjpJL1o\n"+
                "\n" +
                "\n" +
                "\n" +
                "INGREDIENTS\n" +
                "•\t500 g/1lb palmiers (also known as lunettes), storebought or homemade*\n" +
                "•\t1 liter/1 quart (4 1/4 cups) full fat milk, preferably organic buffalo*\n" +
                "•\t1/2 cup (100g) granulated sugar\n" +
                "•\t250g/8oz (1 cup) fresh eshta balady (country-style clotted cream) or 1 cup heavy whipping cream, (whipped to medium peaks)\n" +
                "OPTIONAL ASSORTED NUTS OF YOUR CHOICE (TO SERVE ON THE SIDE OR TO INCORPORATE INTO THE DESSERT) L USED:\n" +
                "•\t1/2 cup (57g) toasted hazelnuts, coarsely chopped\n" +
                "•\t1/2 cup (57g) pistachios, coarsely chopped\n" +
                "•\t1/2 cup (75g) raisins\n" +
                "•\t1/4 cup (20g) shredded coconut\n" +
                "\n" +
                "\n" +
                "INSTRUCTIONS\n" +
                "You could either use a baking dish around the dimensions of 9X13 inches or 2 quart deep dish (buram) for this recipe. However, I've found that unlike the deep dish used in the pictures, a shallower rectangle or oval dish produces much better texture. The larger surface area of the wide, shallow dish allows for a greater amount of browning and crunch on top, which ensures crispy, caramelized bites with every mouthful.\n" +
                "1.\tAdjust the oven rack to medium position and preheat the oven's broiler to 200C/390F.\n" +
                "2.\tIn an oven safe baking dish, break in half 3/4 of the amount of palmiers, and arrange in layers. Set aside the remaining 1/4 of the palmiers. Add in the nuts, if using. I prefer to serve it on the side as not everyone likes nuts.\n" +
                "3.\tIn a medium saucepan, over medium-hight heat, stir together the milk and sugar, until the sugar dissolves, then bring to a boil.\n" +
                "4.\tPour the boiling milk mixture over the palmiers.\n" +
                "5.\tUse the reserved 1/4 amount of palmers to top the surface of the milk-soaked palmiers. This will create an extra crunchy topping.\n" +
                "6.\tDot the surface of the dish with spoons of eshta. No need to spread it. If using whipped cream, evenly spread it all over to cover the entire surface of the dish.\n" +
                "7.\tPlace the dish under the oven's broiler until bubbling around the edges and the top turns golden brown; about 10 minutes. Keep a close eye over it as it might brown in less time.\n" +
                "8.\tServe right away, hot with assorted nuts on the side (if you haven't already added them in the dessert before baking)\n" +
                "\n" +
                "\n" +
                "\n" ,"Umm Ali",R.drawable.ing_umm_ali,R.drawable.orange);
        Sweets_A food2 = new Sweets_A(R.drawable.kunafa, "Video link\n" +
                "\n" +
                "https://youtu.be/09WqwH4aiHY\n"+
                "\n" +
                "INGREDIENTS\n" +
                "•\t FOR THE SYRUP\n" +
                "•\t Condensed milk- ½ can ( 400 gm)\n" +
                "•\t FOR THE KUNAFA FILLING\n" +
                "•\t Full fat milk-¾ cup\n" +
                "•\t Heavy cream- 1 ¾ cup\n" +
                "•\t Sugar- 1 ½ tbsp.\n" +
                "•\t Cornstarch -2 tbsp.\n" +
                "•\t FOR KUNAFA CRUST\n" +
                "•\t Semi-frozen Kunafa dough( shredded phyllo pastry)- 250 gm or 0.5 lbs\n" +
                "•\t Unsalted butter/ Ghee( melted, room temperature)-½ cup\n" +
                "INSTRUCTIONS\n" +
                "1.\tPreheat your oven to 180 C/ 356 F with the rack on the bottom of the oven.\n" +
                "2.\tKunafa crust. Coat your 22 cm/ 9 inch baking tray with some butter/ghee.\n" +
                "3.\tShred semi-frozen kunafa dough into 1.5 inch/ 4 cm long pieces over a large bowl. Add the remaining butter and mix with kunafa shreds to coat evenly. Transfer half of the dough to the tray and press firmly ,lining sides of the tray so it will hold the cream filling and prevent it from burning.\n" +
                "4.\tMaking cream filling. In a medium saucepan heat milk and heavy cream; then add sugar and cornstarch and whisk until completely dissolved over medium heat. Bring to a boil, stirring constantly. Boil until the mixture thickens. Remove from the stove and pour over the crust, spread with a spatula.\n" +
                "5.\tTop with the remaining kunafa shreds evenly and bake 30-40 minutes or until golden.\n" +
                "6.\tRemove kunafa from the oven and pour condensed milk, covering the entire surface. You might not need the whole can.\n" +
                "7.\tGarnish with ground pistachio.\n" +
                "8.\tAllow kunafa rest for 10-15 min to absorb the condensed milk.\n" +
                "9.\tServe warm.\n" +
                "\n" +
                "\n" , "Kunafa", R.drawable.ing_kunafa,R.drawable.orange);
        Sweets_A food3 = new Sweets_A(R.drawable.luqaymat, "Video link\n" +
                "https://youtu.be/OfJskHbsjpg\n"+
                "  \n" +
                "INGREDIENTS\n" +
                "  \n" +
                "•\t1 cup all purpose flour\n" +
                "•\t½ tsp instant yeast\n" +
                "•\t½ cup milk powder\n" +
                "•\t2 tbsp sugar\n" +
                "•\t½ tsp cardamom powder\n" +
                "•\tpinch of saffron\n" +
                "•\tlukewarm water as needed approximately 1/3 cup\n" +
                "•\toil for deep frying\n" +
                "•\t1/2 cup date syrup or more for dressing\n" +
                "•\t1 tbsp sesame seeds for spinkling\n" +
                "INSTRUCTIONS\n" +
                " \n" +
                "1.\tAdd all purpose flour, yeast, milk powder, sugar, cardamom powder and saffron in a bowl and mix well.\n" +
                "2.\tSlowly add water while gently mixing with your hand to get a sticky batter. The batter will be more like a dough than batter. More like a thick medu vada batter.\n" +
                "3.\tCover with a muslin cloth and allow to rest for a couple of hours in a warm place till it has doubled in size\n" +
                "4.\tHeat oil and drop the batter by spoonful. (Dipping the spoon in water in between prevents the batter from sticking to the spoon and makes it easier to drop. Alternatively you can drop the batter in a zip lock bag. Cut out the corner of the bag and push to get a small ball of the batter in your hand. Drop this ball immediately in oil. You can dip your hand in water to avoid sticking.)\n" +
                "5.\tRoll the dropped balls with a slotted spoon in oil for even cooking. Fry till they are dark golden brown in color. Remove from oi and place on a kitchen towel.\n" +
                "6.\tPlace them in a serving bowl and pour the date syrup on top, sprinkle with sesame seeds.\n" +
                "7.\tRelish while still warm.\n" +
                "\n" +
                "\n" ,"Luqayamt",R.drawable.ing_luqaymat,R.drawable.orange);
        Sweets_A food4 = new Sweets_A(R.drawable.aishelsaray,  "Video link\n" +
                "https://youtu.be/8jqodZs0dz8\n"+
                "\n" +
                        "\n" +
                "Ingredients\n" +
                "Ingredients for Sugar Syrup\n" +
                "•\t1 cup Sugar\n" +
                "•\t1 tablespoons Orange Zest (Rind)\n" +
                "•\t1 tablespoon Rose water\n" +
                "•\t1 tablespoon Lemon juice\n" +
                "•\t1 cup Water\n" +
                "Ingredients for Custard\n" +
                "•\t500 ml Milk\n" +
                "•\t400 grams Condensed Milk , (1 400 gram tin)\n" +
                "•\t300 ml Fresh cream\n" +
                "•\t2 tablespoons Rose water\n" +
                "•\t2 tablespoons Orange Zest (Rind)\n" +
                "•\t6 tablespoons Corn flour\n" +
                "•\t30 Bread rusks , (enough to double line the dish you will be setting the dessert in)\n" +
                "•\t1/4 cup Pistachios , chopped\n" +
                "\n" +
                "\n" +
                "How to make Aish el Saraya Recipe - Lebanese Bread Pudding | Middle Eastern Dessert\n" +
                "1.\tTo begin making the Aish el Saraya Recipe, place toasted bread rusks evenly in a square dish.\n" +
                "2.\tThen make the syrup- mix sugar, water, lemon together and place over medium heat. Once its hot and the sugar has melted, mix the orange blossom and rose water into the syrup.  Allow it to cool slightly.\n" +
                "3.\tNow pour the warm syrup over the bread rusk so that it soaks it in. Layer another layer of the rusk and pour the syrup over the rusks until all of them get soaked it. Push the rusks around to settle itself well at the bottom and layer itself well. \n" +
                "4.\tTo make the custard for the Aish el Saraya Recipe, combine together milk, cream, condensed milk and cornflour in a heavy bottomed saucepan and place over medium heat.\n" +
                "5.\tKeep stirring the custard mixture until until thick and creamy; once the custard has thickened add rose water and orange blossom.\n" +
                "6.\tStir for a little more while and when the custard has reached a “THICK” pouring consistency. Allow the custard mixture to become lukewarm and then pour over the soaked bread rusks. The Aish el Saraya Recipe is now ready except that it needs refrigeration.\n" +
                "7.\tOnce the Aish el Saraya reaches room temperature, sprinkle the chopped pistachios over on the top of dessert. Cover the Aish el Saraya with a cling wrap and place in the refrigerator to cool for a minimum of 4 hours.\n" +
                "8.\tServe the Aish el Saraya as an eggless dessert after a meal of Lebanese Fattoush Salad Recipe and Beetroot Falafel With Pita Bread Recipe. \n" +
                "\n" +
                "\n" +
                "\n" ,"Aish al Saraya", R.drawable.ing_aishalsaraya,R.drawable.orange);
        Sweets_A food5 = new Sweets_A(R.drawable.balahelsham,
                "Video link\n" +
                        "https://youtu.be/tPHVW4nMKZE\n"+
                "\n" +
                "Ingredients\n" +
                "•\t 3 cups water, divided\n" +
                "•\t 2 cups white sugar, divided\n" +
                "•\t 1 lime, juiced\n" +
                "•\t 2 teaspoons vanilla extract, divided\n" +
                "•\t 2 ½ cups vegetable oil\n" +
                "•\t ½ teaspoon salt\n" +
                "•\t 1 cup all-purpose flour\n" +
                "•\t 4 eggs\n" +
                "•\t 2 cups corn oil\n" +
                "Directions\n" +
                "Instructions Checklist\n" +
                "•\t Step 1\n" +
                "Combine 1 cup water and 1 cup sugar in a saucepan over high heat. Bring to a boil; stir until sugar dissolves. Reduce heat to medium; add lime juice. Simmer until flavors combine, about 10 minutes. Remove from heat. Stir 1 teaspoon vanilla extract into the syrup; let cool.\n" +
                "•\t Step 2\n" +
                "Stir 2 cups water, 1 cup sugar, vegetable oil, and salt together in a pot over medium-high heat; bring to a boil. Reduce heat to medium. Add flour; stir vigorously with a wooden spoon until batter forms into a ball. Cook until batter is shiny, about 1 minute. Transfer to a bowl; allow to cool, about 5 minutes.\n" +
                "•\t Step 3\n" +
                "Flatten batter into the bottom of the bowl. Add eggs, 1 at a time, mixing well after each addition. Stir in remaining 1 teaspoon vanilla extract; mix until batter is creamy. Pour into a cloth piping bag fitted with a large star tip.\n" +
                "•\t Step 4\n" +
                "Heat corn oil in a deep saucepan over medium heat until bubbly; reduce heat to medium-low. Squeeze 2 inches of batter onto an oiled spatula and lower into the hot oil; repeat until saucepan is full. Cook, turning occasionally, until golden brown, about 5 minutes. Transfer pastries to a paper bag to drain, about 30 seconds.\n" +
                "•\t Step 5\n" +
                "Soak hot pastries in syrup; transfer to a plate to cool, about 5 minutes.\n" +
                "\n" ,"Balah al Sham", R.drawable.ing_balahalsham, R.drawable.orange);
        Sweets_A food6 = new Sweets_A(R.drawable.basboosa,   "Video link\n" +
                "https://youtu.be/GNTg6lrONU8\n"+
                "\n" +
                "Ingredients\n" +
                "•\t ▢1 2/3 cup (306g) Farina.\n" +
                "•\t ▢1/2 cup ghee.\n" +
                "•\t ▢1 Tablespoon honey.\n" +
                "•\t ▢1/2 cup (116g) sugar.\n" +
                "•\t ▢1/2 cup (97g) plain yogurt.\n" +
                "•\t ▢1/2 Tablespoon (6g) baking powder.\n" +
                "•\t ▢1/2 cup (45g) unsweetened coconut flakes finely shredded. Note1\n" +
                "•\t ▢0.5 Tablespoon tahini. plus 1 Tablespoon ghee to brush the bottom.\n" +
                "For the syrup:\n" +
                "•\t ▢1 cup sugar.\n" +
                "•\t ▢1 cup water.\n" +
                "•\t ▢1 teaspoon lemon juice.\n" +
                "•\t ▢2 Tablespoon honey.\n" +
                "•\t ▢1/2 teaspoon vanilla extract. Note2\n" +
                "•\t ▢Nuts for garnishing Note3\n" +
                "Make the cake:\n" +
                "1.\tIn a deep bowl, combine farina, baking powder, sugar and coconut then mix well.\n" +
                "2.\tMelt the ghee in the microwave or stove top then dissolve the honey in it.\n" +
                "3.\tAdd the ghee mixture to the bowl of dry ingredients and mix well to combine.\n" +
                "4.\tAdd the yogurt and mix, just until everything is well incorporated.\n" +
                "5.\tBrush a round 12 inch baking sheet with the tahini and spread the basbousa mixture evenly.\n" +
                "6.\tSpread nuts on top evenly to decorate.\n" +
                "1.\tBake in the middle of your oven until edges start to brown, this took about 10 minutes. Then move the basbousa up to the higher shelf and let it continue cooking until golden brown will take anywhere from 15 to 20 minutes.\n" +
                "Make the syrup:\n" +
                "1.\tWhen you move the basbousa to the upper shelf start making the syrup.\n" +
                "2.\tIn a small saucepan over medium heat, combine syrup ingredients and bring to a boil.\n" +
                "3.\tWhen it boils, reduce heat and simmer for 10 minutes.\n" +
                "4.\tTurn heat off and keep the syrup warm.\n" +
                "5.\tWhen basbousa is done, turn off your oven and take it out.\n" +
                "6.\tPour the syrup evenly and cover the basbousa immediately with foil. Return to the TURNED OFF oven for 5-10 minutes.\n" +
                "7.\tTake it \n" +
                "\n" ,"Basboosa",R.drawable.ing_basboosa,R.drawable.orange);
        Sweets_A food7 = new Sweets_A(R.drawable.ghouraybeh,  "Video link \n" +
                "https://youtu.be/0msyxX_vwv8\n"+
                "\n" +
                "Ingredients\n" +
                "•\t ▢60 grams powdered sugar but this depends on how sweet do you like them, if you in general like sweet cookies, then add 40 more grams\n" +
                "•\t ▢125 grams ghee/butter\n" +
                "•\t ▢250 grams all purpose flour\n" +
                "•\t ▢pistachios\n" +
                "Instructions\n" +
                "1.\tFirst you need to mix the ghee/butter with the powdered sugar by hand. Then add the flour to the mixture and mix until it’s well combined. The dough should be nice and soft and should not stick to your hands.\n" +
                "2.\tPlace the dough ball into a bowl, cover with a plastic wrap, and refrigerate for about 1 hour.\n" +
                "3.\tAfter you take it out of the refrigerator, let it rest for 15 minutes. Gently knead the dough for a few seconds and start shaping dough balls (each should approximately weight about 6 grams), place it on wax paper on a baking tray, flatten it using your hand and press a pistachio into each cookie.\n" +
                "4.\tBake in a preheated oven at 150c for 10-15 minutes (but this depends on what kind of oven do you use, when done the bottom of the cookies should be golden in colour but be careful as these cookies burn very easily).\n" +
                "5.\tMake sure you give the cookies enough time to cool down because they’re very delicate and are easy to break.\n" +
                "\n" +
                "\n" +
                "\n" , "Ghoraybeh", R.drawable.ing_ghouraybeh, R.drawable.orange);
        Sweets_A food8 = new Sweets_A(R.drawable.halwa_bahraini, "Video link\n" +
                "https://youtu.be/AFAlxSZ83to\n"+
                "\n" +
                "Ingredients\n" +
                "•\t4 cups sugar\n" +
                "•\t5 cups water\n" +
                "•\t4 teaspoons lemon juice\n" +
                "•\t5 tablespoons unsalted butter\n" +
                "•\t2 tablespoons ground cardamom + ½ teaspoon (for the butter)\n" +
                "•\t1 tablespoon ground nutmeg + ½ teaspoon (for the butter)\n" +
                "•\t10 threads saffron\n" +
                "•\t1 cup cornstarch\n" +
                "•\t1 cup water (for the corn starch mixture)\n" +
                "•\t1 teaspoon red food coloring\n" +
                "•\t1½ cup rapeseed oil\n" +
                "•\t2 tablespoons rose water\n" +
                "•\t2 cups nuts (pistachios, almonds, walnuts, toasted)\n" +
                "•\t3 tablespoons sesame seeds\n" +
                "Instructions\n" +
                "1.\tInfuse the saffron in 1 to 2 tablespoons of boiling water for at least 1 hour.\n" +
                "Flavored brown butter\n" +
                "1.\tPut the butter in a hot skillet over medium heat. Brown for 3 minutes.\n" +
                "2.\tRemove butter from heat. Strain.\n" +
                "3.\tStir in cardamom and nutmeg. Infuse.\n" +
                "Halwa\n" +
                "1.\tCombine cornstarch, rose water, food coloring and 1 cup (250 ml) of water. Beat vigorously to remove any lumps.\n" +
                "2.\tIn a very large pot, pour sugar, water, infused saffron and lemon juice and bring to a boil over medium to high heat.\n" +
                "3.\tStir the cornstarch mixture while stirring.\n" +
                "4.\tAt this point, the total cooking time is 45 minutes.\n" +
                "5.\tCover to prevent splattering and cook for 5 minutes.\n" +
                "6.\tAfter 5 minutes, add the rapeseed oil gradually and mix well. Cover and cook 5 more minutes. Then uncover and stir every 5 minutes.\n" +
                "7.\t30 minutes after adding the cornstarch mixture, add the cardamom and nutmeg. Mix well.\n" +
                "8.\tStir in circular motion continuously for remaining 15 minutes. Large bubbles will form.\n" +
                "9.\tRemove excess oil with a ladle and add the brown butter. The butter must be added during the last 5 minutes.\n" +
                "10.\tStir in nuts and mix well. Remove from heat.\n" +
                "11.\tSprinkle with white sesame seeds and dried fruits.\n" +
                "12.\tThe total cooking time is 45 minutes or when the temperature of the halwa reaches 230 F (110˚C).\n" +
                "13.\tThe end result should not be sticky. Its consistency should be soft and a little chewy.\n" +
                "\n" +
                "\n" , "Bahraini halwa ", R.drawable.ing_halwa_bahraini, R.drawable.orange);
        Sweets_A food9 = new Sweets_A(R.drawable.maamoul, "Video link\n" +
                "https://youtu.be/tMcDJKhp2IU\n"+
                "\n" +
                "Ingredients\n" +
                "Dough\n" +
                "•\t ▢½ cup ghee or butter, grass fed\n" +
                "•\t ▢¼ cup light olive oil or butter/ghee\n" +
                "•\t ▢2 ½ cups all purpose flour (may use half whole wheat pastry flour)\n" +
                "•\t ▢2 tablespoons sugar\n" +
                "•\t ▢2 tablespoons rose water or orange flower water\n" +
                "•\t ▢3 tablespoons milk (start with 2 and add as needed)\n" +
                "Date filling\n" +
                "•\t ▢⅔ lb dates medjool, soft, pitted, chopped (or ready made date paste)\n" +
                "Dusting (optional)\n" +
                "•\t ▢confectioner's sugar\n" +
                "•\t ▢almond flour\n" +
                "Instructions\n" +
                "1.\tPreheat the oven to 350°F.\n" +
                "Preparation of the dough\n" +
                "1.\tMelt the butter or ghee. Add oil and then mix in the sugar.\n" +
                "2.\tIn a large mixing bowl, combine the ghee/sugar mixture with flour, working them together with your fingers.\n" +
                "Tip: Use odorless oil or only butter or ghee. Add as much flour as the butter/oil mixture will absorb and that usually varies from 2 ¼ to 2 ½ cups\n" +
                "3.\tThen add the rose water and mix it in. Next add the milk, one tablespoon at a time. Then knead it all into a pliable dough.\n" +
                "4.\tWhen you add the milk, sometimes it might look like there is too much milk and the dough is sticky. But when you keep mixing it in, the milk gets absorbed.\n" +
                "5.\tLet the dough rest for a 30 minutes. Then roll out 32 portions of the dough into smooth balls. I find this easier because all my cookies more or less turn out the same size.\n" +
                "Preparation of the date filling\n" +
                "1.\tProcess the chopped medjool dates in a food processor into a smooth mass. If not using soft medjool dates, check the notes section.\n" +
                "2.\tDivide the date mass into 32 portions and roll them into smooth balls. Use oil or safe food prep gloves if needed, as the date mass can be sticky.\n" +
                "Shaping of the date filled cookies\n" +
                "1.\tTake a dough ball and flatten it. Hold it in the center of your palm and cup it. Place a date ball in the center. Bring the edges of the dough together. Pinch the dough to seal well and then flatten it out. Press it into a disc.Tip: Make sure to not use too much filling, or the cookies will crack.\n" +
                "2.\tUse a nut pick or fork to create interesting patterns. Or press the date filled cookie dough into a traditional maamoul mold and gently press to get the pattern on the cookie.\n" +
                "3.\tInvert and tap the front edge of the mold onto a hard surface like a kitchen counter, and hold your palm under the mold to get the cookie that is released from the mold.\n" +
                "Using a traditional Maamoul mold\n" +
                "1.\tAlternatively, a maamoul mold may be used to shape the cookies. In this case, a portion of the dough is first pressed into the mold. Then the date filling is layered on top of the dough.\n" +
                "2.\tNext, another portion of the dough is layered over the date filling and smoothened out.\n" +
                "3.\tTap the front edge of the mold on a hard surface like a kitchen counter, and hold your palm under the mold to get the cookie that is released from the mold.\n" +
                "4.\tSometimes I find that this method may not work out too well for all. As it may be difficult to release the cookie dough out of the mold. Sprinkling a little bit of flour into the mold prior to using it may help release the cookie better. Or laying a piece of plastic wrap into the mold prior to packing it with the cookie dough and the filling may help too.\n" +
                "5.\tBut my preferred method is to make the cookie by hand and then pressing it gently into the mold to create the pattern. It is not traditional to use the mold this way, but it works better and speeds up the process.\n" +
                "Baking the Maamoul cookies\n" +
                "1.\tPlace the Maamoul cookies, smooth side up (for hand shaped cookies) or the patterned side (for cookies made with the mold), on a large baking sheet.\n" +
                "2.\tMake sure to space them one to two inches apart. Bake for 15 to 20 minutes. Do not let the cookies over bake or turn too brown.\n" +
                "3.\tWell baked cookies will appear dry on the surface unlike the moist look of raw dough. Also, they will have a light tan.\n" +
                "4.\tCool the well-baked Maamoul completely on a wire rack. Using a sieve dust some confectioner's sugar or a combination of the sugar with some almond meal. Store the Maamoul cookies in an airtight container.\n" +
                "\n" +
                "\n" ,"Ma'amoul", R.drawable.ing_maamoul, R.drawable.orange);
                Sweets_A food10 = new Sweets_A(R.drawable.muhalabieh, "Video link \n" +
                        "https://youtu.be/UKvFZUl0npw\n"+
                        "\n" +
                        "Ingredients\n" +
                        "•\t1 litre Almond milk or your preferred plant milk\n" +
                        "•\t½ cup Rice flour or cornflour (corn starch)\n" +
                        "•\t½ cup Raw sugar up to ¾ cup\n" +
                        "•\t1 pinch Mastic crushed and powdered (optional)\n" +
                        "•\t1 teaspoon Orange blossom water or up to a tbsp\n" +
                        "•\t1 teaspoon Rose water or up to a tbsp\n" +
                        "•\t1 Pisacchio crushed - for garnish\n" +
                        "•\t1 Rose Petals dried - for garnish (optional)\n" +
                        "Instructions\n" +
                        "1.\tAdd almond milk and rice flour to a pot and combine whilst cold.\n" +
                        "Over med-high heat bring milk and rice content to a simmer and add raw sugar, stir continuously until all the sugar has dissolved. Once thickened, turn off heat and add mastic, stir for 30 seconds. Then add orange blossom and rose water, stir through for a minute.\n" +
                        "Transfer to individual serving cups and cool to room temp. Refrigerate for an hour at least. Garnish with rose petals, crushed pistachio or cinnamon. Serve cold. \n" +
                        "\n" ,"Muhalabia",R.drawable.ing_muhalabia,R.drawable.orange);
                Sweets_A food11 = new Sweets_A(R.drawable.qatayef,   "Video link \n" +
                        "https://youtu.be/asJpPnKyEKQ\n"+
                        "\n" +
                        "Ingredients\n" +
                        "•\t ▢1 cup flour.\n" +
                        "•\t ▢1 cup fine semolina\n" +
                        "•\t ▢2 Tablespoon granulated sugar.\n" +
                        "•\t ▢1 teaspoon baking powder.\n" +
                        "•\t ▢½ teaspoon instant yeast.\n" +
                        "•\t ▢¼ teaspoon salt.\n" +
                        "•\t ▢2½ cups warm water.\n" +
                        "•\t ▢1/4 cup ground pistachios.\n" +
                        "•\t ▢Optional : simple syrup or honey for drizzling.\n" +
                        "•\t ▢A batch of Ashta\n" +
                        "Instructions\n" +
                        "1.\tIn a bowl, combine the dry ingredients well.\n" +
                        "2.\tAdd water and mix until everything is well incorporated, cover and let it rest for 30 minutes.\n" +
                        "3.\tIn a skillet set over medium heat, pour 2 tablespoons batter.\n" +
                        "4.\tCook until the batter has no visible wet spots you will notice bubbles forming on the surface.Do not flip.\n" +
                        "5.\tComplete the batter and cover the cooked Qatayef so it will not get dry.\n" +
                        "6.\tPrepare the Ashta as directed in the above link.\n" +
                        "7.\tScoop about a teaspoon of the Ashta filling in the middle of the Qatayef.\n" +
                        "8.\tPinch the edges together sealing them two-thirds of the way. Dip the open side into ground pistachios.\n" +
                        "9.\tArrange nicely in a serving dish and cover until time to serve.\n" +
                        "10.\t*You can also drizzle some thick simple syrup or honey over the Qatayef.\n" +
                        "\n"
                      , "Qatayef with Ashta", R.drawable.ing_qatayef, R.drawable.orange);




        sweetsA.add(food1);
        sweetsA.add(food2);
        sweetsA.add(food3);
        sweetsA.add(food4);
        sweetsA.add(food5);
        sweetsA.add(food6);
        sweetsA.add(food7);
        sweetsA.add(food8);
        sweetsA.add(food9);
        sweetsA.add(food10);
        sweetsA.add(food11);






        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2, GridLayoutManager.VERTICAL,false);
        a_s_datalist.setLayoutManager(gridLayoutManager);
        a_s_datalist.setHasFixedSize(true);

        a_s_datalist.setAdapter(adapter);


        Button Bbtn = findViewById(R.id.Bbtn);
        Button Lbtn = findViewById(R.id.Lbtn);
        Button Dbtn = findViewById(R.id.Dbtn);
        Button Drbtn = findViewById(R.id.Drbtn);
        ImageButton home1 = findViewById(R.id.home1);


        Bbtn.setOnClickListener(this);
        Lbtn.setOnClickListener(this);
        Dbtn.setOnClickListener(this);
        Drbtn.setOnClickListener(this);
        home1.setOnClickListener(this);



    }

    public void detailOnclick3 (View view){

    }

    public void details3(int position){
        Sweets_A currentSweets = sweetsA.get(position);
        Sweets_A currentSweets1 = sweetsA.get(position);
        Sweets_A currentSweets2= sweetsA.get(position);
        Sweets_A currentSweets3 = sweetsA.get(position);

        Intent intent = new Intent(Asweetspage.this, Example_A_S.class);

        intent.putExtra("item1",currentSweets.getDiscription3());
        intent.putExtra("item2",currentSweets1.getBox_Image());
        intent.putExtra("item3",currentSweets2.getMain());
        intent.putExtra("item4",currentSweets3.getName());


        startActivity(intent);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.Bbtn:
                Intent intent = new Intent(Asweetspage.this, Apage.class);
                startActivity(intent);
                break;
            case R.id.Lbtn:
                Intent intent1 = new Intent(Asweetspage.this, Amainpage.class);
                startActivity(intent1);
                break;
            case R.id.Dbtn:
                Intent intent2 = new Intent(Asweetspage.this, Asweetspage.class);
                startActivity(intent2);
                break;
            case R.id.Drbtn:
                Intent intent3 = new Intent(Asweetspage.this, Abeveragespage.class);
                startActivity(intent3);
                break;
            case R.id.home1:
                Intent intent4 = new Intent(Asweetspage.this, Cuisines.class);
                startActivity(intent4);
                break;
        }

    }
}