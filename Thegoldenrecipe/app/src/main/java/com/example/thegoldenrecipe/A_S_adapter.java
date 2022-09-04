package com.example.thegoldenrecipe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class A_S_adapter extends RecyclerView.Adapter<A_S_adapter.MyViewHolder3> {

    private Context context;
    private List<Integer> image;


    public A_S_adapter(Context context, List<Integer> image){
        this.context = context;
        this.image = image;
    }


    @NonNull
    @Override
    public MyViewHolder3 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.a_sweets_grid,parent,false);
        return new MyViewHolder3(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder3 holder, int position) {
        holder.sImageView.setImageResource(image.get(position));

    }

    @Override
    public int getItemCount() {
        return image.size();
    }

    public static class MyViewHolder3 extends RecyclerView.ViewHolder{

        ImageView sImageView;

        public MyViewHolder3(@NonNull View itemView) {
            super(itemView);

            sImageView = itemView.findViewById(R.id.UMM_ALI);
        }
    }


}
