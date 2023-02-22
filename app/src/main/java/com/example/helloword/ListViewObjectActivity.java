package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.helloword.model.System;
import com.example.helloword.model.SystemAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class ListViewObjectActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<System> systems;
    private SystemAdapter systemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_object);
        init();
    }

    private void init () {
        listView = findViewById(R.id.listViewObject);
        systems = new ArrayList<>(Arrays.asList(
                new System(1, R.drawable.icon_android_black, "Android", "Sub android", "Content android"),
                new System(2, R.drawable.icon_apple_black, "Ios", "Sub ios", "Content ios"),
                new System(3, R.drawable.icon_windows_black, "Windows", "Sub windows", "Content windows"),
                new System(4, R.drawable.icon_linux_black, "Linux", "Sub linux", "Content linux")
        ));
        systemAdapter = new SystemAdapter(systems);
        listView.setAdapter(systemAdapter);
    }
}