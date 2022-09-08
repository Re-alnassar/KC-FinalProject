package com.example.thegoldenrecipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.hardware.lights.LightState;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class Isweetspage extends AppCompatActivity implements View.OnClickListener{
    private RecyclerView i_s_datalist;
    private List<I_sweets> sweetsI;
    private I_S_adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isweetspage);

        sweetsI = new ArrayList<>();

        adapter = new I_S_adapter(this, new RecycleViewOnClickItem() {
            @Override
            public void OnItemClick(int position) { details3_I(position);

            }
        },sweetsI);

        i_s_datalist = findViewById(R.id.i_s_datalist);
        I_sweets food1 = new I_sweets(R.drawable.bonet, "Video link\n" +
                "\n" +
                "https://youtu.be/dQiuwhtD6qA\n" +
                "\n" +
                "Ingredients\n" +
                "SERVES 6\n" +
                "THIS IS DELICIOUSLY OLD-FASHIONED AND SIMPLE TO MAKE.\n" +
                "250g granulated sugar\n" +
                "Oil, for greasing\n" +
                "300ml whole milk\n" +
                "225ml double cream\n" +
                "1 tablespoon instant espresso powder\n" +
                "1½ tablespoons cocoa powder\n" +
                "60g chopped dark chocolate\n" +
                "3 eggs\n" +
                "35g golden caster sugar\n" +
                "1 tablespoon rum\n" +
                "150g amaretti biscuits, crushed\n" +
                "\n" +
                "METHOD\n" +
                "Step 1\n" +
                "Heat the oven to 170°C/fan oven 150°C/mark 3. Make a caramel with the granulated sugar and about 8 tablespoons water by heating them gently in a saucepan until the sugar has completely dissolved. Now turn up the heat and cook until the sugar melts, turns toffee-coloured and caramelises. You will know when it is ready from the colour and smell; be careful not to burn the sugar. As soon as it reaches this point, quickly pour half the caramel into the base of a 1-litre loaf tin and the other half on to a lightly oiled baking sheet. Tilt the tin so that all of the base and some of the sides are covered. Leave this to set. Leave the caramel on the sheet to set too, then crush it to make shards (you'll use this for decoration later).\n" +
                "Step 2\n" +
                "Put the milk and cream in a sauce¬ pan and bring up to a simmer. Add the coffee powder, cocoa and chopped chocolate and stir until the chocolate is melted, then immedi¬ately remove from the heat.\n" +
                "Step 3\n" +
                "Using an electric mixer, beat the eggs and golden caster sugar together until fluffy. Slowly add the warm milk and cream mixture, pouring from a height to cool it as it pours, then add the rum and crushed amaretti and mix well. Pour this into the loaf tin and stand it in a roasting tin containing enough just-boiled water to come a third to halfway up the sides of the loaf tin.\n" +
                "Step 4\n" +
                "Bake in the oven for 1 hour - it may need 1¼ hours. The top should feel set when you touch the centre with your index finger; but it will still tremble slightly. Remove from the water bath and leave to cool. Cover the top with cling film, put in the fridge and leave for 6 hours to set completely.\n" +
                "Step 5\n" +
                "Remove the cling film. Run a knife all round the edges, between the bonet and the sides of the tin, and carefully turn out on to a plate. Decorate with caramel shards.\n" +
                "\n" +
                "\n" , "Bonet", R.drawable.ing_bonet, R.drawable.orange);
        I_sweets food2 = new I_sweets(R.drawable.nougat,"Video link\n" +
                "\n" +
                "https://youtu.be/JqBk4OJdH84\n"+
                "\n" +
                "•\t7 Ingredients\n" +
                "•\t6 Method Steps\n" +
                "•\t \n" +
                "4 sheets (about 15.5 x 23.5cm each) edible rice paper\n" +
                "•\t \n" +
                "200g blanched almonds\n" +
                "•\t \n" +
                "560g (2 1/2 cups) sugar\n" +
                "•\t \n" +
                "80ml (1/3 cup) water\n" +
                "•\t \n" +
                "1 500g jar glucose syrup (Colonial Farms brand)\n" +
                "•\t \n" +
                "2 egg whites, at room temperature\n" +
                "•\t \n" +
                "1 tsp vanilla essence\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "•\tStep 1\n" +
                "Preheat oven to 170°C. Line an 18 x 28cm slab pan with non-stick baking paper or greased foil, allowing it to overhang the sides. Lay 2 sheets of rice paper side by side on a clean work surface. Use the base of the pan as a guide to cut an 18 x 28cm rectangle. Repeat with remaining 2 sheets of rice paper. Place 2 sheets of the rice paper in the base of the lined pan. Spread the almonds evenly over a baking tray and toast in preheated oven for 7-10 minutes or until light golden. Set aside for 5 minutes to cool slightly. Chop and set aside.\n" +
                "•\tStep 2\n" +
                "Place the sugar and water in a medium saucepan. Use a wet spoon to spoon the glucose syrup into the pan. (To soften glucose in the microwave, see microwave tip.) The glucose prevents crystallisation and helps to ensure the nougat has the correct texture. Place the pan over medium-low heat. Stir with a wooden spoon, brushing down the sides of the pan occasionally with a pastry brush dipped in warm water, until the sugar dissolves (this will take about 10 minutes). Fill the sink with 10cm of cold water. Place the egg whites in a large, clean, dry heatproof bowl. Place a sugar (candy) thermometer in the pan. Increase heat to high and bring to the boil. Reduce heat to medium-high and boil, uncovered, without stirring. When the syrup reaches about 120°C, use the whisk attachment on an electric stand beater to whisk the egg whites until firm peaks form. It is important to use a stand mixer because, unlike a hand-held electric beater, it has a motor powerful enough to beat the nougat mixture.\n" +
                "•\tStep 3\n" +
                "When the sugar syrup reaches 140°C, immediately remove the pan from heat and place the base of the pan in the sink of cold water for 5 seconds, or until the bubbles subside. This stops the syrup temperature increasing ï¿½ the temperature of the syrup determines the texture of the nougat. When the syrup is cooked to 140°C, a chewy nougat results; if the syrup is cooked to 150°C, a harder nougat results. With the beater on medium speed, slowly pour hot syrup into the egg whites in a thin, steady stream. Don't pour the syrup down side of the bowl or onto the whisk as it may set before being incorporated into egg whites.\n" +
                "•\tStep 4\n" +
                "Once all the syrup is incorporated, whisk for a further 3 minutes or until the mixture is thick and glossy. Use a wooden spoon to mix the almonds and vanilla essence into egg white mixture until well combined. It is important to work quickly or the nougat will begin to set. Also make sure the nuts and vanilla essence are at room temperature - if they are cold, the mixture will set too rapidly, making it difficult to transfer to the pan.\n" +
                "•\tStep 5\n" +
                "Quickly pour the nougat evenly into the lined pan using a spatula to scrape down the side of the bowl. Use the spatula or the back of a spoon dipped in hot water to spread the nougat evenly into the pan and smooth the surface. Place the remaining rice paper or piece of greased foil over the top of the nougat and press down gently. Set aside in a cool, dry place for 6 hours or until set.\n" +
                "•\tStep 6\n" +
                "Lift the nougat from the pan and place on a cutting board. Remove baking paper or foil (if using rice paper, don't remove it, as it is edible). Use a serrated knife in a sawing motion to cut the nougat crossways into 3cm-wide pieces and then cut each piece into about 4cm lengths. Place nougat in a clean, dry airtight container, separating layers with non-stick baking paper. Keep in a cool, dry place for 1-2 weeks or in the fridge for up to 3 weeks. If storing nougat in the fridge, bring to room temperature before serving.\n" +
                "\n" +
                "\n" , "Nougat", R.drawable.ing_nougat, R.drawable.orange);
        I_sweets food3 = new I_sweets(R.drawable.crostata,  "Video link\n" +
                "\n" +
                "https://youtu.be/2jzZGqYszEI\n"+
                "\n" +
                "Ingredients\n" +
                "These are the doses for about 500 g (1,1 lb) of Pasta Frolla for a crostata in a tart pan of about 22 cm ( 9 inch) in diameter\n" +
                "For the Pasta Frolla:\n" +
                "•\t250 g (8,8 oz = about 2 cups) of “00” flour + more for the working surface\n" +
                "•\t100 g (3,5 oz = 1/2 cup) of granulated sugar\n" +
                "•\t120 g ( about 1 stick) of unsalted cold butter\n" +
                "•\t1 whole medium egg at room temperature\n" +
                "•\t1 medium egg yolk at room temperature\n" +
                "•\t1/6 teaspoon of fine salt\n" +
                "•\t1/2 teaspoon of baking powder\n" +
                "•\tgrated zest of half a lemon\n" +
                "For the Filling:\n" +
                "•\t300 g of apricot jam (about 1 cup) or the jam you prefer\n" +
                "Directions\n" +
                "Pasta Frolla Recipe\n" +
                "Step 1) – The first thing to do is to make the pasta frolla that you can fill with jam and decorate. So, place the flour on a pastry board then make a hole in the center. Add the sugar, baking powder, salt, lemon zest and eggs at room temperature.\n" +
                "Step 2) – Finally, add the cold butter cut into small pieces. Combine it quickly with your hands.\n" +
                "The heat of your hands can melt the butter too much and alter the final flavor of the pasta frolla. So BEFORE KNEADING, here 2 useful TIPS: 1) put your hands under cold-ice water then dry them well; 2) use a marble pastry board. It’s really important not to heat the pasta frolla dough too much!\n" +
                "Step 3) – Mix the ingredients quickly, for the shortest possible time, so as not to overheat the dough, until the mixture is compact and elastic. Finally, form a loaf and wrap it in cling film.\n" +
                "Let it cool for AT LEAST 1 HOUR in the fridge. You can make pasta frolla even the day before.\n" +
                "Step 4) – REMEMBER: you have to work the pasta frolla when cold. So, take it from the fridge and cut about 1/3 of the pastry, wrap it in cling film and put it back in the fridge. This piece of pasta frolla is used to make the edge of the tart and the decorative strips.\n" +
                "Then roll out the remaining 2/3 of sweeet shortcrust pastry with a rolling pin until it reaches a thickness of about 1/2 cm (1/4 inch). Use a COLD work surface, such as marble.\n" +
                "Step 5) – Place the pasta frolla in a tart mold, lined with baking paper. Preferably with the removable bottom, so you can easily take the tart out once baked.\n" +
                "It’s not necessary to pierce the bottom of the tart with a fork. The weight of the jam does not allow the cake to swell during cooking.\n" +
                "Now take the pastry that is cooling in the refrigerator, take off a piece and, with the help of your hands, make a long roll of pastry as thick as a finger. Now, arrange the roll of pastry around the edge of the tart.\n" +
                "Step 6) – With the help of the tines of a fork or with the end of its handle, press on the roll of pastry along the edge, as if to make a decoration. Then, pour the jam and, with the help of a spoon, spread it over the whole surface of the tart. Step 7) – With the remaining pasta frolla – the one in the fridge – make other rolls of pastry, flatten them with your hands and arrange them to form the classic decoration of Italian jam tart, a criss-cross pattern to form rhombuses or squares.\n" +
                "You can decorate your crostata in a more original or specific way, for differt occasions. For another type of decoration read the paragraph below “How to Decorate an Italian Crostata”.\n" +
                "Bake in a preheated oven at 180° C (350 F) for about 30 minutes. When the edge of the tart is golden brown, remove the crostata from the oven and let it cool before serving.\n" , "Crostata",R.drawable.ing_crostata, R.drawable.orange);
        I_sweets food4 = new I_sweets(R.drawable.tramisu,  "Video link\n" +
                "https://youtu.be/87V4nizNJiE\n"+
                "Ingredients\n" +
                " \n" +
                "•\t ▢1 1/2 cups heavy whipping cream\n" +
                "•\t ▢8 ounce container mascarpone cheese ,room temperature\n" +
                "•\t ▢1/3 cup granulated sugar\n" +
                "•\t ▢1 teaspoon vanilla extract\n" +
                "•\t ▢1 1/2 cups cold espresso\n" +
                "•\t ▢3 Tablespoons coffee flavored liqueur ,optional (Kahlua or DaVinci brands)\n" +
                "•\t ▢1 package Lady Fingers ,Savoiardi brand can be found in the cookie aisle at your local grocery store, or online\n" +
                "•\t ▢Cocoa powder for dusting the top\n" +
                "\n" +
                "\n" +
                "Instructions\n" +
                " \n" +
                "1.\tAdd whipping cream to a mixing bowl and beat on medium speed with electric mixers (or use a stand mixer). Slowly add sugar and vanilla and continue to beat until stiff peaks. Add mascarpone cheese and mix just until combined. Set aside.\n" +
                "2.\tAdd coffee and liqueur to a shallow bowl. Dip the lady fingers in the coffee (Don't soak them--just quickly dip them on both sides to get them wet) and lay them in a single layer on the bottom of an 8x8'' or similar size pan. \n" +
                "3.\tSmooth half of the mascarpone mixture over the top. Add another layer of dipped lady fingers. Smooth remaining mascarpone cream over the top.\n" +
                "4.\tDust cocoa powder generously over the top (I use a fine mesh strainer to do this). Refrigerate for at least 3-4 hours or up to overnight before serving.\n" +
                "\n" +
                "\n" +
                "\n" , "Tiramisu", R.drawable.ing_tiramisu, R.drawable.orange);
        I_sweets food5 = new I_sweets(R.drawable.panettone,   "Video link\n" +
                "https://youtu.be/Vdl1xudUdzo\n"+
                "\n" +
                "Ingredients\n" +
                "For the dough and sponge:\n" +
                "•\t5 cups (600g) all-purpose flour, divided, plus a little more as needed\n" +
                "•\t1 tablespoon instant yeast (slightly more than 1 packet)\n" +
                "•\t2/3 cup water\n" +
                "•\t5 large eggs\n" +
                "•\tFinely grated zest from 1 orange\n" +
                "•\t1/3 cup (68g) sugar\n" +
                "•\t2 teaspoons vanilla\n" +
                "•\t1 1/2 teaspoons fine sea salt\n" +
                "•\t12 tablespoons (1 1/2 sticks, 170g) room temperature unsalted butter, to make the dough\n" +
                "•\t1 tablespoon (14g) cold unsalted butter, for the top of the dough\n" +
                "•\tVegetable oil spray (for the dough bowl)\n" +
                "For the fruit and nuts:\n" +
                "•\t1/2 cup dark raisins\n" +
                "•\t1/2 cup golden raisins\n" +
                "•\t1/2 cup best quality candied orange peel, or a combination of 1/4-inch diced dried fruit, such as apricots, pears, cranberries, or dried cherries\n" +
                "•\t1/4 cup dark rum, such as Meyer’s rum\n" +
                "•\t1/4 cup hot water\n" +
                "•\t1/2 cup slivered almonds, optional\n" +
                "Method\n" +
                "Day One: Prep the Dough\n" +
                "•\tPrep time: 30 minutes\n" +
                "•\tRising time: 45 minutes for the sponge, plus overnight rise\n" +
                "1.\tMake the sponge (starter) and let it rise:\n" +
                "In the bowl of a stand mixer, stir 1 cup flour and 1 tablespoon instant yeast together until blended. Add the water and mix with a spoon. It should be the consistency of thick cake batter. Cover the bowl with plastic wrap and let rise for 45 minutes. The sponge should double in size.\n" +
                "(If using active dry yeast, place the water in the bowl first, stir in the yeast, and let stand until bubbly, about 5 minutes. Stir in the flour.)\n" +
                "Soak the fruit:\n" +
                "In a small bowl, stir the dark raisins, golden raisins, candied orange peel, rum, and water together. Cover with a plate and let soak overnight. Measure the almonds and set the measuring cup on top of the plate (so you don’t forget them).\n" +
                "1.\tMeasure the flour and salt:\n" +
                "In a bowl, whisk the remaining flour and salt together until blended.\n" +
                "2.\tMix the dough:\n" +
                "Once the sponge has risen, transfer the bowl to a stand mixer fitted with the paddle attachment. Set it on medium speed, and add the eggs to the sponge one at a time, until each is incorporated. Continue at medium speed and add the orange zest, sugar, and vanilla.\n" +
                "Drop the mixer to low speed and gradually add about 2 1/2 cups of the flour mixture and mix for about 2 minutes, or until blended. You may need to scrape the sides of the bowl. The dough should be very soft and stretchy. On low speed, gradually add the remaining 1 1/2 cups of flour until it is incorporated.\n" +
                "3.\tKnead the dough:\n" +
                "Switch to the dough hook. Knead on low speed for 8 minutes, or until the dough is very smooth and elastic. Stop 2 or 3 times to push down any dough that creeps up on the dough hook.\n" +
                "With the mixer on low speed, gradually add the butter, a few tablespoons at a time, until it is incorporated. Continue to mix with the dough hook for 3 minutes until the dough is silky and shiny.\n" +
                "If it still seems extremely sticky, gradually add from 1 to 4 tablespoons additional flour. The dough should be very soft and still sticky and will just barely pull away from the sides of the bowl, but not the bottom.\n" +
                "4.\tOvernight rise in the refrigerator:\n" +
                "Keeping the dough in the bowl, pat it into a ball. Spray lightly with vegetable oil spray and place a piece of plastic wrap directly on the dough. Refrigerate for 8 hours or up to 2 days.\n" +
                "Day Two: Shape and Bake the Panettone\n" +
                "•\tPrep time: 10 minutes\n" +
                "•\tRising time: 2 to 3 hours, or longer if the kitchen is cold\n" +
                "•\tBaking time: 70 to 75 minutes\n" +
                "1.\tPrepare to finish the dough:\n" +
                "Place the panettone mold on a baking sheet. Drain the fruit.\n" +
                "Turn the dough onto a floured workspace and roll it into a flat rectangle that is approximately 12- by 15-inches (you don’t need to be exact). Spread the drained fruit and the almonds evenly over the top. With a rolling pin, roll forcefully over the fruit and nuts to embed them into the dough.\n" +
                "Shape the dough:\n" +
                "Fold the long sides of the fruit-covered dough into thirds (like a letter). You will end up with a rectangle. Then fold the bottom half of the rectangle to meet the top to form a square. Pat the square to a thickness of about 1 1/2 inches. Bring the corners in toward the center to form a ball, and pinch the loose ends together. Cup your hands around the dough to round the ball.\n" +
                "Place the dough with the seam side down inside the panettone mold. ( I used a 7-inch wide by 4-inches high paper panettone mold from Sur La Table.) Cover with plastic and let rise in a warm place for 1 1/2 to 2 hours, or until the dough reaches the top edge of the mold. This can take longer if the room is cold.\n" +
                "Preheat the oven and score the panettone:\n" +
                "About 30 minutes before the panettone is ready to be baked, set a rack in the lower third of the oven and preheat the oven to 375°F.\n" +
                "When the dough has risen, use a sharp, serrated knife to cut a shallow cross from edge to edge. You are scoring the surface, rather than cutting into it deeply. Place the cold pat of butter in the center of the dough.\n" +
                "Bake the panettone:\n" +
                "Turn the oven down to 325°F. Bake the panettone for 30 minutes. Then place a piece of foil loosely over the top to keep it from browning too much. Continue to bake for 40 to 45 minutes, or until golden brown and an instant read thermometer inserted into the center of the dough registers 195°F. (Poke it through the side of the cake, through the paper, so you don’t mar the top). Remove it from the oven, transfer to rack, and let cool completely in the paper mold.\n" +
                "\n" +
                "\n" , "Panettone", R.drawable.ing_panettone, R.drawable.orange);
        I_sweets food6 = new I_sweets(R.drawable.pastiera, "Video link\n" +
                "https://youtu.be/lOLAbzC1qVE\n" +
                "\n", "Pastiera"+
                "\n" +
                "Ingredients\n" +
                "Save Recipe\n" +
                "•\t2 1/3 cups unbleached all-purpose flour\n" +
                "•\t1/3 cup sugar\n" +
                "•\t1/2 teaspoon salt\n" +
                "•\t1/2 teaspoon baking powder\n" +
                "•\tGrated zest of 1 lemon or 1 small orange\n" +
                "•\t3/4 cup (1 1/2 sticks, 6 ounce) unsalted butter, cold, cut into small even cubes\n" +
                "•\t1 large egg\n" +
                "•\t1 large egg yolk\n" +
                "•\t1/2 teaspoon pure vanilla extract\n" +
                "•\t1/4 cup milk\n" +
                "•\tA few drops of ice water, if necessary\n" +
                "Directions\n" +
                "1.\tPlace the cooked grain, milk, sugar, lemon zest and cinnamon in a 2-quart saucepan and cook over low heat, stirring often with a wooden spoon until the mixture is creamy—the grains will retain their shape, but the rest of the mixture should be soft and smooth and there should be no huge clumps of grain; it should resemble creamy oatmeal. Transfer the grain mixture to a shallow bowl and allow it to cool completely.\n" +
                "2.\tOn a floured board, roll 2/3 of the pasta frolla into an 11-inch circle, 1/8th of an inch thick. Transfer the dough to a deep, 9-inch pie plate, or a 9 x 2-inch layer cake pan by rolling the dough around the pin like a carpet and then unrolling it onto the pan. Press the dough into the bottom and sides of the pan, then trim the dough to leave a 1/2-inch overhang. Gather the scraps and save them for another use. Chill the shell while you put together the rest of the filling.\n" +
                "3.\tPreheat the oven to 350°F and position a rack in the middle of the oven.\n" +
                "4.\tPlace the ricotta in a large bowl and whisk in the eggs, vanilla, orange flower water or zest. Mix in the grain mixture and candied fruits, making sure all the ingredients are completely combined.\n" +
                "5.\tSet the filling aside while you roll out the remaining pasta frolla into a rectangle at least 11 inches long and 6 inches wide. Using a pastry cutter, make 6 or 7 long strips of dough, 3/4-inch wide. Pour the filling into the chilled shell and carefully arrange the enough of the strips on top to form a lattice pattern and pinching the edges together with the overhang. Trim all the pastry flush with the top of the pan, then gently roll it down and inward with your finger to form a lip around the perimeter.\n" +
                "6.\tUse a fork to slightly beat the egg with a small splash of water to make an egg wash. With a pastry brush, glaze the pastry strips and edges. Bake the pastiera on the middle rack of the oven for 55 to 60 minutes, rotating it 180° after 20 minutes to ensure even browning. If necessary, you can protect the edges from overbrowning with some strips of aluminum foil.\n" +
                "7.\tThe pastiera is done when the filling is set but jiggly and the pastry is golden brown. A knife inserted in the center will come out clean. Remove it from the oven and set it to cool on a rack. Allow the pastiera to cool completely, or chill it overnight before cutting it into wedges to serve.\n" +
                "8.\tPasta Frolla\n" +
                "9.\tAdapted from Dolce Italiano: Desserts From The Babbo Kitchen.\n" +
                "10.\t- makes one 10-inch tart shell -\n" +
                "11.\tPlace the flour, sugar, salt, baking powder and citrus zest in the bowl of a food processor and pulse several times to combine the dry ingredients.\n" +
                "12.\tAdd all of the cold, cubed butter to the bowl, and process until the mixture is sandy and there are no visible lumps of butter. In a small bowl, whisk together the egg, egg yolk, vanilla extract and milk. Add the wet ingredients to the food processor and pulse three or four times or until the dough comes together. If necessary, add some ice water, a few drops at a time, to make the dough come together.\n" +
                "13.\tRemove the dough from the food processor and work it a bit with your hand to even out any dry or wet spots. Form the dough into a ball, flatten into a disc, wrap in plastic and chill until firm, 1 to 2 hours, before rolling it out.\n" +
                "\n" +
                "\n" , R.drawable.ing_pastiera, R.drawable.orange);
        I_sweets food7 = new I_sweets(R.drawable.torte_caprese,  "Video link\n" +
                "\n" +
                "https://youtu.be/Qr-qSqgqVJI\n"+
                "\n" +
                "Ingredients send grocery list\n" +
                "•\t125 grams (4.4 oz) blanched almonds (or almond meal)\n" +
                "•\t125 grams (4.4 oz) good quality dark chocolate (I use 70% cocoa)\n" +
                "•\t125 grams (4.4 oz or 1 stick plus 1 tablespoon) unsalted butter, chopped\n" +
                "•\t125 grams (4.4 oz or 1/2 cup) sugar\n" +
                "•\t3 large eggs, separated and left to come to room temperature\n" +
                "•\tpowdered sugar for dusting\n" +
                "\n" +
                "\n" +
                "Directions\n" +
                "1.\tGrease and line a 20-centimeter or 8-inch round cake tin with baking paper (I like to use a springform tin or one with a removable base for this delicate cake) and preheat oven to 160ºC or 320°F.\n" +
                "2.\tIf using whole blanched almonds, blitz them to a very fine, sandy texture in a food processor. Set aside.\n" +
                "3.\tPlace the chocolate, broken up, in a metal or glass bowl set over a bain marie (double broiler, or a pot of simmering water). When melted, remove the bowl from the heat and add the butter, stirring with a wooden spoon or silicon spatula to help it melt. Then add the sugar and the almond meal.\n" +
                "4.\tOnce the mixture is no longer hot, add the egg yolks and stir to combine with a wooden spoon. If adding any further ingredients (orange zest, rum, etc), stir them in now.\n" +
                "5.\tIn a separate bowl, whip the egg whites with beaters to soft, fluffy peaks. Fold the whites gently through the chocolate and almond batter.\n" +
                "6.\tPour the batter into the cake tin, smooth over the top and bake for approximately 40 minutes or until the top appears dry and a skewer inserted in the middle comes out with a few moist crumbs attached (not wet batter). It is important not to overcook this cake so that it retains its wonderful moist consistency. Let cool completely in the tin before handling.\n" +
                "7.\tDust with powdered sugar and, if desired, some lightly whipped cream. This cake keeps well for several days and is even better the next day.\n" +
                "\n" +
                "\n" , "Torte Capresse" , R.drawable.ing_capresse, R.drawable.orange);


        sweetsI.add(food1);
        sweetsI.add(food2);
        sweetsI.add(food3);
        sweetsI.add(food4);
        sweetsI.add(food5);
        sweetsI.add(food6);
        sweetsI.add(food7);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2,GridLayoutManager.VERTICAL,false);
        i_s_datalist.setLayoutManager(gridLayoutManager);
        i_s_datalist.setHasFixedSize(true);

        i_s_datalist.setAdapter(adapter);


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

    public void detailOnClick (View view){

    }

    public void details3_I(int position){
        I_sweets currentSweets = sweetsI.get(position);
        I_sweets currentSweets1 = sweetsI.get(position);
        I_sweets currentSweets2 = sweetsI.get(position);
        I_sweets currentSweets3 = sweetsI.get(position);

        Intent intent = new Intent(Isweetspage.this, Example_I_S.class);

        intent.putExtra("item1", currentSweets.getDiscrpition3_I());
        intent.putExtra("item2", currentSweets1.getBox_Image3_I());
        intent.putExtra("item3", currentSweets2.getMain3_I());
        intent.putExtra("item4", currentSweets3.getName3_I());

        startActivity(intent);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Bbtn:
                Intent intent = new Intent(Isweetspage.this, Ipage.class);
                startActivity(intent);
                break;
            case R.id.Lbtn:
                Intent intent1 = new Intent(Isweetspage.this, Imainpage.class);
                startActivity(intent1);
                break;
            case R.id.Dbtn:
                Intent intent2 = new Intent(Isweetspage.this, Isweetspage.class);
                startActivity(intent2);
                break;
            case R.id.Drbtn:
                Intent intent3 = new Intent(Isweetspage.this, Ibeverages_page.class);
                startActivity(intent3);
                break;
            case R.id.home1:
                Intent intent4 = new Intent(Isweetspage.this, Cuisines.class);
                startActivity(intent4);
                break;

        }

    }
}