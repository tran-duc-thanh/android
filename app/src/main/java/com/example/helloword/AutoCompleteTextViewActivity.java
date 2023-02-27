package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class AutoCompleteTextViewActivity extends AppCompatActivity {

    private AutoCompleteTextView oneAutoEditText;
    private MultiAutoCompleteTextView multiAutoEditText;

    private static final String[] COUNTRIES = new String[] {
            "Belgium", "France", "Italy", "Germany", "Spain"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);
        init();
    }

    private void init (){
        oneAutoEditText = findViewById(R.id.oneAuto);
        multiAutoEditText = findViewById(R.id.multiAuto);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, COUNTRIES);
        oneAutoEditText.setAdapter(adapter);
        multiAutoEditText.setAdapter(adapter);
        multiAutoEditText.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}