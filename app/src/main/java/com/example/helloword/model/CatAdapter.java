package com.example.helloword.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.helloword.R;
import com.example.helloword.service.CatItemListener;

import java.util.List;

public class CatAdapter extends RecyclerView.Adapter<CatViewHolder> {

    private List<Cat> cats;
    private CatItemListener catItemListener;

    public CatAdapter(List<Cat> cats) {
        this.cats = cats;
    }

    public void setCatItemListener(CatItemListener catItemListener) {
        this.catItemListener = catItemListener;
    }

    @NonNull
    @Override
    public CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycle_view_circle_image, parent, false);
        return new CatViewHolder(view, catItemListener);
    }

    @Override
    public void onBindViewHolder(@NonNull CatViewHolder holder, int position) {
        Cat cat = cats.get(position);
        if (cat == null) return;
        holder.getImg().setImageResource(cat.getImg());
        holder.getName().setText(cat.getName());
//        holder.setCatItemListener((view, postion) -> Toast.makeText(view.getContext(), cat.getName(), Toast.LENGTH_SHORT).show());
    }

    @Override
    public int getItemCount() {
        if (cats == null) return 0;
        return cats.size();
    }

    public Cat getItem(int postion) {
        return cats.get(postion);
    }
}
