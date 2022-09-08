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

public class Ibeverages_page extends AppCompatActivity implements View.OnClickListener{

    private RecyclerView i_br_datalist;
    private List<I_beverages> beveragesI;
    private I_br_adabter adabter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ibeverages_page);

        beveragesI = new ArrayList<>();

        adabter = new I_br_adabter(this, new RecycleViewOnClickItem() {
            @Override
            public void OnItemClick(int position) {  details4_I(position); }

        },beveragesI);


        i_br_datalist = findViewById(R.id.i_br_mdatalist);
        I_beverages food1 = new I_beverages(R.drawable.bicerin, "Video link\n" +
                "https://youtu.be/TncupDrkmwQ\n"+
                "\n" +
                "(Torinese Coffee)\n" +
                "Recipe \n" +
                "1 cup heavy whipping cream, chilled\n" +
                "\n" +
                "2 tablespoons of confectioners sugar\n" +
                "\n" +
                "1 cup whole milk\n" +
                "\n" +
                "3 oz bittersweet dark chocolate\n" +
                "\n" +
                "2 shots of hot espresso\n" +
                "\n" +
                "\n" +
                "Using a hand mixer, beat the heavy whipping cream with confectioners sugar until it forms stiff peaks, about 1 minute.\n" +
                "\n" +
                "In a medium-sized saucepan, warm milk just until it begins to simmer. Add chocolate and whisk together. Continue to whisk over low heat until the mixture begins to thicken a bit, about 1 minute.\n" +
                "\n" +
                "In a clear heat-proof glass, create three layers. Pour the hot chocolate on the bottom, followed by a shot of hot espresso. Finally, top with whipped cream and serve warm.\n" +
                "\n" +
                "*Nota bene: The key to making a perfect bicerin is to form three distinct layers! In order to avoid \"breaking\" the first layer of the hot chocolate, pour the espresso over the back of a spoon so that it gently cascades into the glass. Then, carefully top with the whipped cream. Do not stir!\n" +
                "\n" +
                "Buon appetite!\n" +
                "\n" +
                "\n" , "Bicerin coffee", R.drawable.ing_bicerin, R.drawable.orange);
        I_beverages food2 = new I_beverages(R.drawable.cappuccino,  "Video link\n" +
                "https://youtu.be/gvPetTPFsZM\n"+
                "\n" +
                "Ingredients\n" +
                "For the Espresso\n" +
                "•\t2 tablespoons finely ground dark roast coffee\n" +
                "•\t4 ounces water\n" +
                "For the Foamed Milk\n" +
                "•\t4 ounces milk\n" +
                "\n" +
                "\n" +
                "\n" +
                "Steps to Make It\n" +
                "Pull a Double Shot of Espresso\n" +
                "1.Gather the ingredients.\n" +
                "2.Place the water into the boiler of your espresso machine.\n" +
                "\n" +
                "3.Place the 2 tablespoons (2 shots) of ground coffee into the portafilter.\n" +
                "\n" +
                "4.Tamp (press) the coffee down using a tamper. Do this 2 to 3 times to \n" +
                "\n" +
                "5.make sure the grounds are packed tightly.\n" +
                "\n" +
                "\n" +
                "6. Place the portafilter into your espresso machine's group head and lock it in place by turning it to the right.\n" +
                "\n" +
                "7.Place a demitasse cup or the glass carafe that came with your espresso machine under the group head and pull the shot for 23 to 30 seconds, or until 2 ounces of espresso is yielded. Typically, there is a lever, switch, or button to start this process.\n" +
                "\n" +
                "8.Once the shot is pulled, foam the milk.\n" +
                "\n" +
                "\n" +
                "Foam the Milk\n" +
                "1.\tPlace the milk into either a glass measuring cup or a small metal pitcher.\n" +
                "2.Insert the steam wand into the container with the milk, just under the surface of the milk.\n" +
                "\n" +
                "3. Engage the steam wand on your espresso machine. (You may need to read your espresso machine's manual for this, as each espresso maker is a little different.)\n" +
                "\n" +
                "    4. Make sure to keep the tip of the wand toward the side of the      container. This will create a vortex with the milk.\n" +
                "\n" +
                "5.Move the container higher, lower, closer, then further so that the steam wand can incorporate the air into the milk, making the foam. The bubbles should get smaller and smaller as you do this.\n" +
                "\n" +
                "6.Once the milk has foamed to double its size, turn the steam wand off.\n" +
                "\n" +
                "7.Top the espresso with foamed milk right after foaming. When initially poured, cappuccino is only espresso and foam, but the liquid milk quickly settles out of the foam to create the (roughly) equal parts foam, steamed milk, and espresso for which cappuccino is known.\n" +
                "\n" +
                "\n" , "Cappuccino", R.drawable.ing_cappuccino, R.drawable.orange);
        I_beverages food3 = new I_beverages(R.drawable.latte, "Video link\n" +
                "https://youtu.be/0PN0MwTcbxI\n"+
                "\n" +
                "Ingredients\n" +
                "•\t 2 cups milk\n" +
                "•\t 1 ⅓ cups hot freshly brewed dark roast espresso coffee\n" +
                "\n" +
                "Directions\n" +
                "•\t Step 1\n" +
                "Heat milk in a saucepan set over medium-low heat. Whisk briskly with a wire whisk to create foam.\n" +
                "•\t Step 2\n" +
                "Brew espresso and pour into four cups. Pour in milk, holding back the foam with a spoon. Spoon foam over the top.\n" +
                "\n" +
                "\n" , "Caffe Latte",R.drawable.ing_latte, R.drawable.orange);
        I_beverages food4 = new I_beverages(R.drawable.macchiato,  "Video link\n" +
                "https://youtu.be/RmyoF3ag0o4\n"+
                "\n" +
                "Ingredients\n" +
                "•\tFreshly ground espresso\n" +
                "•\tCold milk\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Steps\n" +
                "Brew one shot of fresh esp\n" +
                "Steam milk to 160°, and hold the steam wand just below the surface to create foam.\n" +
                "Pour milk into espresso to taste and spoon foam on top. It might take a few tries to get your personal ratio right!\n" +
                "\n" ,"Macchiato", R.drawable.ing_macc, R.drawable.orange);
        I_beverages food5 = new I_beverages(R.drawable.shakerato, "Video link\n" +
                "https://youtu.be/XYUuot8lJAY\n"+
                "\n" +
                "Ingredients\n" +
                "•\t4 ounces ice cubes (about 4 to 6 cubes)\n" +
                "•\t1/2 ounce (1 tablespoon; 15g) sugar\n" +
                "•\t2 fluid ounces (60ml) freshly made hot espresso (see note)\n" +
                "\n" +
                "\n" +
                "\n" +
                "Directions\n" +
                "1.\tAdd ice and sugar to a cocktail shaker. Pour hot espresso on top, seal shaker, and shake vigorously until thoroughly chilled, 10 to 20 seconds.\n" +
                "\n" +
                "2.\tStrain iced espresso into a cocktail glass, coupe, or other glass vessel and serve right away.\n" +
                "\n" , "Caffe Shakerato", R.drawable.looli, R.drawable.orange);

        beveragesI.add(food1);
        beveragesI.add(food2);
        beveragesI.add(food3);
        beveragesI.add(food4);
        beveragesI.add(food5);



        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL,false);
        i_br_datalist.setLayoutManager(gridLayoutManager);
        i_br_datalist.setHasFixedSize(true);

        i_br_datalist.setAdapter(adabter);


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

    public void details4_I(int position){
        I_beverages currentbeverage = beveragesI.get(position);
        I_beverages currentbeverage1 = beveragesI.get(position);
        I_beverages currentbeverage2 = beveragesI.get(position);
        I_beverages currentbeverage3 = beveragesI.get(position);

        Intent intent = new Intent(Ibeverages_page.this, Example_I_Br.class);

        intent.putExtra("item1", currentbeverage.getDscription4_I());
        intent.putExtra("item2", currentbeverage1.getBox_Image4());
        intent.putExtra("item3", currentbeverage2.getMain4_I());
        intent.putExtra("item4", currentbeverage3.getName4_I());

        startActivity(intent);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Bbtn:
                Intent intent =new Intent(Ibeverages_page.this, Ipage.class);
                startActivity(intent);
                break;
            case R.id.Lbtn:
                Intent intent1 = new Intent(Ibeverages_page.this, Imainpage.class);
                startActivity(intent1);
                break;
            case R.id.Dbtn:
                Intent intent2 = new Intent(Ibeverages_page.this, Isweetspage.class);
                startActivity(intent2);
                break;
            case R.id.Drbtn:
                Intent intent3 = new Intent(Ibeverages_page.this, Ibeverages_page.class);
                startActivity(intent3);
                break;
            case R.id.home1:
                Intent intent4 = new Intent(Ibeverages_page.this, Cuisines.class);
                startActivity(intent4);
                break;


        }
    }
}