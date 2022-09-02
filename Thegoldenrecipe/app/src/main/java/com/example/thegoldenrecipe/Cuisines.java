package com.example.thegoldenrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Cuisines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuisines);


        ImageButton arabianCuisine = findViewById(R.id.arabianCuisine);

        arabianCuisine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Cuisines.this, Apage.class);
                startActivity(intent);
            }
        });



    }
}