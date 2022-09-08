package com.example.thegoldenrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Example_I_Br extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_ibr);

        TextView textView4_I = findViewById(R.id.textview4_I);
        TextView actual_name4_I = findViewById(R.id.actual_name4_I);
        ImageView I_box_Image4 = findViewById(R.id.I_box_Image4);
        ImageView I_main_Image4 = findViewById(R.id.I_main_Image4);

        Bundle bundle = getIntent().getExtras();

        String discription4 =bundle.getString("item1");
        String name4 = bundle.getString("item4");
        int boxImage4 = bundle.getInt("item2");
        int mainImage4 = bundle.getInt("item3");

        textView4_I.setText(discription4);
        actual_name4_I.setText(name4);
        I_box_Image4.setImageResource(boxImage4);
        I_main_Image4.setImageResource(mainImage4);
    }
}