package com.example.thegoldenrecipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Imainpage extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView i_m_datalist;
    private List<I_maindish> maindishI;
    private I_M_adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imainpage);

        maindishI = new ArrayList<>();


        adapter = new I_M_adapter(this, new RecycleViewOnClickItem() {
            @Override
            public void OnItemClick(int position) { details2_I(position);}

        },maindishI);



        i_m_datalist = findViewById(R.id.i_m_mdatalist);
        I_maindish food1 = new I_maindish(R.drawable.carbonara,"Video link\n" +
                "https://youtu.be/D_2DBLAt57c\n"+
                "\n" +
                "\n" +
                "\n" +
                "Ingredients\n" +
                "•\t1 tablespoon extra virgin olive oil or unsalted butter\n" +
                "•\t1/2 pound pancetta or thick cut bacon, diced\n" +
                "•\t1 to 2 garlic cloves, minced, about 1 teaspoon (optional)\n" +
                "•\t3 to 4 whole eggs\n" +
                "•\t1 cup grated Parmesan or pecorino cheese\n" +
                "•\t1 pound spaghetti (or bucatini or fettuccine)\n" +
                "•\tKosher salt and freshly ground black pepper to taste\n" +
                "Method\n" +
                "1.\tHeat the pasta water:\n" +
                "Put a large pot of salted water on to boil (1 tablespoon salt for every 2 quarts of water.)\n" +
                "2.\tSauté the pancetta or bacon and garlic:\n" +
                "While the water is coming to a boil, heat the olive oil or butter in a large sauté pan over medium heat. Add the bacon or pancetta and cook slowly until crispy.\n" +
                "Add the garlic (if using) and cook another minute, then turn off the heat and put the pancetta and garlic into a large bowl.\n" +
                "1.\tBeat the eggs and half of the cheese:\n" +
                "In a small bowl, beat the eggs and mix in about half of the cheese.\n" +
                "2.\tCook the pasta:\n" +
                "Once the water has reached a rolling boil, add the dry pasta, and cook, uncovered, at a rolling boil.\n" +
                "3.\tToss the pasta with pancetta or bacon:\n" +
                "When the pasta is al dente (still a little firm, not mushy), use tongs to move it to the bowl with the bacon and garlic. Let it be dripping wet. Reserve some of the pasta water.\n" +
                "Move the pasta from the pot to the bowl quickly, as you want the pasta to be hot. It's the heat of the pasta that will heat the eggs sufficiently to create a creamy sauce.\n" +
                "Toss everything to combine, allowing the pasta to cool just enough so that it doesn't make the eggs curdle when you mix them in. (That's the tricky part.)\n" +
                "Add the beaten egg mixture:\n" +
                "Add the beaten eggs with cheese and toss quickly to combine once more. Add salt to taste. Add some pasta water back to the pasta to keep it from drying out.\n" +
                "Serve at once with the rest of the parmesan and freshly ground black pepper. If you want, sprinkle with a little fresh chopped parsley.\n" +
                "\n" , "Carbonara", R.drawable.ing_carbonara,R.drawable.orange);
        I_maindish food2 = new I_maindish(R.drawable.fiorentina_steak,"Video link\n" +
                "https://youtu.be/iZFusc0Oc8o\n"+
                "\n" +
                "Ingredients\n" +
                "•\t1 Certified Angus Beef ® brand porterhouse, cut 2-3 inches thick\n" +
                "•\t1 Tbsp olive oil\n" +
                "•\t2 tsp coarse salt\n" +
                "•\t2 tsp coarse ground black pepper\n" +
                "Instructions\n" +
                "1.\tRemove the steak from the refrigerator at least 1 hour before grilling to let it come to room temperature.\n" +
                "2.\tPreheat your grill to a high to medium-high heat. \n" +
                "3.\tBrush the steak on all sides with olive oil and season one side with coarse salt and pepper.\n" +
                "4.\tGrill the steak, seasoned side down for 5 minutes. Season the second side and flip the steak. Grill on the second side for 5 minutes. Flip the steak again to grill for another 4-5 minutes on the first side. Then, flip the steak a final time.\n" +
                "5.\tUsing a meat thermometer or instant-read thermometer, insert it into the side of the steak so that it is about center of the strip. Use the temperature to determine how long you need to continue cooking your steak. (120F for rare, 130F for medium rare, 140F for medium – These temperatures take into account that the steak will continue to cook as it rests before serving.)\n" +
                "6.\tWhen the meat is done to your liking, remove it from grill and let it rest for 5 minutes for the juices to settle.\n" +
                "7.\tAfter resting, carve the filet and strip steaks off of the bone. Slice each steak against the grain and arrange it on a serving platter.\n" +
                "8.\tServe with extra coarse salt and pepper, as desired.\n" +
                "\n" +
                "\n" +
                "\n" , "Fiorentina steak", R.drawable.ing_steak, R.drawable.orange);
        I_maindish food3 = new I_maindish(R.drawable.lasagna,  "Video link \n" +
                "https://youtu.be/qEowX-vOb4E\n"+
                "\n" +
                "\n" +
                "Ingredients\n" +
                "For the meat sauce:\n" +
                "•\t2 teaspoons extra virgin olive oil\n" +
                "•\t1 pound ground beef chuck\n" +
                "•\t1/2 medium onion, diced (about 3/4 cup)\n" +
                "•\t1/2 large bell pepper (green, red, or yellow), diced (about 3/4 cup)\n" +
                "•\t2 cloves garlic, minced\n" +
                "•\t1 (28-ounce)can good-quality tomato sauce\n" +
                "•\t3 ounces tomato paste (half a 6-ounce can)\n" +
                "•\t1 (14 ounce) can crushed tomatoes\n" +
                "•\t2 tablespoons chopped fresh oregano, or 2 teaspoons dried oregano\n" +
                "•\t1/4 cup chopped fresh parsley (preferably flat leaf), packed\n" +
                "•\t1 tablespoon Italian seasoning\n" +
                "•\t1 pinch garlic powder and/or garlic salt\n" +
                "•\t1 tablespoon red or white wine vinegar\n" +
                "•\t1 tablespoon to 1/4 cup sugar (to taste, optional)\n" +
                "•\tSalt\n" +
                "To assemble the lasagna:\n" +
                "•\t1/2 pound dry lasagna noodles (requires 9 lasagna noodles - unbroken)\n" +
                "•\t15 ounces ricotta cheese\n" +
                "•\t1 1/2 pounds (24 ounces) mozzarella cheese, grated or sliced\n" +
                "•\t1/4 pound (4 ounces) freshly grated Parmesan cheese\n" +
                "Method\n" +
                "1.\tPut pasta water on to boil\n" +
                "Put a large pot of salted water (1 Tbsp salt for every 2 quarts of water) on the stovetop on high heat. It can take a while for a large pot of water to come to a boil (this will be your pasta water), so prepare the sauce in the next steps while the water is heating.\n" +
                "2.\tBrown the ground beef\n" +
                "In a large skillet heat 2 teaspoons of olive oil on medium high heat. Add the ground beef and cook until it is lightly browned on all sides.\n" +
                "Remove the beef with a slotted spoon to a bowl. Drain off all but a tablespoon of fat.\n" +
                "Cook the bell pepper, onions, garlic, add back the beef\n" +
                "Add the diced bell pepper and onions to skillet (in the photo we are using yellow bell pepper and red onions).\n" +
                "Cook for 4 to 5 minutes, until the onions are translucent and the peppers softened. Add the minced garlic and cook half a minute more.\n" +
                "Return the browned ground beef to the pan. Stir to combine, reduce the heat to low and cook for another 5 minutes.\n" +
                "Transfer to medium sized pot, add tomatoes and remaining sauce ingredients to build the sauce\n" +
                "Transfer the beef mixture to a medium sized (3- to 4-quart) pot. Add the crushed tomatoes, tomato sauce, and tomato paste to the pot.\n" +
                "Add the parsley, oregano, and Italian seasonings, adjusting the amounts to taste. Sprinkle with garlic powder and/or garlic salt, to taste.\n" +
                "Sprinkle with red or white wine vinegar. Stir in sugar, a tablespoon at a time, tasting after each addition, to taste. (The amount of sugar needed will vary, depending on how acidic the tomatoes are that you are using.)\n" +
                "Add salt to taste, and note that you will later be adding Parmesan, which is salty.\n" +
                "Bring the sauce to a simmer and then lower the heat to maintain a low simmer. Cook for 15 to 45 minutes, stirring often. Scrape the bottom of the pot every so often so nothing sticks to the bottom and scorches.\n" +
                "Remove from heat.\n" +
                "Boil and drain the lasagna noodles\n" +
                "By now the salted water you started heating in step one should be boiling. Add the dry lasagna noodles and cook them to al dente, per package directions. (Note noodles may be cooked in advance.)\n" +
                "Stir often to prevent from sticking. Make sure that water remains at a full rolling boil during the entire cooking to prevent noodles from sticking.\n" +
                "When ready, drain in a colander and rinse with cool water, gently separating any noodles that may be sticking together.\n" +
                "Spread a little olive oil on a large rimmed baking sheet, and lay out the cooked noodles on this sheet, turning them over so that they get coated with a little of the olive oil. This will prevent them from sticking together.\n" +
                "1.\tHeat the oven to 375°F\n" +
                "2.\tAssemble the lasagna\n" +
                "In a 9x13-inch casserole or lasagna dish, ladle a cup of sauce and spread it over the bottom of the dish. Arrange one layer of lasagna noodles lengthwise (about 3 long noodles, edge may overlap, depending on your pan) over the sauce. Ladle a third of the remaining sauce over the noodles.\n" +
                "Sprinkle a layer of a third of the grated mozzarella on top of lasagna sauce. Add half of the ricotta cheese, by placing cheese dollops every couple inches. Sprinkle half the grated parmesan cheese evenly over the top of ricotta cheese.\n" +
                "Apply second layer of noodles, top it with half of the remaining sauce. Add half of the remaining Mozzarella, the remaining ricotta cheese, and another the remaining Parmesan.\n" +
                "Finish with another layer of noodles. Spread the remaining sauce over the top layer of noodles and sprinkle with the remaining Mozzarella cheese.\n" +
                "1.\tBake\n" +
                "Cover the lasagna pan with aluminum foil, tented slightly so it doesn't touch the noodles or sauce). Bake at 375°F for 45 minutes. Uncover in the last 10 minutes if you'd like more of a crusty top or edges.\n" +
                "2.\tCool and serve\n" +
                "Allow the lasagna to cool at least 15 before serving. Leftovers will keep for about 5 days. May be reheated in conventional oven or microwave. Leave aluminum tent on for storage. (Try to keep the aluminum foil from touching the sauce.)\n" +
                "\n" +
                "\n" ,"Lasagna", R.drawable.lasagna, R.drawable.orange);
        I_maindish food4 = new I_maindish(R.drawable.margherita_pizza, "Video link\n" +
                "https://youtu.be/4VSW29yWPlA\n"+
                "\n" +
                "Ingredients\n" +
                "Yield: 2 servings\n" +
                "•\t112-inch round of pizza dough, stretched (see recipe)\n" +
                "•\t3tablespoons tomato sauce (see note)\n" +
                "•\tExtra-virgin olive oil\n" +
                "•\t2¾ounces fresh mozzarella\n" +
                "•\t4 to 5basil leaves, roughly torn\n" +
                "Preparation\n" +
                "1.\tStep 1\n" +
                "Place a pizza stone or tiles on the middle rack of your oven and turn heat to its highest setting. Let it heat for at least an hour.\n" +
                "2.\tStep 2\n" +
                "Put the sauce in the center of the stretched dough and use the back of a spoon to spread it evenly across the surface, stopping approximately ½ inch from the edges.\n" +
                "3.\tStep 3\n" +
                "Drizzle a little olive oil over the pie. Break the cheese into large pieces and place these gently on the sauce. Scatter basil leaves over the top.\n" +
                "4.\tStep 4\n" +
                "Using a pizza peel, pick up the pie and slide it onto the heated stone or tiles in the oven. Bake until the crust is golden brown and the cheese is bubbling, approximately 4 to 8 minutes.\n" +
                "\n" +
                "\n" , "Margherita Pizza ", R.drawable.ing_pizza, R.drawable.orange);
        I_maindish food5 = new I_maindish(R.drawable.ossabuco,  "Video link\n" +
                "https://youtu.be/EXrG445Ruuw\n"+
                "\n" +
                "Ingredients\n" +
                "For the Osso Buco\n" +
                "•\t4 ounces pancetta, diced into 1/4 inch cubes (see recipe note)\n" +
                "•\t2 1/2 to 3 pounds veal shanks (4 to 6 pieces 2 to 3 inches thick)\n" +
                "•\t1/2 cup diced carrot (1/4-inch dice)\n" +
                "•\t1/2 cup diced celery (1/4 inch dice)\n" +
                "•\t1 medium onion (1/4 inch dice)\n" +
                "•\t2 tablespoons chopped garlic (about 4 cloves)\n" +
                "•\t3 to 4 sprigs fresh thyme (or 1 teaspoon dried)\n" +
                "•\t1 cup dry white wine\n" +
                "•\t1 to 2 cups chicken or veal stock\n" +
                "•\tFlour for dusting the meat before browning\n" +
                "•\tSalt and pepper\n" +
                "For the Gremolata\n" +
                "•\t2 tablespoons Italian parsley\n" +
                "•\t1 tablespoon finely grated lemon zest\n" +
                "•\t2 cloves garlic, crushed and minced\n" +
                "Method\n" +
                "1.\tPreheat the oven:\n" +
                "Preheat the oven to 325°F.\n" +
                "2.\tBrown the pancetta:\n" +
                "Heat a Dutch oven on the stove top over medium heat for about 5 minutes. Add pancetta to pan, cook, stirring occasionally.\n" +
                "When the pancetta is crispy and most of the fat has rendered (about 5 minutes of cooking), remove the pancetta to a plate covered with some paper towel and set aside.\n" +
                "If necessary, drain off all but two tablespoons of the fat from the pan.\n" +
                "3.\tDredge the shanks in flour, brown in pan:\n" +
                "Place the flour in a shallow bowl or deep plate.\n" +
                "Season the veal shank well with salt and pepper. Dredge the veal shanks with some flour, shake off any excess, and add the meat to the hot fat in the pan.\n" +
                "Increase the heat to medium high and cook the shanks on each side until well browned (about 5 minutes per side). Remove the shanks to a plate, set aside.\n" +
                "Sauté the onions, carrots, celery:\n" +
                "Add the onions, carrots, and celery to the Dutch oven. Cook the onion mixture, stirring frequently, until the onions are translucent (about 5 minutes) and toss in the garlic and thyme.\n" +
                "Continue cooking until the vegetables just begin to brown (about 10 minutes).\n" +
                "Return the shanks to pan, add wine and stock:\n" +
                "Add the shanks and the pancetta back to the pan. Pour in the wine and then add enough stock to come a little more than halfway up the sides of the shanks.\n" +
                "Bring to a simmer. Cover the pan and put it in the oven to cook until the meat is tender, about 1 to 1 1/2 hours.\n" +
                "Make the gremolata:\n" +
                "Combine the gremolata ingredients, place in a separate small serving dish.\n" +
                "Serve on top of risotto or polenta. Sprinkle with gremolata.\n" +
                "\n" , "Osso Bucco", R.drawable.ing_ossobucco,R.drawable.orange);
        I_maindish food6 = new I_maindish(R.drawable.polenta, "Video link\n" +
                "https://youtu.be/O-p0Rqc8Xo0\n"+
                "\n" +
                "Ingredients\n" +
                "\n" +
                "•\t 4 cups water\n" +
                "•\t 1 teaspoon fine salt\n" +
                "•\t 1 cup polenta\n" +
                "•\t 3 tablespoons butter, divided\n" +
                "•\t ½ cup freshly grated Parmigiano-Reggiano cheese, plus more for garnish\n" +
                "Directions\n" +
                "Instructions Checklist\n" +
                "•\t Step 1\n" +
                "Bring water and salt to a boil in a large saucepan; pour polenta slowly into boiling water, whisking constantly until all polenta is stirred in and there are no lumps.\n" +
                "•\t Step 2\n" +
                "Reduce heat to low and simmer, whisking often, until polenta starts to thicken, about 5 minutes. Polenta mixture should still be slightly loose. Cover and cook for 30 minutes, whisking every 5 to 6 minutes. When polenta is too thick to whisk, stir with a wooden spoon. Polenta is done when texture is creamy and the individual grains are tender.\n" +
                "•\t Step 3\n" +
                "Turn off heat and gently stir 2 tablespoons butter into polenta until butter partially melts; mix 1/2 cup Parmigiano-Reggiano cheese into polenta until cheese has melted. Cover and let stand 5 minutes to thicken; stir and taste for salt before transferring to a serving bowl. Top polenta with remaining 1 tablespoon butter and about 1 tablespoon freshly grated Parmigiano-Reggiano cheese for garnish.\n" +
                "\n" ,"Polenta", R.drawable.ing_polenta, R.drawable.orange);
        I_maindish food7 = new I_maindish(R.drawable.ribollita, "Video link\n" +
                "https://youtu.be/sp22f8VrcXY\n"+
                "1\n" +
                "Ingredients\n" +
                "1\n" +
                "large onion\n" +
                "3\n" +
                "medium carrots\n" +
                "2\n" +
                "celery stalks\n" +
                "8\n" +
                "garlic cloves\n" +
                "2\n" +
                "bunches Tuscan kale\n" +
                "1\n" +
                "small wedge of Parmesan with rind\n" +
                "1\n" +
                "28-oz. can whole peeled tomatoes\n" +
                "½\n" +
                "loaf crusty country bread (about 10 oz.)\n" +
                "⅓\n" +
                "cup extra-virgin olive oil, plus more for drizzling\n" +
                "Kosher salt\n" +
                "1\n" +
                "14-oz. can cannellini beans\n" +
                "¾\n" +
                "tsp. crushed red pepper flakes\n" +
                "Preparation\n" +
                "Step 1\n" +
                "Place a rack in middle of oven; preheat to 450°. Time to prep your veg! You are going to make a mirepoix, which is just a fancy French word for the combo of chopped onions, carrots, and celery that form the flavor base for a lot of European dishes. First, cut 1 large onion in half through root. Peel and discard skins. Finely chop and transfer to a medium bowl.\n" +
                "Step 2\n" +
                "Wash, peel, and trim 3 medium carrots. Cut in half (or in quarters lengthwise if they’re large), then cut crosswise into ½\" pieces. (You can also just chop the carrots down into coins if you don't mind larger pieces of veg in your soup.) Add to bowl with onion.\n" +
                "Step 3\n" +
                "Chop 2 celery stalks crosswise into ½\" pieces. Add to bowl with the rest of the mirepoix.\n" +
                "Step 4\n" +
                "Smash and peel 8 garlic cloves with the back of your knife. If any of them are left more or less intact after that initial smashing, give them another good wack with the back of your knife so they really open up and start to break apart. Add to bowl, also.\n" +
                "Step 5\n" +
                "Strip stems from 2 bunches Tuscan kale and discard. Wash if they're gritty or you really care about washing vegetables, then tear leaves into 2\" pieces; set aside.\n" +
                "Step 6\n" +
                "Cut rind off of 1 small Parmesan wedge; set aside.\n" +
                "Step 7\n" +
                "Place 28 oz. canned tomatoes and their juices in a strainer set inside a medium bowl. (You need that bowl to collect the juice, which you're going to use later—don't throw it out!) Squeeze tomatoes and crush them with your hands while leaving them submerged in their liquid so they don’t squirt.\n" +
                "Step 8\n" +
                "Tear ½ loaf crusty country bread into 1½\" pieces.\n" +
                "Step 9\n" +
                "Heat ⅓ cup extra-virgin oil in a medium Dutch oven or heavy pot over medium. Add bowl of mirepoix and 2 tsp. salt and cook, stirring occasionally, until vegetables are softened but not browned, 8–10 minutes.\n" +
                "Step 10\n" +
                "Lift strainer full of tomatoes and give it a few shakes to remove any liquid. Add tomatoes (but not juices!) and cook, stirring occasionally, until some of the rawness is cooked off, about 10 minutes. Giving those tomato solids a chance to caramelize before adding the liquid back in helps to add a lot of flavor to the stew. (Remember: Reserve the juices, you’re going to use them!)\n" +
                "Step 11\n" +
                "While tomatoes are cooking, drain and rinse 14 oz. canned cannellini beans in the strainer you just used, then add to pot along with Parmesan rind, tomato juices, ¾ tsp. red pepper flakes, and 4 cups water. Bring to a simmer.\n" +
                "Step 12\n" +
                "Add kale in two additions, stirring often and allowing to wilt in between.\n" +
                "Step 13\n" +
                "Add about one-third of torn bread (no need to measure, just eyeball it) and cook, stirring occasionally, until coated and warmed through, about 5 minutes more. Taste and adjust seasoning.\n" +
                "Step 14\n" +
                "Remove from heat. Place remaining torn bread chunks on top of stew. Drizzle generously with olive oil.\n" +
                "Step 15\n" +
                "Transfer pot to oven and bake stew until thick, bubbling, and bread is golden brown on top, 10–15 minutes.\n" +
                "Step 16\n" +
                "Ladle stew into bowls, drizzle each generously with olive oil, and grate lots of Parmesan over.\n" +
                "\n" , "Ribolitta", R.drawable.ing_ribo, R.drawable.orange);
        I_maindish food8 = new I_maindish(R.drawable.risotto, "Video link\n" +
                "https://youtu.be/NKtR3KpS83w\n"+
                "\n" +
                "\n" +
                "\n" +
                "Ingredients\n" +
                "for 4 servings\n" +
                "•\t6 cups low-sodium chicken stock, or vegetable stock\n" +
                "•\t2 tablespoons olive oil\n" +
                "•\t1 shallot, finely chopped\n" +
                "•\t1 lb shiitake mushroom(455 g), stemmed and thinly sliced\n" +
                "•\t2 tablespoons unsalted butter\n" +
                "•\t2 cloves garlic, minced\n" +
                "•\t1 teaspoon fresh thyme, finely chopped\n" +
                "•\tsalt, to taste\n" +
                "•\tpepper, to taste\n" +
                "•\t1 ½ cups arborio rice(200 g)\n" +
                "•\t½ cup white wine(120 mL)\n" +
                "•\t1 cup grated parmesan cheese(110 g), plus more for serving\n" +
                "•\t¼ cup fresh parsley(10 g), for serving\n" +
                "Preparation\n" +
                "1.\tAdd the stock to a medium pot and bring to a boil over high heat. Once the stock is boiling, reduce the heat to low or remove the pan from the heat and keep nearby.\n" +
                "2.\tHeat the olive oil in a wide, tall pot over medium heat. Once the oil begins to shimmer, add the shallot and cook, stirring frequently, until translucent.\n" +
                "3.\tAdd the shiitake mushrooms and butter. Cook, stirring occasionally, until the mushrooms have cooked down.\n" +
                "4.\tAdd the garlic, thyme, salt, and pepper, stir, and cook for 1 minute, until the butter has melted and the garlic is aromatic.\n" +
                "5.\tAdd the rice and stir until fully coated in the mushroom mixture. Let the rice toast for 1-2 minutes, until fragrant.\n" +
                "6.\tAdd the white wine and cook until the wine has evaporated, stirring occasionally.\n" +
                "7.\tAdd 1 cup (240 ml) of the hot stock and stir to combine. Cook, stirring frequently, until the stock is fully absorbed.\n" +
                "8.\tContinue to add the stock, ½ cup (120 ml) at a time, stirring continuously, until the broth is fully absorbed, for 15-20 minutes. Depending on how fast the rice cooks, there may be leftover stock.\n" +
                "9.\tOnce the rice is al dente, remove from the heat. Add the Parmesan and stir to combine.\n" +
                "10.\tTop with parsley, Parmesan, salt, and pepper.\n" +
                "11.\tEnjoy!\n" +
                "\n" , "Risotto", R.drawable.ing_risotto, R.drawable.orange);


        maindishI.add(food1);
        maindishI.add(food2);
        maindishI.add(food3);
        maindishI.add(food4);
        maindishI.add(food5);
        maindishI.add(food6);
        maindishI.add(food7);
        maindishI.add(food8);



        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL,false);
        i_m_datalist.setLayoutManager(gridLayoutManager);
        i_m_datalist.setHasFixedSize(true);


        i_m_datalist.setAdapter(adapter);



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
    public void details2_I(int position){
      I_maindish currentMaindish = maindishI.get(position);
      I_maindish currentMaindish1 = maindishI.get(position);
      I_maindish currentMaindish2 = maindishI.get(position);
      I_maindish currentMaindish3 = maindishI.get(position);



      Intent intent = new Intent(Imainpage.this, Example_I_M.class);

      intent.putExtra("item1", currentMaindish.getDiscrpition2_I());
      intent.putExtra("item2", currentMaindish1.getBox_Image2_I());
      intent.putExtra("item3", currentMaindish2.getMain2_I());
      intent.putExtra("item4", currentMaindish3.getName2_I());

      startActivity(intent);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Bbtn:
                Intent intent = new Intent(Imainpage.this, Ipage.class);
                startActivity(intent);
                break;
            case R.id.Lbtn:
                Intent intent1 = new Intent(Imainpage.this, Imainpage.class);
                startActivity(intent1);
                break;
            case R.id.Dbtn:
                Intent intent2 = new Intent(Imainpage.this, Isweetspage.class);
                startActivity(intent2);
                break;
            case R.id.Drbtn:
                Intent intent3 = new Intent(Imainpage.this, Ibeverages_page.class);
                startActivity(intent3);
                break;
            case R.id.home1:
                Intent intent4 = new Intent(Imainpage.this, Cuisines.class);
                startActivity(intent4);
                break;
        }
    }
}