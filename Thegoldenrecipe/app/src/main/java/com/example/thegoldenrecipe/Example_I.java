package com.example.thegoldenrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Example_I extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_i);

        TextView textView_I = findViewById(R.id.textview_I);
        TextView actual_name_I = findViewById(R.id.actual_name_I);
        ImageView I_box_Image = findViewById(R.id.I_box_Image);
        ImageView I_main_Image = findViewById(R.id.I_main_Image);

        Bundle bundle = getIntent().getExtras();
        String discription = bundle.getString("item1");
        String name = bundle.getString("item4");
        int boxImage = bundle.getInt("item2");
        int mainImage = bundle.getInt("item3");

        textView_I.setText(discription);
        actual_name_I.setText(name);
        I_box_Image.setImageResource(boxImage);
        I_main_Image.setImageResource(mainImage);

    }
}
