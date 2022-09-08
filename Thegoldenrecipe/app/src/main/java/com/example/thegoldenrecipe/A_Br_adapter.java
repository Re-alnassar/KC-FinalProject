package com.example.thegoldenrecipe;

import android.content.Context;
import android.media.MediaExtractor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class A_Br_adapter extends RecyclerView.Adapter<A_Br_adapter.MyViewHolder4> {

    private Context context4;
    private List<Beverages_A> image ;
    private RecycleViewOnClickItem brOnClick;

    public A_Br_adapter(Context context4 ,RecycleViewOnClickItem brOnClick,List<Beverages_A> image){
        this.context4 = context4;
        this.brOnClick = brOnClick;
        this.image = image;
    }

    @NonNull
    @Override
    public MyViewHolder4 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context4).inflate(R.layout.a_beverages_grid,parent,false);
        return new MyViewHolder4(v, brOnClick);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder4 holder, int position) {
        holder.brImageView.setImageResource(image.get(position).getBeveragesImage());
    }

    @Override
    public int getItemCount() {
        return image.size();
    }

    public static class MyViewHolder4 extends RecyclerView.ViewHolder{

        ImageView brImageView;

        public MyViewHolder4(@NonNull View itemView, final RecycleViewOnClickItem brOnclick) {
            super(itemView);
            itemView.setOnClickListener(view -> {
                brOnclick.OnItemClick(getAdapterPosition());
            });
            brImageView = itemView.findViewById(R.id.ARABIC_COFFEE);

        }
    }



}