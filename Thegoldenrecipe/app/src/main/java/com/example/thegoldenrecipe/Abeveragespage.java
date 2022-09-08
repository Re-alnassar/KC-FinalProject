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

public class Abeveragespage extends AppCompatActivity implements View.OnClickListener{

    private RecyclerView a_br_datalist;
    private List<Beverages_A> beveragesA;
    private A_Br_adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abeveragespage);

        beveragesA = new ArrayList<>();

        adapter = new A_Br_adapter(this, new RecycleViewOnClickItem() {
            @Override
            public void OnItemClick(int position) { details4(position);

            }
        },beveragesA);

        a_br_datalist = findViewById(R.id.a_br_datalist);
        Beverages_A food1 = new Beverages_A(R.drawable.arabic_coffee,
                "Video link\n" +
                        "https://youtu.be/vFtE76sBRpc\n"+
                "\n" +
                        "\n" +
                "Ingredients\n" +
                "•\t1 tablespoon Green Coffee beans , lightly roasted and coarsely ground\n" +
                "•\t1 tablespoon Cardamom (Elaichi) Pods/Seeds , crushed\n" +
                "•\t2.5 cups Water\n" +
                "•\t1/8 teaspoon Saffron strands , optional\n" +
                "•\t1 teaspoon Rose water , optional\n" +
                "•\tTo make this traditional Qahwa/ Qahwah – Arabic Coffee Recipe, bring water to boil in a saucepan. When it boils, add ground coffee.\n" +
                "•\tAfter 10 minutes of boiling, add cloves, crushed cardamom and stir once and boil for another 4 to 5 minutes.\n" +
                "•\tNow switch off the flame, cover and let coffee grounds settle at the bottom for a minute. Do not stir at this time since the liquid needs to settle.\n" +
                "•\tNow add the rose water and saffron if you are using them.\n" +
                "•\tStrain and pour the steaming coffee into the flask or teapot.\n" +
                "•\tNow Qahwa | Arabic Coffee Recipe is ready to be served hot in dallah/kulhar. Serve with dates during evenings and Enjoy!!\n" +
                "•\tYou can also serve the Qahwa | Arabic Coffee Recipe Eggless Ragi & Whole Wheat Crisp Biscuits Recipe or Whole Wheat Apple Muffins Recipe (Eggless & Vegan options) to enjoy your evening tea.\n" ,"Arabic coffee",R.drawable.ing_arabic_coffee, R.drawable.orange);
        Beverages_A food2 = new Beverages_A(R.drawable.saffron_tea, "Video link \n" +
                "https://youtu.be/UrzGD_hdYkE\n"+
                "\n" +
                "Ingredients\n" +
                "•\t ▢1 pinch saffron threads\n" +
                "•\t ▢500 ml off the boil water (boil, then count to 10 before using)\n" +
                "•\t ▢2 tsp honey (or sugar) to taste\n" +
                "•\t ▢2 sprigs mint leaves\n" +
                "Additional Ingredients (as you fancy, not all at once!)\n" +
                "•\t ▢2 slices lemon\n" +
                "•\t ▢2 slices ginger\n" +
                "•\t ▢2 pods green cardamom\n" +
                "•\t ▢2 small cinnamon sticks\n" +
                "•\t ▢4 dried rose petals\n" +
                "Instructions\n" +
                "1.\tBoil the water in a kettle.\n" +
                "2.\tAdd a small pinch of saffron (about 12 threads) in a small teapot for 2. If using ginger, now's the time to drop a couple of slices in. The size won't matter.\n" +
                "3.\tWhen the water has boiled, count to ten, then pour it over the saffron. We let the water cool ever so slightly to ensure that we don't lose all the essential oil off the saffron, with the steam. Steep for 5 minutes.\n" +
                "4.\tStrain, and sweeten as desired. If adding lemon slices, now's the time to drop them in.\n" +
                "5.\tIf you like, you can get another round of tea with the used threads. It won't be as strong as the first cup, but will still be delicious. Just repeat the process with freshly boiled water.\n" +
                "\n" +
                "\n" , "Saffron tea", R.drawable.ing_saffron_tea, R.drawable.orange);
        Beverages_A food3 = new Beverages_A(R.drawable.laban, "Video link\n" +
                "https://youtu.be/CcGJWbr1W2g\n"+
                "\n" +
                "INGREDIENTS\n" +
                "\uF0A7\t1 gallon milk\n" +
                "\uF0A7\t1/3 cup laban (rawbe) previously made laban or store bought plain yogurt\n" +
                "INSTRUCTIONS\n" +
                "1.\tSet milk in pot over medium heat. When layer of froth forms and rises at the top (may take 20 minutes, check and keep an eye on it so it does not overflow pot), take it off heat.\n" +
                "1.\tWhen the temperature of the milk is about 113F (check on it after 45 minutes). Transfer to a heavy duty tupperware and add and stir in the 1/3 cup laban. Stir about ten times and cover.\n" +
                "2.\tCover the tupperware with a heavy blanket and leave out for 8-9 hours.\n" +
                "3.\tAfter the 9 hours, dab the top of the laban with paper towels to remove the layer of liquid (this will ensure that the laban is a little thicker). When done, add a clean paper towel to the top and place in fridge and after 4 hours change the paper towels again.\n" +
                "RECIPE NOTES\n" +
                "•\tReserve four tablespoons of the laban in a separate container in the fridge for the next time you want to make a fresh batch\n" +
                "•\tThis laban is great for grape leaves, stuffed vegetables, with vermicelli rice, toasted bread, and many other dishes.\n" +
                "\n" ,"Laban",R.drawable.ing_laban,R.drawable.orange);
        Beverages_A food4 = new Beverages_A(R.drawable.tamr_hindi,  "Video Link\n" +
                "https://youtu.be/HKULu_fWdwQ\n"+
                "\n" +
                "Ingrdients\n" +
                "\n" +
                "Tamarind  250 Grams\n" +
                "Sugar 400 Grams\n" +
                "Rosewater 25 Milliliter\n" +
                "Water 2 Liter\n" +
                "\n" +
                "How to make tamer hindi recipe?\n" +
                "1. The ingredients quantity can be set as per your serving requirements. We recommend you set before you start cooking.\n" +
                "2. Cut the tamarind into small cubes & keep it aside.\n" +
                "3. In a small sauce pan boil the water. Add the tamarind, sugar & mix them well. Cover the pan with lid & cook for 10 minutes or until the tamarind become soft.\n" +
                "4. Pour the mixture in the blender & blend well.\n" +
                "5. Strain the mixture to get a smooth texture.\n" +
                "6. Add rose water, water & mix well. Now juice is ready.\n" +
                "7. Serve in a tall glass with ice cubes or chilled.\n" +
                "8. Serve cold.\n" +
                "\n" , "Tamir Hindi juice", R.drawable.ing_tamrhindi,R.drawable.orange);
        Beverages_A food5 = new Beverages_A(R.drawable.qamaraldeen, "Video link\n" +
                "https://youtu.be/lueGy7-cWao\n"+
                "\n" +
                "Ingredients\n" +
                "•\t ▢1 package (400gm) of Qamar Addeen or home made apricot leather.\n" +
                "•\t ▢3 cups tap water.*\n" +
                "•\t ▢1/3 cup sugar.**\n" +
                "Instructions\n" +
                "1.\tCut the apricot leather into small pieces something like 2 inch squares.\n" +
                "2.\tPut in a deep bowl and cover with water.\n" +
                "3.\tRefrigerate overnight.\n" +
                "4.\tIn your blender blend the apricot with water and sugar until no lumps are visible.\n" +
                "5.\tStrain if you like, I do not strain mine.\n" +
                "6.\tPour into a pitcher and refrigerate until serving time.\n" +
                "7.\tServe cold.***\n" +
                "\n" +
                "\n" ,"Qamar aldeen ", R.drawable.ing_qamaraldeen,R.drawable.orange);

        beveragesA.add(food1);
        beveragesA.add(food2);
        beveragesA.add(food3);
        beveragesA.add(food4);
        beveragesA.add(food5);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        a_br_datalist.setLayoutManager(gridLayoutManager);
        a_br_datalist.setHasFixedSize(true);

        a_br_datalist.setAdapter(adapter);


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
    public void detailsOnClick (View view){

    }
    public void details4(int position){
        Beverages_A currentBeverage = beveragesA.get(position);
        Beverages_A currentBeverage1 = beveragesA.get(position);
        Beverages_A currentBeverage2 = beveragesA.get(position);
        Beverages_A currentBeverage3 = beveragesA.get(position);

        Intent intent = new Intent(Abeveragespage.this, Example_A_Br.class);

        intent.putExtra("item1", currentBeverage.getDiscription4());
        intent.putExtra("item2", currentBeverage1.getBox_Image());
        intent.putExtra("item", currentBeverage2.getMain());
        intent.putExtra("item4", currentBeverage3.getName());

        startActivity(intent);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Bbtn:
                Intent intent = new Intent(Abeveragespage.this, Apage.class);
                startActivity(intent);
                break;
            case R.id.Lbtn:
                Intent intent1 = new Intent(Abeveragespage.this, Amainpage.class);
                startActivity(intent1);
                break;
            case R.id.Dbtn:
                Intent intent2  = new Intent(Abeveragespage.this, Asweetspage.class);
                startActivity(intent2);
                break;
            case R.id.Drbtn:
              Intent intent3  = new Intent(Abeveragespage.this, Abeveragespage.class);
            startActivity(intent3);
                break;
            case R.id.home1:
                Intent intent4 = new Intent(Abeveragespage.this, Cuisines.class);
                startActivity(intent4);
                break;

        }
    }
}
