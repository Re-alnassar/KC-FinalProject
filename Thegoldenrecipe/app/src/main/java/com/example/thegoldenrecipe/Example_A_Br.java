package com.example.thegoldenrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Example_A_Br extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_abr);

        TextView textView9 = findViewById(R.id.textview9);
        TextView actual_name4 = findViewById(R.id.actual_name_I);
        ImageView a_box_Image4 = findViewById(R.id.I_box_Image);
        ImageView main_Image4 = findViewById(R.id.I_main_Image);

        Bundle bundle = getIntent().getExtras();

        String discription4 = bundle.getString("item1");
        String name4 = bundle.getString("item4");
        int boxImage4 = bundle.getInt("item2");
        int mainImage4 = bundle.getInt("item3");

        textView9.setText(discription4);
        actual_name4.setText(name4);
        a_box_Image4.setImageResource(boxImage4);
        main_Image4.setImageResource(mainImage4);
    }
}