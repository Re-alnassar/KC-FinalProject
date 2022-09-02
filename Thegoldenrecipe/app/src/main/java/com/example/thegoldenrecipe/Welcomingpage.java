package com.example.thegoldenrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Welcomingpage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomingpage);


        ImageButton arrowBtn = findViewById(R.id.arrowBtn);


        arrowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Welcomingpage.this, Cuisines.class);
                startActivity(intent);
            }
        });
    }
}