package com.example.thegoldenrecipe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class I_S_adapter extends RecyclerView.Adapter<I_S_adapter.MyViewHolder3_I> {

    private Context context;
    private List<I_sweets> image ;
    private RecycleViewOnClickItem sIOnCliCk;


    public I_S_adapter(Context context, RecycleViewOnClickItem sIOnCliCk, List<I_sweets> image){
        this.context = context;
        this.sIOnCliCk = sIOnCliCk;
        this.image = image;
    }

    @NonNull
    @Override
    public MyViewHolder3_I onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.i_sweets_grid, parent, false);
        return new MyViewHolder3_I(v,sIOnCliCk);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder3_I holder, int position) {
        holder.siImageView.setImageResource(image.get(position).getSweetsImage_I());
    }

    @Override
    public int getItemCount() {
        return image.size();
    }

    public static class MyViewHolder3_I extends RecyclerView.ViewHolder {

        ImageView siImageView;
        public MyViewHolder3_I(@NonNull View itemView, final RecycleViewOnClickItem siOnClick) {
            super(itemView);

            itemView.setOnClickListener(view -> {
                siOnClick.OnItemClick(getAdapterPosition());

            });
            siImageView = itemView.findViewById(R.id.PANETTONE);
        }
    }
}
