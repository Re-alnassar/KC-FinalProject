package com.example.thegoldenrecipe;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class A_B_adapter extends RecyclerView.Adapter<A_B_adapter.MyViewHolder> {

    private Context context;
    private List<Breakfast> image;
    private RecycleViewOnClickItem bOnClick;


    public A_B_adapter(Context context,RecycleViewOnClickItem mOnClick, List<Breakfast> image) {
        this.context = context;
        this.bOnClick = mOnClick;
        this.image = image;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.a_breakfast_grid, parent,false);
        return new MyViewHolder(v,bOnClick);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
      holder.bImageView.setImageResource(image.get(position).getBreakfastImage());
    }

    @Override
    public int getItemCount() {
        return image.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

       ImageView bImageView;

        public MyViewHolder(@NonNull View itemView ,final RecycleViewOnClickItem bOnClicK) {
            super(itemView);
            itemView.setOnClickListener(view -> {
                bOnClicK.OnItemClick (getAdapterPosition());  //onclick

            });
            bImageView = itemView.findViewById(R.id.HUMMUS);


        }
    }
}
