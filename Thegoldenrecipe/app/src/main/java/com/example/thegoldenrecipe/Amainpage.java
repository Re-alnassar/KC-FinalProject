package com.example.thegoldenrecipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Amainpage extends AppCompatActivity implements View.OnClickListener {
    private  RecyclerView a_m_datalist;
    private List<Integer> images;
    private A_M_adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amainpage);

        a_m_datalist = findViewById(R.id.a_m_datalist);




        images = new ArrayList<>();

        adapter = new A_M_adapter(this, images);


        images.add(R.drawable.muluckiyah);
        images.add(R.drawable.chicken_machboos);
        images.add(R.drawable.iraqi_kebab);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL,false);
        a_m_datalist.setLayoutManager(gridLayoutManager);
        a_m_datalist.setHasFixedSize(true);

        a_m_datalist.setAdapter(adapter);


        Button Bbtn = findViewById(R.id.Bbtn);
        Button Lbtn = findViewById(R.id.Lbtn);
        Button Dbtn = findViewById(R.id.Dbtn);
        Button Drbtn = findViewById(R.id.Drbtn);

        Bbtn.setOnClickListener(this);
        Lbtn.setOnClickListener(this);
        Dbtn.setOnClickListener(this);
        Drbtn.setOnClickListener(this);





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
                break;
        }
    }
}
