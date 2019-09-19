package com.example.amercombiefitchtestcode.view;

import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.amercombiefitchtestcode.R;
import com.example.amercombiefitchtestcode.model.PageDataPojo;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    TextView tvTopDescription, tvTitle, tvPromoMessage, tvBottomDescription;
    ImageView ivBackgroundImage;


    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);
        tvTopDescription = itemView.findViewById(R.id.tv_top_description);
        tvTitle = itemView.findViewById(R.id.tv_title);
        tvPromoMessage = itemView.findViewById(R.id.tv_promo_message);
        tvBottomDescription = itemView.findViewById(R.id.tv_bottom_description);
        ivBackgroundImage = itemView.findViewById(R.id.iv_background_image);
    }

//    public void onBindViewHolder(PageDataPojo item){
//        tvTopDescription.setText(item.topDescription);
//        tvTitle.setText(item.title);
//        tvPromoMessage.setText(item.promoMessage);
//        tvBottomDescription.setText(item.bottomDescription);
//        Glide.with().load(item.backgroundImage).into(ivBackgroundImage);
//    }
}
