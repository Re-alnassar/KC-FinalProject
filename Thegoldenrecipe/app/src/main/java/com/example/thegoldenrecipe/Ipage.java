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

public class Ipage extends AppCompatActivity implements View.OnClickListener{
    private RecyclerView i_b_datalist;
    private List<I_breakfast> breakfastsI;
    private I_B_adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipage);


        breakfastsI = new ArrayList<>();

        adapter = new I_B_adapter(this, new RecycleViewOnClickItem() {
            @Override
            public void OnItemClick(int position) { details_I(position); }

            },breakfastsI);


        i_b_datalist = findViewById(R.id.i_b_datalist);
        I_breakfast food1 = new I_breakfast(R.drawable.baked_eggs_sausage,  "Video link\n" +
                "https://youtu.be/yjzL-s8XF3U\n"+
                "Ingredients\n" +
                "•\t1 cup marinara or tomato sauce\n" +
                "•\t1 cup sausage finely diced\n" +
                "•\t½ small onion finely diced\n" +
                "•\t2 cloves garlic finely chopped\n" +
                "•\t2 eggs\n" +
                "•\t1 tsp oregano finely chopped if using fresh\n" +
                "•\t2 tbsp fresh basil finely chopped, leave a few small whole leaves for topping\n" +
                "•\t1 ½ tbsp extra virgin olive oil divided, ½ for finishing\n" +
                "•\t¼ tsp sea salt\n" +
                "•\t1 burrata ripped into 4 pieces\n" +
                "•\t2 slices baguette or crusty bread\n" +
                "Instructions\n" +
                "1.\tPreheat oven to 375°F.\n" +
                "2.\tChop the onion, garlic, and sausage. Saute with 1 tablespoon of olive oil in an oven-safe skillet for 5-7 minutes.\n" +
                "3.\tRemove the pan from heat, then add in the oregano and marinara sauce and mix together. Season with salt as needed.\n" +
                "4.\tCreate 2 holes or dents in the sauce for the eggs, ensuring both are far apart from each other. Break the eggs into these dents and sprinkle each with a little sauce.\n" +
                "5.\tTransfer the skillet to the oven and bake until the egg whites are set and the yolks are still soft, about 7 to 9 minutes.\n" +
                "6.\tWhile the eggs bake, toast your bread.\n" +
                "7.\tRemove the egg bake from the oven and add in the ripped burrata. Top with fresh basil and a drizzle of olive oil. Enjoy with crusty bread.\n" +
                "\n" +
                "\n" ,"Baked eggs and sauage", R.drawable.ing_bakedegg, R.drawable.orange);
        I_breakfast food2 = new I_breakfast(R.drawable.brioche, "Video link\n" +
                "https://youtu.be/3dbZJqamB3Y\n"+
                "\n" +
                "Ingredients:\n" +
                "•\t ▢½ cup warm milk\n" +
                "•\t ▢2 ½ tsp active dry yeast about 9 g\n" +
                "•\t ▢2 tsp honey\n" +
                "•\t ▢5 large eggs You can also use 4 large eggs\n" +
                "•\t ▢1 yolk from a large egg. Use 2 egg yolks if using 4 large eggs.\n" +
                "•\t ▢2 tsp vanilla\n" +
                "•\t ▢2.1 oz granulated white sugar 5 tbsp\n" +
                "•\t ▢17.6 oz AP flour 4 cups + 2 tbsp (Spoon and leveled)\n" +
                "•\t ▢1 ½ tsp sea salt fine grind\n" +
                "•\t ▢8.8 oz unsalted butter very soft, roughly divided into four portions (1 cup + 2 tbsp)\n" +
                "Instructions:\n" +
                "DAY ONE\n" +
                "Making the dough\n" +
                "1.\tMeasure all the ingredients and have them ready.\n" +
                "2.\tAdd the milk, yeast and honey into the mixing bowl and whisk gently to combine. Set aside for 10 minutes to allow the yeast to activate.\n" +
                "½ cup warm milk,2 ½ tsp active dry yeast,2 tsp honey\n" +
                "3.\tAdd the eggs and yolks, and whisk gently to break the egg yolks.\n" +
                "5 large eggs,1 yolk\n" +
                "4.\tAdd the vanilla, sugar, flour and sea salt, and mix to form a scraggly dough.\n" +
                "2 tsp vanilla,2.1 oz granulated white sugar,17.6 oz AP flour,1 ½ tsp sea salt\n" +
                "5.\tWith the dough hook attachment, knead the dough on speed 2 or 3 for about 3 - 5 minutes.\n" +
                "6.\tDivide the butter into roughly 4 portions. Add the first portion of butter, in increments, after the first 5 minutes of kneading. Allow the butter to be mixed well into the dough. This should take about 2 minutes.\n" +
                "8.8 oz unsalted butter\n" +
                "7.\tRepeat with the other 3 portions of butter, kneading the dough for about 2 -3 minutes after each addition. Make sure to stop the mixer to scrape down the sides of the bowl (and the bottom if needed) between kneading as well. You will have incorporated all the butter in about 9 - 12 minutes of kneading time.\n" +
                "8.8 oz unsalted butter\n" +
                "8.\tOnce all the butter is incorporated, scrape down the sides of the bowl (and bottom if needed), and knead the dough for a further 5 - 15 minutes on speed 5 or 6. This could take up to 20 - 30 minutes if your mixer is on low speed.\n" +
                "9.\tThe dough will have been kneaded enough when it can be lifted fairly cleanly off the bottom of the bowl when picked up with the dough hook. It will be very soft and tacky to the touch, but shouldn’t stick to your fingertips. Rather than strictly going by time, knead the dough until you have reached this consistency.\n" +
                "10.\tFlour your work surface, and turn the dough out onto the floured surface. Lightly flour your hands and the surface of the dough to prevent the dough from sticking to your palms.\n" +
                "11.\tFold in the edges of the dough towards the middle and gently press them into the dough (see pictures in the post for more information). Carefully flip the dough over, and then with the heel of your palms, shape the dough to form a tight ball.\n" +
                "12.\tCarefully pick up the dough ball and place it back in the mixer bowl (or another large bowl).\n" +
                "13.\tLet it rise until it has doubled in size, in a warm place (72°F), for about 1 hour.\n" +
                "14.\tTurn the dough out onto a lightly floured surface, and press down gently to deflate the dough with your hands. Fold in the edges again as before towards the middle and press them in. Carefully flip the dough over (seam side down now). Tighten the dough into a ball with a smooth, taut surface (using the edges of your palms). Transfer the dough into the mixer bowl again.\n" +
                "15.\tCover and let it chill in the fridge for at least 8 hours, or up to 24 hours.\n" +
                "DAY TWO\n" +
                "Shaping and baking the bread\n" +
                "1.\tRemove the chilled dough from the fridge. The dough will be much easier to work with now.\n" +
                "2.\tButter and dust two 8.5 x 4 inch, standard loaf pans with flour. (You can also use 9 x 5 inch loaf pans).\n" +
                "3.\tKeep a bowl of flour, a pastry brush and a dough scraper/cutter ready as well.\n" +
                "4.\tTurn the dough out onto a lightly floured surface. Deflate the dough by flattening it lightly. Measure the weight of the dough, and then divide it into two EQUAL portions, using the dough cutter or a sharp knife.\n" +
                "5.\tNow you've got two dough portions to make two brioche bread loaves.\n" +
                "Shaping the loaves\n" +
                "Nantaise brioche loaf\n" +
                "1.\tWeigh one portion of the loaf and divide it into 8 equal portions.\n" +
                "2.\tFor each portion (with the smooth side down), fold in the edges towards the middle as before. Carefully flip the dough over, and using a cupped palm, roll the dough portion on your work surface until you have a smooth dough ball (see pictures in the post for more details). Repeat with the other dough portions to get 8 smooth dough balls.\n" +
                "3.\tPlace the dough balls in the loaf pan in a zig-zag manner. This will likely be a fairly snug fit.\n" +
                "4.\tAfter arranging the dough balls in the loaf pan, flatten them slightly. Then cover the pan with plastic wrap and set aside.\n" +
                "Braided brioche loaf\n" +
                "1.\tDivide one portion of the dough into 3 equal portions.\n" +
                "2.\tFlatten each portion into a small rectangle. Then tightly roll up the rectangle to form a tube. Using your palms, and a back and forth motion, roll out the dough into a 14 inch long bread rope. Apply light but even pressure to get a bread rope with even width.\n" +
                "3.\tRepeat with the other two portions.\n" +
                "4.\tNow you have three 14 inch long bread ropes. Bring the ends of the three ropes together and pinch to seal. Braid the dough, while being careful to avoid any loose folds and to not stretch the dough ropes at the same time. Once braided, the bread loaf should be a little longer than the length of the pan (about 9 - 10 inches).\n" +
                "5.\tPinch to seal the other end. Using your palms, press down the ends of the bread to flatten them against the work surface. Tuck the flattened ends to get a lovely, rounded loaf.\n" +
                "6.\tCarefully transfer this to the buttered and floured bread pan. Flatten slightly to fit the loaf pan.\n" +
                "7.\tCover with plastic wrap and set aside.\n" +
                "Regular bread loaf\n" +
                "1.\tFollow the same shaping instructions as for my white bread loaf in this recipe to form a regular bread loaf shape.\n" +
                "Proofing the bread before baking\n" +
                "1.\tProof the bread in the covered loaf pans for about 2 hours at room temperature, or until doubled in size, and almost reaching the top of the pan. Preheat the oven to 325°F/163°C before baking the loaves.\n" +
                "2.\tOnce doubled in size, brush the tops with an egg wash. Optionally, you can also sprinkle some Swedish sugar pearls on top for a sweet crunch.\n" +
                "3.\tBake in preheated oven until golden brown on top and the internal temperature registers 190°F/88°C. This can take about 35 - 45 minutes.\n" +
                "4.\tRemove from the oven and let the bread loaf cool slightly - about 5 minutes.\n" +
                "5.\tCarefully flip the bread loaf out of the pan, onto a cooling rack. Let it cool completely. Store in an air-tight container.\n" +
                "\n" +
                "\n" ,"Brioche bread",R.drawable.ing_broiche, R.drawable.orange);
        I_breakfast food3 = new I_breakfast(R.drawable.casserole, "•\tVideo link\n" +
                "•\thttps://youtu.be/_wZkmBUkdbE\n" +
                "\n" +
                "Ingredients\n" +
                "•\t cooking spray\n" +
                "•\t 2 (7 ounce) cans whole green chile peppers, drained\n" +
                "•\t 8 ounces Monterey Jack cheese, shredded\n" +
                "•\t 8 ounces Longhorn or Cheddar cheese, shredded\n" +
                "•\t 2 large eggs\n" +
                "•\t 1 (5 ounce) can evaporated milk\n" +
                "•\t 2 tablespoons all-purpose flour\n" +
                "•\t ½ cup milk (Optional)\n" +
                "•\t 1 (8 ounce) can tomato sauce\n" +
                "Directions\n" +
                "Instructions Checklist\n" +
                "•\t Step 1\n" +
                "Preheat the oven to 350 degrees F (175 degrees C). Grease a 9x13-inch baking dish with cooking spray.\n" +
                "•\t Step 2\n" +
                "Evenly layer 1 can chile peppers in the bottom of the prepared baking dish. Sprinkle with 1/2 of the Jack and Cheddar cheeses, then cover with remaining chile peppers.\n" +
                "•\t Step 3\n" +
                "Mix together eggs, evaporated milk, and flour in a bowl; add 1/2 cup milk to thin to desired consistency. Pour over chiles.\n" +
                "•\t Step 4\n" +
                "Bake in the preheated oven for 25 minutes. Pour tomato sauce evenly over the top; continue baking for 15 more minutes.\n" +
                "•\t Step 5\n" +
                "Turn broiler on. Sprinkle top with remaining Jack and Cheddar cheeses. Place under the broiler until cheese is melted, 2 to 3 minutes.\n" +
                "\n", "Casserole", R.drawable.ing_casserole, R.drawable.orange);
        I_breakfast food4 = new I_breakfast(R.drawable.croissant, "Video link\n" +
                "https://youtu.be/bOQfTGfNLjM\n"+
                "\n" +
                "Ingredients\n" +
                "•\t 1/4 cup (4 Tablespoons; 60g) unsalted butter, softened to room temperature\n" +
                "•\t 4 cups (500g) all-purpose flour (spoon & leveled), plus more for rolling/shaping\n" +
                "•\t 1/4 cup (50g) granulated sugar\n" +
                "•\t 2 teaspoons salt\n" +
                "•\t 1 Tablespoon active dry or instant yeast\n" +
                "•\t 1 and 1/2 cups (360ml) cold whole milk\n" +
                "Butter Layer\n" +
                "•\t 1 and 1/2 cups (3 sticks; 345g) unsalted butter, softened to room temperature\n" +
                "•\t 2 Tablespoons (16g) all-purpose flour\n" +
                "Egg Wash\n" +
                "•\t 1 large egg\n" +
                "•\t 2 Tablespoons (30ml) whole milk\n" +
                "Instructions\n" +
                "1.\tPreliminary notes: Watch the video above and use the step-by-step photos before you begin. Read the recipe before beginning. Make room in the refrigerator for a baking sheet. In step 6 and again in step 13, you will need room for 2 baking sheets.\n" +
                "2.\tMake the dough: Cut the butter in four 1-Tablespoon pieces and place in the bowl of an electric stand mixer fitted with the dough hook attachment (or you can use a handheld mixer or no mixer, but a stand mixer is ideal). Add the flour, sugar, salt, and yeast. Turn the mixer on low-medium speed to gently combine the ingredients for 1 minute. With the mixer running, slowly pour in the milk. Once all of the milk is added, turn the mixer up to medium speed and beat the dough for at least 5 full minutes. (If you don’t have a mixer, knead by hand for 5 minutes.) The dough will be soft. It will (mostly) pull away from the sides of the bowl and if you poke it with your finger, it will bounce back. If after 5 minutes the dough is too sticky, keep the mixer running until it pulls away from the sides of the bowl.\n" +
                "3.\tRemove dough from the bowl and, with floured hands, work it into a ball. Place the dough on a lightly floured silicone baking mat lined, lightly floured parchment paper lined, or lightly floured baking sheet. (I highly recommend a silicone baking mat because you can roll the dough out in the next step directly on top and it won’t slide all over the counter.) Gently flatten the dough out, as I do in the video above, and cover with plastic wrap or aluminum foil. Place the entire baking sheet in the refrigerator and allow the covered dough to rest in the refrigerator for 30 minutes.\n" +
                "4.\tShape the dough: Remove the dough from the refrigerator. I like to keep the dough on the silicone baking mat when I’m rolling it in this step because the mat is nonstick and it’s a handy guide for the exact measurement. Begin flattening out the dough with your hands. You’re rolling it out into a rectangle in this step, so shaping it with your hands first helps the stretchy dough. Roll it into a 14×10-inch rectangle. The dough isn’t extremely cold after only 30 minutes in the refrigerator, so it will feel more like soft play-doh. Be precise with the measurement. The dough will want to be oval shaped, but keep working the edges with your hands and rolling pin until you have the correct size rectangle.\n" +
                "5.\tLong rest: Place the rolled out dough back onto the baking sheet (this is why I prefer a silicone baking mat or parchment because you can easily transfer the dough). Cover the rolled out dough with plastic wrap or aluminum foil, place the entire baking sheet in the refrigerator and allow the covered dough to rest in the refrigerator for 4 hours or overnight. (Up to 24 hours is ok.)\n" +
                "6.\tButter layer (begin this 35 minutes before the next step so the butter can chill for 30 minutes): In a large bowl using a hand-held mixer or stand mixer fitted with a paddle or whisk attachment, beat the butter and flour together until smooth and combined. Transfer the mixture to a silicone baking mat lined or parchment paper lined baking sheet. (Silicone baking mat is preferred because you can easily peel the butter off in the next step.) Using a spoon or small spatula, smooth out into a 7×10-inch rectangle. Be as precise as you can with this measurement. Place the entire baking sheet in the refrigerator and chill the butter layer for 30 minutes. (No need to cover it for only 30 minutes.) You want the butter layer firm, but still pliable. If it gets too firm, let it sit out on the counter for a few minutes to gently soften. The more firm the butter layer is the more difficult it will be to laminate the dough in the next step.\n" +
                "7.\tLaminate the dough: In this next step, you will be rolling out the dough into a large rectangle. Do this on a lightly floured counter instead of rolling out on your silicone baking mat. The counter is typically a little cooler (great for keeping the dough cold) and the silicone baking mat is smaller than the measurement you need. Remove both the dough and butter layers from the refrigerator. Place the butter layer in the center of the dough and fold each end of the dough over it. If the butter wasn’t an exact 7×10-inch rectangle, use a pizza cutter or sharp knife to even out the edges. Seal the dough edges over the butter layer as best you can with your fingers. On a lightly floured counter, roll the dough into a 10×20-inch rectangle. It’s best to roll back and forth with the shorter end of the dough facing you, like I do in the video above. Use your fingers if you need to. The dough is very cold, so it will take a lot of arm muscle to roll. Again, the dough will want to be oval shaped, but keep working it with your hands and rolling pin until you have the correct size rectangle. Fold the dough lengthwise into thirds as if you were folding a letter. This was the 1st turn.\n" +
                "8.\tIf the dough is now too warm to work with, place folded dough on the baking sheet, cover with plastic wrap or aluminum foil, and refrigerate for 30 minutes before the 2nd turn. I usually don’t have to.\n" +
                "9.\t2nd turn: Turn the dough so the short end is facing you. Roll the dough out once again into a 10×20-inch rectangle, then fold the dough lengthwise into thirds as if you were folding a letter. The dough must be refrigerated between the 2nd and 3rd turn because it has been worked with a lot by this point. Place the folded dough on the baking sheet, cover with plastic wrap or aluminum foil, and refrigerate for 30 minutes before the 3rd turn.\n" +
                "10.\t3rd turn: Roll the dough out once again into a 10×20-inch rectangle. Fold the dough lengthwise into thirds as if you were folding a letter.\n" +
                "11.\t Long rest: Place the folded dough on the lined baking sheet, cover with plastic wrap or aluminum foil, and refrigerate for 4 hours or overnight. (Up to 24 hours is ok.)\n" +
                "12.\tAt the end of the next step, you’ll need 2 baking sheets lined with silicone baking mats or parchment paper. The dough is currently on a lined baking sheet in the refrigerator, so you already have 1 prepared!\n" +
                "13.\tShape the croissants: Remove the dough from the refrigerator. On a lightly floured counter, roll the dough out into an 8×20-inch rectangle. Use your fingers if you need to. Once again, the dough is very cold, so it will take a lot of arm muscle to roll. The dough will want to be oval shaped, but keep working it with your hands and rolling pin until you have the correct size rectangle. Using a pizza cutter or sharp knife, slice the dough in half vertically. Each skinny rectangle will be 4-inches wide. Then cut 3 even slices horizontally, yielding 8 4×5-inch rectangles. See photo and video above for a visual. Cut each rectangle diagonally to make 2 triangles. You have 16 triangles now. Work with one triangle at a time. Using your fingers or a rolling pin, stretch the triangle to be about 8 inches long. Do this gently as you do not want to flatten the layers. Cut a small slit at the wide end of the triangle, then tightly roll up into a crescent shape making sure the tip is underneath. Slightly bend the ends in towards each other. Repeat with remaining dough, placing the shaped croissants on 2 lined baking sheets, 8 per sheet. Loosely cover with plastic wrap or aluminum foil and allow to rest at room temperature (no warmer– I suggest keeping on the counter) for 1 hour, then place in the refrigerator to rest for 1 hour or up to 12 hours. (Or freeze, see freezing instructions.) I prefer the shaped croissants to be cold going into the oven.\n" +
                "14.\tPreheat oven to 400°F (204°C).\n" +
                "15.\tEgg wash: Whisk the egg wash ingredients together. Remove the croissants from the refrigerator. Brush each lightly with egg wash.\n" +
                "16.\tBake the croissants: Bake until croissants are golden brown, about 20 minutes. Rotate the pans halfway through baking. If croissants show signs of darkening too quickly, reduce the oven to 375°F (190°C).\n" +
                "17.\tRemove croissants from the oven and place on a wire rack to cool for a few minutes before serving. They will slightly deflate as they cool.\n" +
                "18.\tCroissants taste best the same day they’re baked. Cover any leftover croissants and store at room temperature for a few days or in the refrigerator for up to 1 week. You can also freeze for up to 3 months, then thaw on the counter or overnight in the refrigerator. Warm up to your liking.\n" +
                "\n" +
                "\n" +
                "\n" , "Croissants", R.drawable.ing_croissant, R.drawable.orange);
        I_breakfast food5 = new I_breakfast(R.drawable.frittata,  "Video link \n" +
                "https://youtu.be/7pnWlcayj2o\n"+
                "\n" +
                "\n" +
                "\n" +
                "INGREDIENTS\n" +
                "•\t12 eggs\n" +
                "•\t3 tablespoons full-fat dairy (heavy cream, half-and-half, whole milk, sour cream, crème fraîche or yogurt)\n" +
                "•\t½ teaspoon salt\n" +
                "•\t1 cup (4 ounces) grated or crumbled cheese\n" +
                "•\t3 to 5 cups chopped vegetables or greens of choice (or up to 3 cups leftover cooked vegetables or greens)\n" +
                "•\t1 tablespoon olive oil\n" +
                "•\tGarnish: Chopped or torn fresh, leafy herbs (basil, parsley, cilantro, or dill)\n" +
                "INSTRUCTIONS\n" +
                "1.\tPreheat the oven to 425 degrees Fahrenheit for the traditional stovetop method, or 350 degrees for the baked methods (casserole or mini/muffins).\n" +
                "2.\tCrack the eggs into a medium mixing bowl. Add your dairy of choice and the salt. Whisk just until the egg yolks and whites are blended. Whisk in all or half of the cheese (you can reserve the other half for topping the frittata before baking, if desired). Set the mixture aside.\n" +
                "3.\tIn a 12-inch cast iron skillet (or any other large skillet that’s oven safe), warm the olive oil over medium heat until shimmering. Add the vegetables, starting with chopped onions or other dense vegetables. Cook for a few minutes, stirring occasionally, then add any softer vegetables such as zucchini. Cook until those vegetables are tender, then add any garlic or greens, and cook until fragrant or wilted. Season with salt, to taste.\n" +
                "4.\tTraditional stovetop option: Whisk the eggs once more and pour the mixture over the vegetables. Stir with a spatula briefly to combine and distribute the mixture evenly across the pan. If you reserved any cheese, sprinkle it on top of the frittata now.\n" +
                "5.\tOnce the outside edge of the frittata turns lighter in color (about 30 seconds to 1 minute), carefully transfer the frittata to the oven. Bake for 7 to 14 minutes (keep an eye on it), until the eggs are puffed and appear cooked, and the center of the frittata jiggles just a bit when you give it a gentle shimmy. Remove the frittata from the oven and place it on a cooling rack to cool. Garnish with herbs, slice with a sharp knife, and serve.\n" +
                "6.\tBaked casserole option: Let the cooked vegetables cool for a few minutes. In the meantime, grease a 9 by 13-inch pan with butter, which works better than cooking spray. Stir the lightly cooled veggies into the egg mixture, then pour it all into the pan. If you reserved any cheese, sprinkle it on top of the frittata now.\n" +
                "7.\tBake for 20 to 25 minutes (keep an eye on it), until the eggs are puffed and appear cooked, and the center of the frittata jiggles just a bit when you give it a gentle shimmy. Remove the frittata from the oven and place it on a cooling rack to cool. Garnish with herbs, slice with a sharp knife, and serve.\n" +
                "8.\tBaked mini frittata option: Let the cooked vegetables cool for a few minutes, then stir them into the egg mixture. Grease 18 muffin cups (I used two muffin pans for this), then fill the cups evenly with a scant ⅓ cup of the mixture. If you reserved any cheese, sprinkle it on top of the frittatas now.\n" +
                "9.\tBake for 13 to 17 minutes, until the eggs are puffed and appear cooked, and the center of the frittatas jiggle just a bit when you give the pan a gentle shimmy (this happens quickly so keep an eye on them; my pan with only 6 muffins finished sooner). Remove the pans from the oven and place them on a cooling rack to cool. Garnish with herbs, and serve.\n" +
                "\n" +
                "\n" ,"Frittata", R.drawable.frittata, R.drawable.orange);
        I_breakfast food6 = new I_breakfast(R.drawable.ricotta_pancakes,  "Video link\n" +
                "https://youtu.be/tBvh5hejnF4\n"+
                "Video link \n" +
                "https://youtu.be/4bdFyM-z8g8\n"+
                "INGREDIENTS\n" +
                "•\t1 cup \n" +
                "ricotta cheese\n" +
                "•\t1 cup \n" +
                "all-purpose flour\n" +
                "•\t1/2 teaspoon \n" +
                "baking powder\n" +
                "•\t1 1/2 tablespoons \n" +
                "granulated sugar\n" +
                "•\t1/4 teaspoon \n" +
                "fine salt\n" +
                "•\t3/4 cup \n" +
                "milk (not nonfat)\n" +
                "•\t2 \n" +
                "large eggs, separated\n" +
                "•\t1/2 teaspoon \n" +
                "vanilla extract\n" +
                "•\tButter, for cooking\n" +
                "INSTRUCTIONS\n" +
                "1.\tIf your ricotta seems to have a lot of liquid, set it in a fine mesh strainer to drain off excess liquid about 30 minutes before you start cooking. If your ricotta seems fairly dry and compact, you can skip this step.\n" +
                "2.\tWhisk together flour, baking powder, sugar, and salt in a small bowl. Combine ricotta, milk, egg yolks, and vanilla in a separate, larger mixing bowl. Add the dry ingredients to the ricotta and milk mixture, stirring gently until just combined.\n" +
                "3.\tBeat the egg whites with a handheld electric mixer until stiff (see Recipe Note). (Alternatively, whisk the egg whites by hand.) Stir a small scoop of the egg whites into the pancake batter to lighten the batter, then fold in the remaining whites with a spatula.\n" +
                "4.\tHeat a griddle over medium-high heat. Melt a small bit of butter in the pan, just enough to coat the surface. Use a 1/3-cup measure to pour batter onto the hot griddle. Cook the pancakes for about 3 or 4 minutes, until the undersides are golden and you see a few bubbles popping through the pancakes. Flip the pancakes and cook another 2 to 3 minutes, until golden. Repeat with the remaining pancakes.\n" +
                "5.\tServe the pancakes immediately, with maple syrup, fruit jam, lemon curd, or powdered sugar.\n" +
                "\n" +
                "\n" +
                "\n" ,"Ricotta pancakes", R.drawable.ing_ricotta_pancakes, R.drawable.orange);
        I_breakfast food7 =  new I_breakfast(R.drawable.torte, "Video link\n" +
                "https://youtu.be/sMNEeZrc7bA"+
                "\n" +
                "Ingredients\n" +
                "•\t\n" +
                "•\t2 tubes (8 ounces each) refrigerated crescent rolls, divided\n" +
                "•\t1 teaspoon olive oil\n" +
                "•\t1 package (6 ounces) fresh baby spinach\n" +
                "•\t1 cup sliced fresh mushrooms\n" +
                "•\t7 large eggs, divided use\n" +
                "•\t1 cup grated Parmesan cheese\n" +
                "•\t2 teaspoons Italian seasoning\n" +
                "•\t1/8 teaspoon pepper\n" +
                "•\t1/2 pound thinly sliced deli ham\n" +
                "•\t1/2 pound thinly sliced hard salami\n" +
                "•\t1/2 pound sliced provolone cheese\n" +
                "•\t2 jars (12 ounces each) roasted sweet red peppers, drained, sliced and patted dry\n" +
                "Directions\n" +
                "1.\tPreheat oven to 350°. Place a greased 9-in. springform pan on a double thickness of heavy-duty foil (about 18 in. square). Securely wrap foil around pan. Unroll 1 tube of crescent dough and separate into triangles. Press onto bottom of prepared pan to form a crust, sealing seams well. Bake until set, 10-15 minutes.\n" +
                "2.\tMeanwhile, in a large skillet, heat oil over medium-high heat. Add spinach and mushrooms; cook and stir until mushrooms are tender. Drain on several layers of paper towels, blotting well. In a large bowl, whisk 6 eggs, Parmesan cheese, Italian seasoning and pepper.\n" +
                "3.\tLayer crust with half of each of the following: ham, salami, provolone cheese, red peppers and spinach mixture. Pour half of the egg mixture over top. Repeat layers; top with remaining egg mixture.\n" +
                "4.\tOn a work surface, unroll and separate remaining crescent dough into triangles. Press together to form a circle and seal seams; place over filling. Whisk remaining egg; brush over dough.\n" +
                "5.\tBake, uncovered, until a thermometer reads 160°, 1 to 1-1/4 hours, covering loosely with foil if needed to prevent overbrowning. Carefully loosen sides from pan with a knife; remove rim from pan. Let stand 20 minutes.\n" +
                "\n" +
                "\n" , "Italian brunch torte", R.drawable. ing_brunch,R.drawable.orange);


        breakfastsI.add(food1);
        breakfastsI.add(food2);
        breakfastsI.add(food3);
        breakfastsI.add(food4);
        breakfastsI.add(food5);
        breakfastsI.add(food6);
        breakfastsI.add(food7);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        i_b_datalist.setLayoutManager(gridLayoutManager);
        i_b_datalist.setHasFixedSize(true);

        i_b_datalist.setAdapter(adapter);

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
    public void details_I(int position){
        I_breakfast currentBreakfast = breakfastsI.get(position);
        I_breakfast currentBreakfast1 = breakfastsI.get(position);
        I_breakfast currentBreakfast2 = breakfastsI.get(position);
        I_breakfast currentBreakfast3 = breakfastsI.get(position);

        Intent intent  = new Intent(Ipage.this, Example_I.class );

        intent.putExtra("item1", currentBreakfast.getDscription_I());
        intent.putExtra("item2", currentBreakfast1.getBox_Image());
        intent.putExtra("item3", currentBreakfast2.getMain());
        intent.putExtra("item4", currentBreakfast3.getName_I());


        startActivity(intent);

    }

    @Override
    public void onClick(View view) {
          switch (view.getId()){
              case R.id.Bbtn:
                  Intent intent = new Intent(Ipage.this, Ipage.class);
                  startActivity(intent);
                  break;
              case R.id.Lbtn:
                  Intent intent1 = new Intent(Ipage.this, Imainpage.class);
                  startActivity(intent1);
                  break;
              case R.id.Dbtn:
                  Intent intent2 = new Intent(Ipage.this, Isweetspage.class);
                  startActivity(intent2);
                  break;
              case R.id.Drbtn:
                  Intent intent3 = new Intent(Ipage.this, Ibeverages_page.class);
                  startActivity(intent3);
                  break;
              case R.id.home1:
                  Intent intent4 = new Intent(Ipage.this, Cuisines.class);
                  startActivity(intent4);
                  break;
          }
    }
}