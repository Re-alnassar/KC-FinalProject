package com.example.thegoldenrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Example_A_S extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_as);

        TextView textView8 = findViewById(R.id.textview8);
        TextView actual_name3 = findViewById(R.id.actual_name_I);
        ImageView a_box_Image3 = findViewById(R.id.I_box_Image);
        ImageView main_Image3 = findViewById(R.id.I_main_Image);

        Bundle bundle = getIntent().getExtras();
        String discription3 = bundle.getString("item1");
        String name3 = bundle.getString("item4");
        int boxImage3 =bundle.getInt("item2");
        int mainImage3 = bundle.getInt("item3");
        textView8.setText(discription3);
        actual_name3.setText(name3);
        a_box_Image3.setImageResource(boxImage3);
        main_Image3.setImageResource(mainImage3);
    }
}