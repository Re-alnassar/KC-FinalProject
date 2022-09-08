package com.example.thegoldenrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Example extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);

        TextView textView6 = findViewById(R.id.textview6);
        TextView actual_name = findViewById(R.id.actual_name_I);
        ImageView a_box_Image = findViewById(R.id.I_box_Image);
        ImageView main_Image= findViewById(R.id.I_main_Image);

        Bundle bundle = getIntent().getExtras();
        String discription = bundle.getString("item1");
        String name = bundle.getString("item4");
        int boxImage = bundle.getInt("item2");
        int mainImage = bundle.getInt("item3");

        textView6.setText(discription);
        actual_name.setText(name);
        a_box_Image.setImageResource(boxImage);
        main_Image.setImageResource(mainImage);


    }
}