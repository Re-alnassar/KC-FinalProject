package com.example.thegoldenrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Example_A_M extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_am);

        TextView textView7 = findViewById(R.id.textview_I);
        TextView actual_name2 = findViewById(R.id.actual_name_I);
        ImageView a_box_Image2 = findViewById(R.id.I_box_Image);
        ImageView main_Image2 = findViewById(R.id.I_main_Image);

        Bundle bundle = getIntent().getExtras();
        String discription2 = bundle.getString("item1");
        String name2 = bundle.getString("item4");
        int boxImage2 = bundle.getInt("item2");
        int mainImage2 = bundle.getInt("item3");

        textView7.setText(discription2);
        actual_name2.setText(name2);
        a_box_Image2.setImageResource(boxImage2);
        main_Image2.setImageResource(mainImage2);

    }
}