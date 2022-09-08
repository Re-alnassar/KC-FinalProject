package com.example.thegoldenrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Example_I_M extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_im);

        TextView textView2_I = findViewById(R.id.textview2_I);
        TextView I_actual_name2 = findViewById(R.id.I_actual_name2);
        ImageView I_box_Image2 = findViewById(R.id.I_box_Image2);
        ImageView I_main_Image2 = findViewById(R.id.I_main_Image2);

        Bundle bundle = getIntent().getExtras();
        String discription2 = bundle.getString("item1");
        String name2 = bundle.getString("item4");
        int boxImage2 = bundle.getInt("item2");
        int mainImage2 = bundle.getInt("item3");

        textView2_I.setText(discription2);
        I_actual_name2.setText(name2);
        I_box_Image2.setImageResource(boxImage2);
        I_main_Image2.setImageResource(mainImage2);



    }
}