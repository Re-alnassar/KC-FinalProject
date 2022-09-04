package com.example.thegoldenrecipe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class A_M_adapter extends RecyclerView.Adapter<A_M_adapter.MyViewHolder2> {

    private Context context2;
    private List<Integer> image;

    public A_M_adapter(Context context2, List<Integer> image){
        this.context2 = context2;
        this.image = image;
    }

    @NonNull
    @Override
    public MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context2).inflate(R.layout.a_maindish_grid,parent,false);
        return new MyViewHolder2(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder2 holder, int position) {
        holder.mImageView.setImageResource(image.get(position));

    }

    @Override
    public int getItemCount() {
        return image.size();
    }

    public  static class MyViewHolder2 extends RecyclerView.ViewHolder{

        ImageView mImageView;

        public MyViewHolder2(@NonNull View itemView) {
            super(itemView);

            mImageView = itemView.findViewById(R.id.MULUKHIYAH);
        }
    }
}
