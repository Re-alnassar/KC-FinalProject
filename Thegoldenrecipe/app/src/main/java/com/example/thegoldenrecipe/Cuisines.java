package com.example.thegoldenrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Cuisines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuisines);


        ImageButton arabianCuisine = findViewById(R.id.arabianCuisine);
        ImageButton italianCuisine = findViewById(R.id.italianCuisine);
        ImageButton indianCuisine = findViewById(R.id.indianCuisine);
        ImageButton seaCuisine = findViewById(R.id.seaCuisine);

        arabianCuisine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Cuisines.this, Apage.class);
                startActivity(intent);
            }
        });


        italianCuisine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Cuisines.this, Ipage.class);
                startActivity(intent);
            }
        });


        indianCuisine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(view.getContext(),"Coming soon!",Toast.LENGTH_SHORT).show();
            }
        });

       seaCuisine.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(view.getContext(),"Coming soon!",Toast.LENGTH_SHORT).show();
           }
       });



    }
}