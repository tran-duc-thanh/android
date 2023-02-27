package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import com.example.helloword.model.SpinnerAdapter;

public class CLUDCatActivity extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cludcat);
        init();
    }

    private void init () {
        spinner = findViewById(R.id.spinnerCat);
        spinner.setAdapter(new SpinnerAdapter(this));
    }
}