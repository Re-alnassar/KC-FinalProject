package com.example.thegoldenrecipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
            public void OnItemClick(int position) {
                details(position);
            }
        }, breakfasts);

        a_b_datalist = findViewById(R.id.a_b_datalist);
        Breakfast food1 = new Breakfast(R.drawable.hummus,"yogurt");
        Breakfast food2 = new Breakfast(R.drawable.falafel,"yogurt2");
        Breakfast food3 = new Breakfast(R.drawable.shakshuka,"yogurt3");

        breakfasts.add(food1);
        breakfasts.add(food2);
        breakfasts.add(food3);



        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        a_b_datalist.setLayoutManager(gridLayoutManager);
        a_b_datalist.setHasFixedSize(true);

        a_b_datalist.setAdapter(adapter);


        Button Bbtn = findViewById(R.id.Bbtn);
        Button Lbtn = findViewById(R.id.Lbtn);
        Button Dbtn = findViewById(R.id.Dbtn);
        Button Drbtn = findViewById(R.id.Drbtn);


        Bbtn.setOnClickListener(this);
        Lbtn.setOnClickListener(this);
        Dbtn.setOnClickListener(this);
        Drbtn.setOnClickListener(this);
    }
public void detailOnCklick (View view ){

}
    public void details(int position){
        Breakfast currentBreakfast = breakfasts.get(position);
        Intent intent = new Intent(Apage.this, Example.class);

        intent.putExtra("item1",currentBreakfast.getDiscription());

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
                break;
        }
    }


}