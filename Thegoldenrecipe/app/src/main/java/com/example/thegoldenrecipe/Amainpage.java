package com.example.thegoldenrecipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class Amainpage extends AppCompatActivity implements View.OnClickListener {
    private  RecyclerView a_m_datalist;
    private List<Maindish_A> maindishesA;
    private A_M_adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amainpage);



       maindishesA = new ArrayList<>();

        adapter = new A_M_adapter(this, new RecycleViewOnClickItem() {
            @Override
            public void OnItemClick(int position) { details2(position);}

        }, maindishesA);


        a_m_datalist = findViewById(R.id.a_m_datalist);
        Maindish_A  food1 = new Maindish_A(R.drawable.muluckiyah,"Video link\n" +
                "https://youtu.be/vWc5JzgAkIQ\n" +
                "\n" +
                "You will need:\n" +

                "•\tCooking liquid: usually chicken broth or rabbit broth is used. You can use any broth of your choice.\n" +
                "\n" +
                "•\tFrozen Molokhia: in this recipe I've used frozen Molokhia.\n" +
                "\n" +
                "•\tDry coriander: preferably freshly roasted and ground coriander, the smell is more heavenly.\n" +
                "\n" +
                "•\tGarlic: lots and lots of garlic. Some people like to mince a whole head of garlic.\n" +
                "\n" +
                "•\tGhee: I love using ghee in many recipes, butter is ok as well use oil if you prefer to.\n" +
                "\n" +
                "•\tBullion cube: this is to add more flavor to the molokhia, you can skip it if you have none.\n" +
                "\n" +
                "•\tTomato sauce: This is one of the new things I've added to my recipe. It adds a hint of both tartness and sweetness. Some people add sugar some or tomato paste. if you are not used to adding tomatoes to your molokhia feel free to skip this ingredient.\n" +
                "\n" +
                "•\t     Baking soda: this one is to maintain a fresh green look for your Molokhia. This is very helpful if you will be making a big batch of molokhia or you intend to keep it the the fridge for 3 days or so. Feel free to skip.\n" +
                "\n" +
                "\n" +
                "\n" +
                "•\tIn a deep pot over medium-high heat melt ghee.\n" +
                "\n" +
                "•\tSauté garlic for 15-30 seconds.\n" +
                "\n" +
                "•\tUntil lightly golden and fragrant as shown in picture 3.\n" +
                "\n" +
                "•\tAdd coriander and keep stirring for another 30 seconds.\n" +
                "\n" +
                "•\tThe coriander will give its fragrance and turn a little more dark brown.\n" +
                "\n" +
                "•\tPour in some of the broth keeping the rest after we check consistency at the end.\n" +
                "\n" +
                "•\tSprinkle the bouillon cube. Stir until it is dissolved.\n" +
                "\n" +
                "•\tAdd the baking soda if you chose to, notice that the broth will foam.\n" +
                "\n" +

                "•\tAdd the Molokhia, and turn down the heat to medium low, keep stirring every now and then.\n" +

                "•\tMolokhia will slowly melt in the broth. Wait until it has completely melted.\n" +

                "•\tPour in the tomato sauce and stir well.\n" +

                "•\tCheck consistency: if it is too thick for your liking add more broth.\n" +

                "•\t\n" +

                "\n" +
                "•\tCheck the seasoning and sweetness: if you need salt or more tomato sauce.\n" +
                "•\tServe with rice and pita bread.\n" +
                "\n", "Muluckiyah",R.drawable.ing_mulukhiya, R.drawable.orange);
        Maindish_A  food2 = new Maindish_A(R.drawable.chicken_machboos, "Video link\n" +
                "https://youtu.be/dsu7LAOJX-E\n"+
                "INGREDIENTS\n" +
                "\n" +
                "\n" +
                "  \n" +
                "•\t2 and ½ cup of Basmati Rice\n" +
                "•\t10 pieces of Chicken Leg, Thigh and Wings\n" +
                "•\t1 cup of chopped onion\n" +
                "•\t5 cloves of garlic\n" +
                "•\tWater for boiling the chicken\n" +
                "•\t1 cup of water if the chicken stock is not enough to boil the rice (Optional)\n" +
                "Spices and Herbs\n" +
                "•\t2 Black Lemon / Lime\n" +
                "•\t6 Bay Leaf\n" +
                "•\t6 cloves\n" +
                "•\t5 to 6 Cardamom Pods\n" +
                "•\t½ teaspoon of cumin\n" +
                "•\t¼ teaspoon of cinnamon powder\n" +
                "•\t1 teaspoon of curry\n" +
                "•\t¾ teaspoon of coriander\n" +
                "•\t½ teaspoon of turmeric\n" +
                "•\tSalt and Black Pepper for Taste\n" +
                "\n" +
                "INSTRUCTIONS\n" +
                " \n" +
                "1.\tTurn on the heat. Put the chicken in the cooking pot and add water. Let the chicken boil.\n" +
                "2.\t While the chicken is boiling, remove the excess fats from the chicken.\n" +
                "Once the excess fats are removed, add the spices, onion, and garlic into the boiling pot. Let it boil for 45 minutes or until the chicken is soft.\n" +
                "\n" +
                "Remove the onion, garlic, and other solid ingredients. Separate them from the Chicken Stock for later use\n" +
                "\n" +
                "Now you have the stock. Put the basmati or long-grain rice into the stock. If the stock is not enough, add more water.\n" +
                "\n" +
                "While the rice is boiling. Add oil in the separate pan, and fry chicken to have a nice brown crispy texture\n" +
                "\n" +
                "When the rice is already cooked, put the chicken on the top of the rice. Mix them well with the rice before serving. Garnished with parsley.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Video link \n" +
                "\n"
                ,"Chicken Machboos",R.drawable.ing_chicken_machboos,R.drawable.orange);
        Maindish_A  food3 = new Maindish_A(R.drawable.iraqi_kebab, "Video link\n" +
                "https://youtu.be/U01O1JNA0XY\n"+
                "\n" +
                "\n" +
                "Ingredients\n" +
                "•\t1½ lb ground beef (or lamb) meat\n" +
                "•\t⅓ lb lamb fat , chopped\n" +
                "•\t1 onion , diced\n" +
                "•\t1 tomato , diced\n" +
                "•\t2 tablespoons chopped parsley\n" +
                "•\t2 teaspoons salt\n" +
                "•\t1 teaspoon black pepper\n" +
                "•\t½ teaspoon sumac\n" +
                "•\t½ teaspoon cumin\n" +
                "•\t1 teaspoon paprika\n" +
                "•\tFor the garnish\n" +
                "•\t1 tablespoon parsley\n" +
                "•\t½ teaspoon sumac\n" +
                "\n" +
                "\n" +
                "Instructions\n" +
                "1.\tPlace the diced tomato and onion in the center of a large cheesecloth. Close the cheesecloth and squeeze very hard on the tomato and onion to extract the juice. Discard the juice.\n" +
                "2.\tIn a large bowl, mix all the ingredients as well as the squeezed tomato and onion.\n" +
                "3.\tLet the mixture rest for 1 hour in the refrigerator, kneading it every 15 minutes.\n" +
                "4.\tTake a piece of meat and squeeze firmly on a long, wide metal skewer and form a long kebab.\n" +
                "5.\tRenew the process until the meat is all used.\n" +
                "6.\tGrill the skewers for about 3 to 4 minutes per side, preferably on a charcoal fire. It is important to turn the skewer regularly otherwise the meat may come off the skewer.\n" +
                "7.\tSprinkle the skewers with 1 tablespoon chopped parsley and ½ teaspoon sumac and serve immediately with bell peppers and tomatoes, grilled on the same fire.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Video link\n"
                ,"Iraqi kebab",R.drawable.ing_iraqi_kebab,R.drawable.orange);
        Maindish_A food4 = new Maindish_A(R.drawable.bamia_stew, "Video link\n" +
                "https://youtube.com/shorts/uR9Msgexhzc?feature=share\n"+
                "\n" +
                "\n" +
                "Ingredients\n" +
                "•\t800 g Okra frozen is preferred\n" +
                "•\t350 g Brown onion finely diced\n" +
                "•\t15 g garlic crushed (approx. 5-6 cloves)\n" +
                "•\t500 g Ripe tomato chopped\n" +
                "•\t85 g Tomato Paste\n" +
                "•\t5 ml Pomegranate Molasses\n" +
                "•\t1 tsp Olive oil\n" +
                "•\t½ teaspoon Lebanese 7 spice All spice or cumin are good substitutes\n" +
                "•\t20 g Coriander fresh\n" +
                "•\t1 teaspoon Ground coriander\n" +
                "•\t250 ml Water\n" +
                "•\t1 Salt and pepper to taste\n" +
                "\n" +
                "1.\tOn high heat, heat up olive oil. Add onion and garlic and sweat until translucent\n" +
                "2.\tAdd okra and stir through, add tomato and stir through. Close lid and cook for approx. 7 minutes\n" +
                "3.\tAdd all other ingredients and stir through contents. Turn heat down to med-low and cook for another 20-25 minutes. Check in every 10 min or so.\n" +
                "4.\tBamia is done when everything has softened. Serve with vermicelli rice.\n" +
                "\n" +
                "You can try adding meat with the stew\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n"
               , "Bamia (Okra) Stew", R.drawable.ing_bamia_stew, R.drawable.orange);
        Maindish_A food5 = new Maindish_A(R.drawable.dolma,
                "Video link\n" +
                        "https://youtu.be/SwU2-5g39xk\n"+
                "Ingredients\n" +
                "\n" +
                "\n" +
                "•\t1 16-oz jar grape leaves in brine (about 60 to 70 leaves), I used Oralndo brand (affiliate link)\n" +
                "•\t1 ½ cup short grain rice, soaked in plenty of water for 15 minutes, then drained\n" +
                "•\tExtra virgin olive oil (I used Private Reserve Greek EVOO)\n" +
                "•\t1 large yellow onion, finely chopped\n" +
                "•\t12 oz lean ground beef\n" +
                "•\tKosher salt\n" +
                "•\tBlack pepper\n" +
                "•\t1 tsp allspice\n" +
                "•\t½ tsp cumin\n" +
                "•\t½ cup EACH chopped fresh parsley, fresh dill, and fresh mint\n" +
                "•\t1 to 2 tomatoes sliced into rounds\n" +
                "•\tAbout 4 cups or more low-sodium chicken broth or water\n" +
                "•\tJuice of 2 lemons\n" +
                "\n" +
                "\n" +
                "Prepare the Grape Leaves\n" +
                "1.\tIf using jarred grape leaves as I am here, remove them from the jar and discard the brine. Rinse the grape leaves well and place them in a colander to drain. (Later in the process, you'll remove the stems before stuffing.) (See notes if using fresh grape leaves)\n" +
                "Prepare the Stuffing\n" +
                "1.\tSoak the rice in plenty of water for about 15 to 20 minutes or until you are able to break one grain of rice easily. Drain well.\n" +
                "2.\tWhile the rice is soaking, cook the meat. Heat 1 tablespoon extra virgin olive oil in a large skillet. Add onions and cook briefly, about 2 minutes or so, tossing until translucent. Add the meat and cook till fully browned, tossing occasionally. Drain any excess fat, then season the meat with kosher salt, pepper, and spices. Toss to combine. Remove from heat and set aside to cool.\n" +
                "3.\tIn a mixing bowl, combine the meat, drained rice, and fresh herbs. Season lightly with kosher salt. Add a generous drizzle of extra virgin olive oil, and mix so that everything is well-incorporated.\n" +
                "\n" +
                "Stuff Grape Leaves, Assemble, and Cook\n" +
                "1.\tPrepare a heavy cooking pot and lightly brush the bottom with extra virgin olive oil. Arrange a few grape leaves in the bottom (I used the leaves that didn't look too great here and made three layers to protect the stuffed leaves from scorching later.) Top with sliced tomatoes.\n" +
                "2.\tTo stuff the grape leaves, you will work one leaf at a time. Place one grape leave on a cutting board the textured/rough side facing you. Take 1 heaping teaspoon of the filling and place in the center of the leave, then fold the sides over the filling and roll (think about this like rolling spring rolls or cigars.) Repeat with the remaining grape leaves or until you're out of stuffing.\n" +
                "3.\tNeatly arrange the grape leaves in row, seam side down, in your prepared pot, covering the circumference of the pot. Then place a small plate inverted on top. Boil the broth or water and pour over the grape leaves, arriving at the top layer and somewhat covering (about 4 cups liquid, maybe a little more.)\n" +
                "4.\tNow cover the pot with the lid and cook over medium heat for 30 minutes until the liquid has been absorbed.  Uncover and remove the plate, then pour juice of 2 lemons. Cover again with the lid (no need for the plate at this point), cook on low heat for 30 to 45 more minutes or until fully cooked.\n" +
                "To Serve\n" +
                "1.\tRemove grape leaves from heat. Allow to rest uncovered for 20 to 30 minutes before serving.\n" +
                "2.\tAdd a generous drizzle of quality extra virgin olive oil (I used Private Reserve EVOO), and transfer to a serving platter.\n" +
                "3.\tServe with a side of Greek Tzatziki sauce or plain yogurt and wedges of lemon. \n" +
                "\n" +
                "\n" ,"Dolma",R.drawable.ing_dolma,R.drawable.orange);
        Maindish_A food6 = new Maindish_A(R.drawable.mansaf, "Video link\n" +
                "\n" +
                "https://youtu.be/3tnvnWe4Oss\n" +
                "\n"+
                "Ingrediants\n" +
                "For the Meat\n" +
                "•\t2 lbs Lamb Meat cut into chunks (including bones)\n" +
                "•\t6 cups Water\n" +
                "•\t2 crystals Gum Arabic\n" +
                "•\t4 Cloves whole\n" +
                "•\t4 Cardamom pods\n" +
                "•\t1 Cinnamon Stick\n" +
                "•\t13 Allspice berries\n" +
                "•\t1 Bay Leaf\n" +
                "For the Rice\n" +
                "•\t2 cups Rice\n" +
                "•\t4 cups Water\n" +
                "•\t1½ tsp Salt\n" +
                "•\tPinch of Saffron\n" +
                "For the Laban Sauce\n" +
                "•\t1 Laban Jameed\n" +
                "•\t4 cups Water\n" +
                "For the Bread Base\n" +
                "•\t2 loaves shrak or tortillas\n" +
                "For the Topping\n" +
                "•\t4 tbsp Almonds blanched and chopped\n" +
                "•\t¼ cup Parsley chopped\n" +
                "\n" +
                "Instructions\n" +
                "For the Meat\n" +
                "1.\tPut the lamb in 6 cups of water, bring to a boil and add the spices.\n" +
                "2.\tWhen the water comes to a boil turn down to a slow simmer.\n" +
                "3.\tCook for 2 hours or until the meat is tender. Add more boiling water if necessary.\n" +
                "4.\tOnce the meat is done, pour through a sieve and preserve the water. Set the meat aside on a plate for later.\n" +
                "For the Laban Sauce\n" +
                "1.\tWrap the laban in a cloth and break into pieces with a hammer.\n" +
                "2.\tPlace the laban and 4 cups of water in a food processor and process until laban has dissolved.\n" +
                "3.\tPour laban into a bowl through a sieve, set aside.\n" +
                "4.\tPour the laban into the meat water, and put back on the heat. Bring to a boil.\n" +
                "5.\tAdd the lamb chunks to the sauce (leaving out the spices).\n" +
                "For the Rice\n" +
                "1.\tIn a pot, put 2 cups rice, 4 cups water, 1½ tsp salt and a pinch of saffron.\n" +
                "2.\tBring to a boil, then reduce to a simmer and cook until all the water has gone.\n" +
                "Bringing It All Together\n" +
                "1.\tToast your almonds in a frying pan with a little olive oil.\n" +
                "2.\tTear bread into little pieces on a plate as a base for the meal.\n" +
                "3.\tLadle some of the sauce over the bread on the plate.\n" +
                "4.\tSpread the rice over the bread.\n" +
                "5.\tLadle more sauce over the rice.\n" +
                "6.\tPlace the lamb chunks on top of the rice.\n" +
                "7.\tLadle more sauce over the top.\n" +
                "8.\tSprinkle toasted almonds and parsley over the entire dish.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n"
               ,"Mansaf", R.drawable.ing_mansaf, R.drawable.orange);
        Maindish_A food7 = new Maindish_A(R.drawable.mutabag_zbaidi,  "\n" +
                "\n" +
                "Video link\n" +
                "https://youtu.be/2EbTAo6AOOk\n"+
                "Ingredients\n" +
                "\n" +
                "Fish:\n" +
                "2 medium zebaidy fish\n" +
                "1/2 teaspoon black pepper\n" +
                "1/2 teaspoon tumeric\n" +
                "1 teaspoon cardamom powder\n" +
                "1 teaspoon coriander powder\n" +
                " \n" +
                "Rice:\n" +
                "1/4 cup oil\n" +
                "1 medium chopped onion\n" +
                "2 cups rice\n" +
                "2 teaspoons salt\n" +
                "2 whole black lemons\n" +
                " \n" +
                "Topping:\n" +
                "2 tablespoons oil\n" +
                "1 cup chopped onion\n" +
                "1/4 cup raisins\n" +
                "1 teaspoon black lemon powder\n" +
                "1/2 teaspoon reserved spices\n" +
                " \n" +
                "Mix the first four spices and reserve 1/2 teaspoon for the topping.\n" +
                " \n" +
                "To prepare fish, wash well, drain, and cut gashes in the fleshy sides. Then sprinkle with salt and rub with spices, and let it rest in the refrigerator for one hour. Fry in oil and drain.\n" +
                " \n" +
                "To prepare rice, wash it first and soak in tepid water for half an hour. Drain well. Fry chopped onion in oil. Add rice, salt, lemon, and 3 1/2 cups of hot water. Bring to a boil, then simmer until water is absorbed.\n" +
                " \n" +
                "To prepare topping, sauté onions and raisins in oil, then add reserved spices and sprinkle with salt.\n" +
                " \n" +
                "To serve, put rice on a serving plate, garnish with topping, and lay fish over the top.\n"
               ,"Mutabag Zbaidi", R.drawable.ing_mutabag, R.drawable.orange);
        Maindish_A food8 = new Maindish_A(R.drawable.murabian, "Video link \n" +
                "https://youtu.be/1Jl0SBANshw\n"+
                "\n" +
                "\n" +
                "Ingredients\n" +
                "•\t1/2 Tablespoon olive oil\n" +
                "•\t1/2 large onion thinly sliced lengthwise\n" +
                "•\t1 clove garlic mashed together with:\n" +
                "•\t1 teaspoon coriander and\n" +
                "•\t1/2 Tablespoon fresh ginger grated\n" +
                "•\t1 1 b peeled and deveined shrimp\n" +
                "•\t1/4 teaspoon black pepper\n" +
                "•\t1 large tomato cut into thick slices\n" +
                "•\t2 teaspoons kosher salt\n" +
                "•\t2 cups water\n" +
                "•\t2 cups basmati rice\n" +
                "•\tFor the topping:\n" +
                "•\t1/8 cup Olive oil\n" +
                "•\t1 yellow onion thinly sliced lengthwise\n" +
                "•\t1/4 teaspoon cardamom\n" +
                "•\t1/4 teaspoon black pepper\n" +
                "•\t1/4 teaspoon grated loomi Dried Black Lime\n" +
                "•\t1/2 teaspoon curry powder\n" +
                "•\t1/2 teaspoon ground turmeric\n" +
                "•\t1/4 teaspoon ground cloves\n" +
                "•\t1/4 cup fresh cilantro chopped\n" +
                "•\t1 clove garlic mashed with:\n" +
                "•\t1/2 teaspoon coriander\n" +
                "•\t1/4 teaspoon black pepper\n" +
                "•\t1 1 lb peeled and deveined shrimp\n" +
                "\n" +
                "\n" +
                "Instructions\n" +
                "1.\tHeat the oil over medium heat.\n" +
                "2.\tAdd sliced onions and saute until golden brown.\n" +
                "3.\tAdd in the garlic, spice mixture and pepper.\n" +
                "4.\tAdd in 1 1lb of shrimp and tomato slices\n" +
                "5.\tCook for 10 minutes over medium heat\n" +
                "6.\tAdd in the water and salt and bring to a boil.\n" +
                "7.\tAdd in the rice (rinsed and drained) and stir to mix all together\n" +
                "8.\tReduce heat and simmer until the water is absorbed.\n" +
                "9.\t(you can make the topping while the rice is cooking when done remove from heat and set aside.\n" +
                "10.\tTo make the topping:\n" +
                "11.\tSaute the onions in olive oil until golden brown\n" +
                "12.\tAdd the spices, chopped cilantro, grated loomi and mashed garlic mixture and stir together.\n" +
                "13.\tAdd in the remaining shrimp and saute until cooked through.\n" +
                "14.\tOn a platter put the rice mixture and then spoon the topping on top.\n" +
                "15.\tEnjoy!\n" +
                "16.\theat the olive oil and saute the onions until golden brown\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" ,"Murabian", R.drawable.ing_murabian, R.drawable.orange );


        maindishesA.add(food1);
        maindishesA.add(food2);
        maindishesA.add(food3);
        maindishesA.add(food4);
        maindishesA.add(food5);
        maindishesA.add(food6);
        maindishesA.add(food7);
        maindishesA.add(food8);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL,false);
        a_m_datalist.setLayoutManager(gridLayoutManager);
        a_m_datalist.setHasFixedSize(true);

        a_m_datalist.setAdapter(adapter);


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
    public void detailOnclick2 (View view){

    }

    public void details2 (int position){
        Maindish_A currentMaindish = maindishesA.get(position);
        Maindish_A currentMaindish1 = maindishesA.get(position);
        Maindish_A currentMaindish2 = maindishesA.get(position);
        Maindish_A currentMaindish3 = maindishesA.get(position);
        Intent intent = new Intent(Amainpage.this, Example_A_M.class);

        intent.putExtra("item1", currentMaindish.getDiscription2());
        intent.putExtra("item2", currentMaindish1.getBox_Image());
        intent.putExtra("item3", currentMaindish2.getMain());
        intent.putExtra("item4", currentMaindish3.getName());
        startActivity(intent);
    }





    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Bbtn:
                Intent intent = new Intent(Amainpage.this, Apage.class);
                startActivity(intent);
                break;
            case R.id.Lbtn:
                Intent intent1 = new Intent(Amainpage.this, Amainpage.class);
                startActivity(intent1);
                break;
            case R.id.Dbtn:
                Intent intent2 = new Intent(Amainpage.this, Asweetspage.class);
                startActivity(intent2);
                break;
            case R.id.Drbtn:
                Intent intent3 = new Intent(Amainpage.this, Abeveragespage.class);
                startActivity(intent3);
                break;
            case R.id.home1:
                Intent intent4 = new Intent(Amainpage.this, Cuisines.class);
                startActivity(intent4);
                break;
        }
    }
}
