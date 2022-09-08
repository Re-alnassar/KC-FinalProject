package com.example.thegoldenrecipe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class I_B_adapter extends RecyclerView.Adapter<I_B_adapter.MyViewHolder_I> {

    private Context context;
    private List<I_breakfast> image ;
    private RecycleViewOnClickItem bIOnCliCk;


    public I_B_adapter(Context context, RecycleViewOnClickItem bIOnCliCk, List<I_breakfast> image){
        this.context = context;
        this.bIOnCliCk = bIOnCliCk;
        this.image= image;
    }

    @NonNull
    @Override
    public MyViewHolder_I onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.i_breakfast_grid,parent,false);
        return new MyViewHolder_I(v,bIOnCliCk);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder_I holder, int position) {
        holder.biImageView.setImageResource(image.get(position).getBreakfastImage_I());

    }

    @Override
    public int getItemCount() {
        return image.size();
    }

    public static class MyViewHolder_I extends RecyclerView.ViewHolder {

        ImageView biImageView;

        public MyViewHolder_I(@NonNull View itemView , final RecycleViewOnClickItem bIOnClick) {
            super(itemView);
            itemView.setOnClickListener(view -> {
                bIOnClick.OnItemClick(getAdapterPosition());
            });
            biImageView = itemView.findViewById(R.id.BAKED_EGGS_SAUSAGE);
        }
    }
}
