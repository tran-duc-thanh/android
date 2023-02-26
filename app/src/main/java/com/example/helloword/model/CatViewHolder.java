package com.example.helloword.model;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.helloword.R;
import com.example.helloword.service.CatItemListener;

public class CatViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    private ImageView img;
    private TextView name;
    private CatItemListener catItemListener;

    public CatViewHolder(@NonNull View itemView, CatItemListener catItemListener) {
        super(itemView);
        img = itemView.findViewById(R.id.imgItemRecycleView);
        name = itemView.findViewById(R.id.nameItemRecycleView);
        this.catItemListener = catItemListener;
        itemView.setOnClickListener(this);
    }

    public ImageView getImg() {
        return img;
    }

    public void setImg(ImageView img) {
        this.img = img;
    }

    public TextView getName() {
        return name;
    }

    public void setName(TextView name) {
        this.name = name;
    }

    @Override
    public void onClick(View view) {
        catItemListener.onItemClick(view, getAdapterPosition());
    }
}
