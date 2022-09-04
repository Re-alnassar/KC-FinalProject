package com.example.thegoldenrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Example extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);

        TextView textView6 = findViewById(R.id.textView6);

        Bundle bundle = getIntent().getExtras();
        String discription = bundle.getString("item1");
        textView6.setText(discription);
    }
}