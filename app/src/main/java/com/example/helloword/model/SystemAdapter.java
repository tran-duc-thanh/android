package com.example.helloword.model;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.helloword.R;

import java.util.ArrayList;

public class SystemAdapter extends BaseAdapter {

    private ArrayList<System> systems;

    public SystemAdapter(ArrayList<System> systems) {
        this.systems = systems;
    }

    @Override
    public int getCount() {
        return this.systems.size();
    }

    @Override
    public Object getItem(int i) {
        return this.systems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return this.systems.get(i).getId();
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        View viewSystem;

        if (convertView == null)
            viewSystem = View.inflate(parent.getContext(), R.layout.item_view_object, null);
        else viewSystem = convertView;

        System system = (System) this.getItem(i);
        ((ImageView) viewSystem.findViewById(R.id.image)).setImageResource(system.getImg());
        ((TextView) viewSystem.findViewById(R.id.title)).setText(system.getTitle());
        ((TextView) viewSystem.findViewById(R.id.subTitle)).setText(system.getSubText());
        ((TextView) viewSystem.findViewById(R.id.content)).setText(system.getContent());

        return viewSystem;
    }
}
