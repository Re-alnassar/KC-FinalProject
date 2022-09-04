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

public class Asweetspage extends AppCompatActivity implements View.OnClickListener{

    private RecyclerView a_s_datalist;
    private List<Integer> images;
    private A_S_adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asweetspage);


        a_s_datalist = findViewById(R.id.a_s_dataList);

        images = new ArrayList<>();

        adapter = new A_S_adapter(this, images);

        images.add(R.drawable.umm_ali);
        images.add(R.drawable.kunafa);
        images.add(R.drawable.luqaymat);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2, GridLayoutManager.VERTICAL,false);
        a_s_datalist.setLayoutManager(gridLayoutManager);
        a_s_datalist.setHasFixedSize(true);

        a_s_datalist.setAdapter(adapter);


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
                break;
        }

    }
}