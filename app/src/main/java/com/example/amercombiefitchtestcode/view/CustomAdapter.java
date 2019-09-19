package com.example.amercombiefitchtestcode.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.amercombiefitchtestcode.R;
import com.example.amercombiefitchtestcode.model.PageDataPojo;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    private ArrayList<PageDataPojo> dataSet;
    private Context context;

    public CustomAdapter(Context context){
        this.context = context;
    }

    public void setDataSet(ArrayList<PageDataPojo> dataSet){
        this.dataSet = dataSet;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
     //   holder.tvBottomDescription.setText(dataSet.get(position).bottomDescription);
      //  holder.tvPromoMessage.setText(dataSet.get(position).promoMessage);
       // holder.tvTopDescription.setText(dataSet.get(position).topDescription);
        holder.tvTitle.setText(dataSet.get(position).title);
        Glide.with(context).load(dataSet.get(position).backgroundImage).into(holder.ivBackgroundImage);
    }

    @Override
    public int getItemCount() {
        return dataSet != null ? dataSet.size() : 0;
    }
}
