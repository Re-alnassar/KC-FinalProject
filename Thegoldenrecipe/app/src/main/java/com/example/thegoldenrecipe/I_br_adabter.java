package com.example.thegoldenrecipe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class I_br_adabter extends RecyclerView.Adapter<I_br_adabter.MyViewHolder4_I> {

    private Context context4_I;
    private List<I_beverages> image;
    private RecycleViewOnClickItem briOnCliCk;

    public I_br_adabter(Context context4_I, RecycleViewOnClickItem briOnCliCk, List<I_beverages> image){
        this.context4_I = context4_I;
        this.briOnCliCk = briOnCliCk;
        this.image = image;
    }

    @NonNull
    @Override
    public MyViewHolder4_I onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context4_I).inflate(R.layout.i_bevereges_grid,parent,false);
        return new MyViewHolder4_I(v,briOnCliCk);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder4_I holder, int position) {
        holder.brImageView.setImageResource(image.get(position).getBeveragesImage4_I());

    }

    @Override
    public int getItemCount() {
        return image.size();
    }

    public static class MyViewHolder4_I extends RecyclerView.ViewHolder {

        ImageView brImageView;
        public MyViewHolder4_I(@NonNull View itemView, final RecycleViewOnClickItem briOnClick) {
            super(itemView);
            itemView.setOnClickListener(view -> {
                briOnClick.OnItemClick(getAdapterPosition());
            });
            brImageView = itemView.findViewById(R.id.BICERIN);
        }
    }
}
