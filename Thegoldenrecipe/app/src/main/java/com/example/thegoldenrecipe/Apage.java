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

public class Apage extends AppCompatActivity implements View.OnClickListener{
    private RecyclerView a_b_datalist;
    private List<Breakfast> breakfasts;
    private A_B_adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apage);


        breakfasts = new ArrayList<>();

        adapter = new A_B_adapter(this, new RecycleViewOnClickItem() {
            @Override
            public void OnItemClick(int position) { details(position);}
        },breakfasts);

        a_b_datalist= findViewById(R.id.a_b_datalist);
        Breakfast food1 = new Breakfast(R.drawable.hummus,   "Video link\n" +
                "https://www.themediterraneandish.com/how-to-make-hummus/\n"+
                "\n" +
                "\n" +
                "Ingredients\n" +
                "•\tChickpeas (3 cups). Chickpeas, also known as garbanzo beans, are the star ingredient in hummus. Canned or dry chickpeas? If you're wondering how to make hummus from scratch--the best, extra creamy, authentic stuff--you'll want to cook your own chickpeas from scratch (you'll give them a good soak overnight + boil in water until well-done. More on this later)\n" +
                "•\tGarlic (1 or 2 cloves). Start with 1 clove and make sure it is finely minced. Tip: to tame its pungency, allow minced garlic to sit in a little bit of lemon juice for a few minutes.\n" +
                "•\tTahini (⅓ cup). Tahini is a rich, nutty and slightly bitter paste made from toasted sesame seeds. (You can find my go-to tahini paste here).\n" +
                "•\tFresh Lemon Juice (from 1 lemon). Fresh lemon juice is just the thing to add tang here.\n" +
                "•\tKosher Salt. Just a pinch of kosher salt to your liking. You can always add more. If you're interested in adding\n" +
                "•\tExtra Virgin Olive Oil. A generous drizzle of quality extra virgin olive oil is the way to finish and serve this dip the authentic way. (You can find my go-to extra virgin olive oils at our online shop here)\n" +
                "•\tGarnish. Not to be underestimated. My favorite way to garnish a bowl of hummus, once the EVOO has been poured nicely right in the middle, is a few pinches of tangy sumac (sometimes ground cumin is a good addition). If you have some extra cooked chickpeas, plant them right in the middle. For a pop of green, you can add a garnish of fresh parsley.\n" +
                "\n" +
                "\n" +
                "\n" ,"Hummus",R.drawable.ing_hummus,R.drawable.orange);
        Breakfast food2 = new Breakfast(R.drawable.falafel, "Video link\n" +
                "https://youtu.be/foB6bxhZYF0"+
                "\n" +
                "Ingredients\n" +
                        "\n" +
                "- Dried chickpeas: AVOID using canned chickpeas! Dried chickpeas (that have been soaked in water for 24 hours) are an important ingredient that will give your falafel the right consistency and taste. (Tip: I usually add about ½ teaspoon of baking soda to the soaking water to help soften the dry chickpeas.)\n" +
                "- Fresh herbs: fresh parsley, cilantro, and dill are key to this authentic recipe.\n" +
                "- Onion: I typically use yellow onions, but white or red onions would work.\n" +
                "- Garlic: for best flavor, use fresh garlic cloves.\n" +
                "- Kosher salt and pepper: to taste.\n" +
                "- Spices: cumin, coriander, and a little cayenne pepper. Along with the fresh herbs, this trio of spices is what gives falafel it's bold authentic taste.\n" +
                "- Baking powder: this is what gives falafel an airy, fluffy texture (many recipes skip this, causing the falafel to come out too dense.)\n" +
                "- Sesame seeds: these are optional here, but I do like the added nuttiness.\n" +
                "\n" +
                "How to Make Falafel: Step-by-Step\n" +
                "\n" +
                "1.\tSoak chickpeas for 24 hours. Cover them in plenty of water and add baking soda to help soften them as they soak. The chickpeas will at least double in size as they soak. Drain very well.\n" +
                "\n" +
                "2.\tMake mixture. Add chickpeas, fresh herbs (parsley, cilantro, and dill), garlic, onion, and spices to food processor and pulse a little bit at a time until the mixture is finely ground. You’ll know it’s ready when the texture is more like coarse meal.\n" +
                "\n" +
                "3.\t& Refrigerate (important.) Transfer the falafel mixture to a bowl, cover and refrigerate for at least 1 hour or overnight. The chilled mixture will hold together better, making it easier to form the falafel patties.\n" +
                "\n" +
                "4.\tForm patties or balls. Once the falafel mixture has been plenty chilled, stir in baking powder and toasted sesame seeds, then scoop golf ball-sized balls and form into balls or patties (if you go the patties route, do not flatten them too much, you want them to still be nice and fluffy when they're cooked.)\n" +
                "\n" +
                "5.\t Fry. Frying is the traditional way to cook falafel and yields the most authentic and best result. Heat the oil on medium-high until it bubbles softly (your oil should be hot enough around 375 degrees F, but not too hot that it causes the falafel to fall apart.)\n" +
                "\n" +
                "6.\tCarefully drop the falafel in the oil, using a slotted spoon, and fry for 3-5 minutes until medium brown on the outside. Avoid over-crowding the falafel; fry them in batches if necessary.\n" +
                "\n" +
                "7.\tTip: it's always a good idea to fry one falafel first to make sure the oil temperature does not need to be adjusted.\n","Falafel",R.drawable.ing_falafel,R.drawable.orange);
        Breakfast food3 = new Breakfast(R.drawable.shakshuka, "Video link\n" +
                "https://youtu.be/m5Kn9WmOCrw"+
                "\n" +
                "\n" +
                "INGREDIENTS IN SHAKSHUKA\n" +
                "•\tPeppers: Red or orange bell peppers are best to blend with the sauce. But feel free to use whichever color you prefer.\n" +
                "•\tTomatoes: You can use fresh cherry tomatoes or fresh Roma tomatoes (when in season). You’ll also need a can of diced tomatoes and a basic tomato puree.\n" +
                "•\tOnion: I prefer white, but red or shallots work too.\n" +
                "•\tEggs: Chicken or even duck eggs work great.\n" +
                "•\tOlive oil: Or your favorite cooking oil.\n" +
                "•\tSmoked paprika & chilis: These make up the base spices, but feel free to add other shakshuka spices like cumin or cayenne pepper. You can also add red pepper flakes.\n" +
                "•\tSalt & black pepper: To taste.\n" +
                "•\tParsley: To garnish. Or use cilantro if preferred\n" +

                "HOW TO MAKE THE BEST SHAKSHUKA\n" +
                "Before serving, I like to top my easy shakshuka with parsley and another sprinkle of pepper. Before serving, I like to top my easy shakshuka with parsley and another sprinkle of pepper. HOW TO MAKE THE BEST SHAKSHUKA\n" +
                "This dish really is as simple as lightly frying some vegetables in a thick, rich tomato sauce and cracking eggs into it. However, here is my favorite easy way how to make shakshuka.\n" +
                "STEP 1: PREP THE VEG\n" +
                "Start by prepping the vegetables. Chop the onion and peppers. If using large tomatoes, cut them in quarters.\n" +
                "\n" +
                "STEPS 2: COOK THE SHAKSHUKA BASE\n" +
                "Warm a large skillet over medium heat and add olive oil. Once hot, add the onion and pepper to the pan. Sauté them over high-medium heat for a couple of minutes until the peppers have softened.\n" +
                "Next, add the chilis, paprika, salt, and pepper. Stir to incorporate them into the onion-pepper mixture.\n" +
                "Throw in the cherry tomatoes and leave to simmer for a couple of minutes. I add them in whole. However, you can also add them diced. \n" +
                "Add the canned tomatoes and tomato paste and stir well, to thoroughly combine. \n" +
                "STEPS 3: ADD THE EGGS\n" +
                "Carefully crack the eggs into the pan. Cook for a few minutes until the desired doneness of the eggs. I prefer to cook until my egg whites are cooked, but the yolks are still a littlen runny. \n" +
                "You can cook this uncovered, but then it will take longer to cook the eggs through. If covering the pan, then it’s best to place a kitchen towel between the lid and pot. This will capture the condensation from the steaming pan. It will allow your eggs to steam without the cover dropping liquid back onto your shakshouka and making it “watery”. \n" +
                "\n" +
                "Before serving, I like to top my easy shakshuka with parsley and another sprinkle of pepper.\n","Shakshuka", R.drawable.shakshuka,R.drawable.orange);
        Breakfast food4 = new Breakfast(R.drawable.balaleet,   "Video Link\n" +
                "https://youtu.be/qa1CFQSy_2A\n"+
                "Ingredients\n" +
                "•\t 6 tablespoons ghee, plus more for eggs\n" +
                "•\t 2 small shallots, sliced into rings\n" +
                "•\t 1 small onion, thinly sliced\n" +
                "•\t 1 teaspoon kosher salt, plus more for eggs\n" +
                "•\t 1/8 teaspoon ground cardamom\n" +
                "•\t 2 1/2 cups broken wheat vermicelli (Middle Eastern variety)\n" +
                "•\t Large pinch of saffron threads\n" +
                "•\t 2 cups boiling water\n" +
                "•\t 1/4 cup sugar\n" +
                "•\t 12 large eggs\n" +
                "•\t 1 cup flat-leaf parsley leaves, finely chopped\n" +
                "Directions\n" +
                "Instructions Checklist\n" +
                "•\t Step 1\n" +
                "Heat 2 tablespoons ghee in a medium nonstick skillet over medium-high. Add the shallots and cook until golden brown, 8 to 10 minutes. Transfer to a paper towel-lined plate and set aside. In the same skillet, add onion, season with 1/4 teaspoon salt, and cook until deep golden brown, about 15 minutes. Add cardamom and cook for 1 minute.\n" +
                "•\t Step 2\n" +
                "Meanwhile, melt 3 tablespoons ghee in a large skillet over medium heat. Add vermicelli and cook until golden brown. Add the saffron, boiling water, and remaining 3/4 teaspoon salt. Cook, stirring, until the vermicelli is cooked and the water has evaporated, about 4 minutes. Stir in sugar and cook until sugar has melted and has been absorbed by the noodles, 2 to 3 minutes. Stir in the cooked onion. Set aside; keep warm.\n" +
                "•\t Step 3\n" +
                "Heat remaining 1 tablespoon ghee in a nonstick skillet over low. Whisk 2 eggs with 1 tablespoon water until well combined, then add to the skillet and season with salt. Cook, without stirring, until the eggs are just set but not brown, about 2 minutes. Top the eggs with some of the reserved noodles and fold to enclose, as desired. Transfer to a plate and top with some of the reserved fried shallots and chopped parsley. Repeat with the remaining eggs, vermicelli, shallots, and parsley, adding more ghee to skillet as needed.\n" +
                "\n" +
                "\n" ,"Balaleet",R.drawable.ing_balaleet,R.drawable.orange);
        Breakfast food5 = new Breakfast(R.drawable.foul_mudammas,  "Video link\n" +
                "https://youtu.be/4RFr35TPayM\n"+
                "\n" +
                "Ingredients for this recipe\n" +
                "There are four simple components to this foul mudammas recipe:\n" +
                "1. Fava beans (canned or dry?)\n" +
                "For this recipe,  you'll need to use canned or already cooked fava beans. I am using canned fava beans here for a short cut (2 cans of fava beans or 3 cups).\n" +
                "But, if you want to make foul from scratch, you can start with 1 cup dry fava beans. You'll need to soak the beans overnight. Drain fully, then cook in plenty of water for about 1 hour or so until tender (see recipe notes.)\n" +
                "2. Seasoning & lemon garlic sauce with chili peppers \n" +
                "The flavor makers in this recipe are decidedly Mediterranean. We start with a pinch of fragrant ground cumin, which adds great depth and aids with digestion.\n" +
                "But the bold flavors in this simple fava bean stew come from a spicy sauce made with crushed garlic, chili peppers and fresh lemon juice.\n" +
                "Don't worry, this foul mudammas recipe is not necessarily spicy. The lemon juice tames the spicy peppers pretty well, so the sauce actually adds enough of a kick without being overwhelming.\n" +
                "3. Extra virgin olive oil\n" +
                "May seem like a small component of this recipe, but you'll need a generous drizzle of quality extra virgin olive oil. The EVOO will add flavor and provide that velvety finish to the stewed fava beans. I used Early Harvest Greek extra virgin olive oil\n" +
                "4. Fresh toppings\n" +
                "I love adding a good bunch of fresh parsley and some diced tomatoes on top. Some people like adding chopped onions, but I prefer to serve green onions on the side.\n" +
                "How to make foul mudammas: Step-by-step\n" +
                "Starting with canned or already cooked fava beans, there are three simple steps to make fava beans: warm up the beans and smash them, add flavor, top with fresh veggies.\n" +
                "1. Heat, mash and season fava beans\n" +
                "Remember, you are starting with canned or already cooked fava beans. Drain fava beans and place in a deep skillet or saucepan. Heat over medium-high heat with about ½ cup of water. Season with a little kosher salt and ground cumin (cumin adds depth here, but it also helps digestion.)  Remove from heat.\n" +
                "Using your potato masher or the back of a fork, mash the beans (you don't have to mash every single bean, but just do your best to mash them some so they're nice and soft)\n" +
                " Add spicy lemon-garlic sauce and extra virgin olive oil \n" +
                "Using a mortar and pestle, smash garlic and green chili peppers. Add lemon juice and mix.\n" +
                "Tip: the lemon juice tames the chili peppers quite a bit, so this sauce adds a good kick to foul mudammas but it is not overwhelmingly spicy. Just the perfect balance.\n" +
                "Pour the spicy sauce over the fava beans and stir. Add a generous drizzle of extra virgin olive oil (I used Early Harvest Greek extra virgin olive oil) Add fresh toppings\n" +
                "Top the foul mudammas with fresh parsley, diced tomatoes, and a few slices of hot peppers, if you like. Serve with a side of warm pita bread (see more about how to serve it below.)\n" +
                "How to serve it? \n" +
                "You can call it foul for short! Foul mudammas is best served with warm pita bread. You can add sliced tomatoes, cucumbers, fresh green onions and olives to go along.\n" ,"Foul mudammas",R.drawable.ing_foul,R.drawable.orange);
        Breakfast food6 = new Breakfast(R.drawable.liver,   "Video link\n" +
                "https://youtu.be/Jg65U47aqEg\n"+
                "\n" +
                "Ingreients"+
                "\n" +
                "1 tbsp olive oil and a knob of butter\n" +
                "2 medium red onions, thinly sliced\n" +
                "leaves from 1 sprig fresh thyme or pinch dried thyme\n" +
                "salt and pepper\n" +
                "pinch of sugar\n" +
                "6 slices pancetta or 4 rashers streaky bacon\n" +
                "4 x 1 cm slices Scotch Lamb's liver\n" +
                "4 tbsp milk\n" +
                "1 tbsp plain flour, seasoned with salt and pepper and a pinch of mustard powder\n" +
                "4 tbsp Madeira mixed with 4 tbsp water\n" +
                "\n" +
                "•\tFirst prepare the onions. Heat a non-stick pan, add the oil and butter and when the butter is foaming add the onions and cook over a low heat for 5 to 8 minutes, until softened and translucent, don't allow them to brown at this stage. Sprinkle the thyme leaves, salt, pepper and sugar over the onions and continue to cook, stirring from time to time until they are brown and well caramelised, about 30 minutes in all.\n" +
                "1\n" +
                "•\tMeanwhile turn the slices of liver in the milk and leave to soak for 5 minutes, then drain, discard the milk and pat the liver dry with kitchen paper. Toss the liver in the seasoned flour, shaking off any excess.\n" +
                "2\n" +
                "•\tHeat a non-stick pan and cook the pancetta or bacon until crisp and reserve the fat to cook the liver. Keep the pancetta warm while you fry the liver for 3 to 5 minutes on each side until golden brown. Set aside with the pancetta.\n" +
                "3\n" +
                "•\tAdd the Madeira and water to the pan and let it bubble for a minute or two and incorporate all the sticky bits from the base of the pan into the sauce. Add the liver slices and onions to the sauce to heat through and to make sure the liver is cooked through, although it can be a little pink in the middle if you like.\n" +
                "4\n" +
                "•\tTransfer the liver to warmed plates, spoon over the onions and sauce and top with the pancetta.\n" +
                "\n" ,"Pan seered liver",R.drawable.ing_liver,R.drawable.orange);
        Breakfast food7 = new Breakfast(R.drawable.mutabal,  "Video link\n" +
               " https://youtu.be/1WcQxkz8tMc"+
                "\n" +
                "\n" +
                "WHAT'S IN THIS MUTABAL RECIPE?\n" +
                "Eggplants. Eggplants have a somewhat mild and slightly bitter taste with a spongy and soft texture when cooked. Choose the fresher-looking eggplants in the market for a better taste and texture of your Mutabal.\n" +
                "Tahini. It may have a texture and appearance similar to peanut butter, but it does not taste like it. Tahini is not sweet in the same way that most nut butter is, and the nutty flavor of Tahini is robust and earthy, with a hint of bitterness.\n" +
                "Garlic. Garlic has a flavor that can be described as spicy in some ways, though not in the same manner as chili peppers or peppercorns. It's more that it generates such a warm sensation that it comes across as spicy to the taste buds. A certain earthiness can be detected in the flavor, which will work well with the other ingredients in the recipe.\n" +
                "Yogurt. Choose a full-fat yogurt for the recipe, since it has a richer texture that will help make the dish more creamy.\n" +
                "Lime Juice. Add a more interesting taste to your Mutabal by adding just the right amount of lime juice to the yogurt mixture. \n" +
                "\n" +
                "Cumin Powder. The taste of Mutabal is improved by the addition of cumin powder, which imparts a warm, earthy flavor and scent with a hint of sweetness and bitterness.\n" +
                "Salt. Adding salt intensifies aromas and balance other flavors within the recipe.\n" +
                "Pomegranate Seeds. Pomegranate seeds have a flavor that is similar to that of cranberries: they are tart with a hint of sweetness underneath that is why they will go well as a garnish for the Mutabal.\n" +
                "Olive Oil. Drizzle your Mutabal with olive oil before serving.\n" +
                "Parsley. Add some green to your Mutabal serving by garnishing it with parsley as well.\n" +
                "\n" +
                "\n" +
                "1.\tPreheat the oven to 175°C and line a baking sheet with baking parchment.\n" +
                "2.\tIn a small mixing bowl, mix together tahini, yogurt, garlic, lime juice, cumin powder, and salt, then set aside.\n" +
                "3.\tPeel off the skin of eggplant, then slice it, then add into the baking sheet, brush with oil on both sides.\n" +
                "4.\tBake for 50-55 minutes or until tender and soft.\n" +
                "Take the eggplant out of the oven and allow it to cool down for 5-10 minutes.\n" +
                "5.\tMash the eggplants using a fork.\n" +
                "6.\tAdd the yogurt mixture to the mashed eggplant, mix until combined.\n","Mutabal",R.drawable.ing_mutabal,R.drawable.orange);

        Breakfast food8 = new Breakfast(R.drawable.zaaatar_manouche,  "Video Link\n" +
                "https://youtu.be/ARmQEJK2qTg\n" +
                "\n"+
                "INGREDIENTS\n" +
                "o\tYeast: Use instant yeast to start to create the dough for a light and spongy texture. We activate it in warm water and add a little salt and sugar.\n" +
                "o\tFlour: Use all-purpose flour for the best results. If you have a gluten intolerance, you can use a 1:1 GF flour.\n" +
                "o\tOil: Oil helps to add moisture to the dough as well as being used in the zaatar spread. Olive oil is first choice, but a vegetable oil will work well.\n" +
                "o\tZaatar: The bread dough is spread with a mix of zaatar and olive oil for one delicious bite.\n" +
                "HOW TO MAKE ZAATAR MANAKEESH\n" +
                "MAKING THE DOUGH\n" +
                "Start by activating the yeast with warm water. Give it about 10 minutes and you’ll notice the yeast slowly dissolving into the warm water to become integrated. Then add salt and sugar, mix and wait a few minutes.\n" +
                "Next you’ll add olive oil and mix to combine. You’ll notice some beads of olive oil, but that’s completely normal. Now you’re ready to add the flour. Mix it in the bowl until it becomes shaggy and you can’t mix with a wooden spoon anymore.\n" +
                "Then transfer to a flat floured surface and knead with your hands. This step will take a few minutes, but it’s honestly so therapeutic that I don’t mind it one bit. You’re looking for a smooth surface dough ball with as little bumps as possible.\n" +
                "Finally, return the dough to the same bowl you used to mix the ingredients and add a little olive oil. Now’s the waiting part. Cover the dough with a plastic wrap or towel to allow it to rise.\n" +
                "It will triple in size after 45-60 minutes. And that’s when you’re officially ready to make zaatar manakeesh.\n" +
                "MAKING THE ZAATAR SPREAD\n" +
                "This is the easiest step of making zaatar manakeesh and only requires two ingredients: zaatar spice and extra virgin olive oil. You want to mix the two ingredients in a bowl until they form a spread similar to the consistency of pesto.\n" +
                "You don’t want too much olive oil because then the spread will leak while baking. And you don’t want too much zaatar where it looks like a paste because the taste becomes overpowering for the amount of flatbread it’s spread on. A good ratio I found for a pound of dough is about ⅓ cup of zaatar to ¼ cup olive oil. You can also start pouring olive oil slowly over the zaatar, and find the consistency that works for you.\n" +
                "ASSEMBLING AND BAKING THE MANAKEESH\n" +
                "When the dough rises, you will to divide it into 6-8 equal parts. This makes large single serve portions that you can eat as a whole meal for breakfast or lunch. If you prefer to make smaller manakish to serve as an appetizer, you can even cut the dough into 12 equal parts. I think it’s much faster to make larger ones, and you can always use a pizza cutter to cut each one into triangle slices.\n" +
                "Then you’ll spread the zaatar mix on the round small flatbread. Spread in a circular motion evenly throughout the center of the dough, leaving the edges dry.\n" +
                "Bake them in a preheated oven until they’re lightly golden on the edges and underneath. They will puff up and spread slightly while baking in the oven. The result is a chewy and crisp zaatar bread that is full of warm spices and amazing flavor.\n" +
                "TIPS TO MAKE THIS RECIPE\n" +
                "1.\tUse an instant yeast to make this zaatar bread quickly. Active yeast can also be used but it will take a little bit longer to activate.\n" +
                "2.\tDon’t skip the rising time. The beauty of these flat breads is their light and fluffy texture. If you make them to soon, they will be tougher and chewier in texture.\n" +
                "3.\tBake in a preheated oven. This allows them to cook evenly through. If you put them in a cold oven, the outsides will be cooked before the middles.\n" +
                "4.\tEnjoy them plain. These zaatar manakeesh are so delicious with the spread, but you can easily enjoy them plain if you prefer.\n" +
                "\n" ,"Zaatar manouche", R.drawable.ing_zaatar_manouche,R.drawable.orange);

        breakfasts.add(food1);
        breakfasts.add(food2);
        breakfasts.add(food3);
        breakfasts.add(food4);
        breakfasts.add(food5);
        breakfasts.add(food6);
        breakfasts.add(food7);
        breakfasts.add(food8);



        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2 ,GridLayoutManager.VERTICAL,false);
        a_b_datalist.setLayoutManager(gridLayoutManager);
        a_b_datalist.setHasFixedSize(true);

        a_b_datalist.setAdapter(adapter);

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
    public void detailsOnClick (View  view ){

    }
    public void details(int position){
        Breakfast currentBreakfast = breakfasts.get(position);
        Breakfast currentBreakfast1 = breakfasts.get(position);
        Breakfast currentBreakfast2 = breakfasts.get(position);
        Breakfast currentBreakfast3 = breakfasts.get(position);

        Intent intent = new Intent(Apage.this, Example.class);

        intent.putExtra("item1", currentBreakfast.getDiscription());
        intent.putExtra("item2", currentBreakfast1.getBox_Iamge());
        intent.putExtra("item3",currentBreakfast2.getMain());
        intent.putExtra("item4",currentBreakfast3.getName());


        startActivity(intent);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Bbtn:
                Intent intent = new Intent(Apage.this, Apage.class);
                startActivity(intent);
                break;
            case R.id.Lbtn:
                Intent intent1 = new Intent(Apage.this, Amainpage.class);
                startActivity(intent1);
                break;
            case R.id.Dbtn:
                Intent intent2 = new Intent(Apage.this, Asweetspage.class);
                startActivity(intent2);
                break;
            case R.id.Drbtn:
                Intent intent3 = new Intent(Apage.this, Abeveragespage.class);
                startActivity(intent3);
                break;
            case R.id.home1:
                Intent intent4 = new Intent(Apage.this, Cuisines.class);
                startActivity(intent4);
                break;
        }
    }
}