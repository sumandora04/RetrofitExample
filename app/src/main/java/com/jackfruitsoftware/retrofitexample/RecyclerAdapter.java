package com.jackfruitsoftware.retrofitexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<RetrofitMarvelHeroesModelClass> listData;
    private Context context;

    public RecyclerAdapter(List<RetrofitMarvelHeroesModelClass> listData, Context context) {
        this.listData = listData;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.heroes_cell,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

       // holder.imageView.setImageDrawable();
        Picasso.get().load(listData.get(position).getImageurl()).into(holder.imageView);
        holder.text1.setText(listData.get(position).getName());
        holder.text2.setText(listData.get(position).getRealName());
        holder.text3.setText(listData.get(position).getFirstAppareance());
        holder.text4.setText(listData.get(position).getCreatedby());
        holder.text5.setText(listData.get(position).getBio());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView text1,text2,text3,text4,text5;
        public MyViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image_hero);
            text1 = itemView.findViewById(R.id.nameTv);
            text2 = itemView.findViewById(R.id.realNameTv);
            text3 = itemView.findViewById(R.id.firstAppearanceTv);
            text4 = itemView.findViewById(R.id.createdByTv);
            text5 = itemView.findViewById(R.id.bioTv);
        }
    }
}
