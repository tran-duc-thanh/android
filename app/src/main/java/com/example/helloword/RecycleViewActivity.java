package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.helloword.model.Cat;
import com.example.helloword.model.CatAdapter;
import com.example.helloword.service.CatItemListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecycleViewActivity extends AppCompatActivity implements CatItemListener {

    private RecyclerView recyclerView;
    private CatAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        initView();
    }

    private void initView () {
        recyclerView = findViewById(R.id.recycleView);
        adapter = new CatAdapter(getDataCat());
        adapter.setCatItemListener(this);
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
        recyclerView.setAdapter(adapter);
    }

    private List<Cat> getDataCat() {
        return new ArrayList<>(Arrays.asList(
                new Cat(1l, R.drawable.cat1, "Cat 1"),
                new Cat(2l, R.drawable.cat2, "Cat 2"),
                new Cat(3l, R.drawable.cat3, "Cat 3"),
                new Cat(4l, R.drawable.cat4, "Cat 4"),
                new Cat(5l, R.drawable.cat5, "Cat 5"),
                new Cat(6l, R.drawable.cat6, "Cat 6"),
                new Cat(7l, R.drawable.cat7, "Cat 7"),
                new Cat(8l, R.drawable.cat8, "Cat 8"),
                new Cat(9l, R.drawable.cat9, "Cat 9"),
                new Cat(1l, R.drawable.cat1, "Cat 1"),
                new Cat(2l, R.drawable.cat2, "Cat 2"),
                new Cat(3l, R.drawable.cat3, "Cat 3"),
                new Cat(4l, R.drawable.cat4, "Cat 4"),
                new Cat(5l, R.drawable.cat5, "Cat 5"),
                new Cat(6l, R.drawable.cat6, "Cat 6"),
                new Cat(7l, R.drawable.cat7, "Cat 7"),
                new Cat(8l, R.drawable.cat8, "Cat 8"),
                new Cat(9l, R.drawable.cat9, "Cat 9"),
                new Cat(10l, R.drawable.cat10, "Cat 10")));
    }

    @Override
    public void onItemClick(View view, int postion) {
        Toast.makeText(view.getContext(), adapter.getItem(postion).getName(), Toast.LENGTH_SHORT).show();
    }
}