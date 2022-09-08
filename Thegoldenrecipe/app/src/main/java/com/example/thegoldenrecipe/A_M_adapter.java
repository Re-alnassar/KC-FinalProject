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
    private List<Maindish_A> image;
    private RecycleViewOnClickItem mOnClick;

    public A_M_adapter(Context context2, RecycleViewOnClickItem mOnClick, List<Maindish_A> image){
        this.context2 = context2;
        this.image = image;
        this.mOnClick = mOnClick;
    }

    @NonNull
    @Override
    public MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context2).inflate(R.layout.a_maindish_grid,parent,false);
        return new MyViewHolder2(v,mOnClick);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder2 holder, int position) {
        holder.mImageView.setImageResource(image.get(position).getMaindishImage());

    }

    @Override
    public int getItemCount() {
        return image.size();
    }

    public  static class MyViewHolder2 extends RecyclerView.ViewHolder{

        ImageView mImageView;

        public MyViewHolder2(@NonNull View itemView, final RecycleViewOnClickItem mOnClick) {
            super(itemView);
            itemView.setOnClickListener(view -> {
                mOnClick.OnItemClick(getAdapterPosition());
            });

            mImageView = itemView.findViewById(R.id.MULUKHIYAH);
        }
    }
}
