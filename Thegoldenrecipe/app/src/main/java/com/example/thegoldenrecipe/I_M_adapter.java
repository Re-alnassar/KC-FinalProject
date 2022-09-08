package com.example.thegoldenrecipe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class I_M_adapter extends RecyclerView.Adapter<I_M_adapter.MyViewHolder2_I> {

    private Context context2_I;
    private List<I_maindish> image2_I;
    private RecycleViewOnClickItem mIOnClick;

    public I_M_adapter(Context context2_I, RecycleViewOnClickItem mIOnClick, List<I_maindish> image2_I){

        this.context2_I = context2_I;
        this.mIOnClick = mIOnClick;
        this.image2_I = image2_I;

    }

    @NonNull
    @Override
    public MyViewHolder2_I onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(context2_I) .inflate(R.layout.i_maindish_grid,parent,false);
        return new MyViewHolder2_I(v,mIOnClick);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder2_I holder, int position) {
        holder.miImageView.setImageResource(image2_I.get(position).getMaindishImage_I());

    }

    @Override
    public int getItemCount() {
        return image2_I.size();
    }

    public static class MyViewHolder2_I extends RecyclerView.ViewHolder{

        ImageView miImageView;

        public MyViewHolder2_I(@NonNull View itemView , final  RecycleViewOnClickItem mIOnCliCk) {
            super(itemView);
            itemView.setOnClickListener(view -> {
                mIOnCliCk.OnItemClick(getAdapterPosition());
            });
            miImageView = itemView.findViewById(R.id.RISOTTO);
        }

    }

}
