package com.example.thegoldenrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Example_I_S extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_is);

        TextView textView3_I = findViewById(R.id.textview3_I);
        TextView actual_name3 = findViewById(R.id.actual_name3_I);
        ImageView I_box_Image3 = findViewById(R.id.I_box_Image3);
        ImageView I_main_Image3 = findViewById(R.id.I_main_Image3);

        Bundle bundle = getIntent().getExtras();

        String discription3 = bundle.getString("item1");
        String name3 = bundle.getString("item4");
        int boxImage3 = bundle.getInt("item2");
        int mainImage3 = bundle.getInt("item3");

        textView3_I.setText(discription3);
        actual_name3.setText(name3);
        I_box_Image3.setImageResource(boxImage3);
        I_main_Image3.setImageResource(mainImage3);
    }
}