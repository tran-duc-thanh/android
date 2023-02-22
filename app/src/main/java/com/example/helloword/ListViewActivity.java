package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        init();
        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            Toast.makeText(getApplicationContext(), arrayAdapter.getItem(i), Toast.LENGTH_SHORT).show();
        });
    }

    private void init() {
        listView = findViewById(R.id.listView);
        arrayAdapter = new ArrayAdapter<>(this, R.layout.item_view, getResources().getStringArray(R.array.list));
        listView.setAdapter(arrayAdapter);
    }
}