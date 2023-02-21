package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.helloword.enums.EventHandlerEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventHandler extends AppCompatActivity {

    private CheckBox checkBoxAndroid;
    private CheckBox checkBoxIos;
    private CheckBox checkBoxWin;
    private RadioButton radioMale;
    private RadioButton radioFemale;
    private RatingBar ratingBar;
    private Spinner country;
    private Spinner university;
    private Button btnSubmit;
    private TextView result;

    private Map<String, String> results;
    private List<String> checkBoxs;
    private List<String> radios;
    private List<String> stars;
    private List<String> countrys;
    private List<String> schools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_handler_1);
        initView();
        btnSubmit.setOnClickListener(view -> {
            initData();
            if (checkBoxAndroid.isChecked()) checkBoxs.add(checkBoxAndroid.getText().toString());
            if (checkBoxIos.isChecked()) checkBoxs.add(checkBoxIos.getText().toString());
            if (checkBoxWin.isChecked()) checkBoxs.add(checkBoxWin.getText().toString());
            addResult(checkBoxs, EventHandlerEnum.PHONE.getValua());
            if (radioMale.isChecked()) radios.add(radioMale.getText().toString());
            if (radioFemale.isChecked()) radios.add(radioFemale.getText().toString());
            addResult(radios, EventHandlerEnum.GENDER.getValua());
            stars.add(String.valueOf(ratingBar.getRating()));
            addResult(stars, EventHandlerEnum.STAR.getValua());
            countrys.add(country.getSelectedItem().toString());
            addResult(countrys, EventHandlerEnum.COUNTRY.getValua());
            schools.add(university.getSelectedItem().toString());
            addResult(schools, EventHandlerEnum.SCHOOL.getValua());
            showResult();
        });
    }

    private void initView () {
        checkBoxAndroid = findViewById(R.id.checkBoxAndroid);
        checkBoxIos = findViewById(R.id.checkBoxIos);
        checkBoxWin = findViewById(R.id.checkBoxWin);
        radioMale = findViewById(R.id.male);
        radioFemale = findViewById(R.id.female);
        ratingBar = findViewById(R.id.ratingBar);
        country = findViewById(R.id.spinnerCountry);
        university = findViewById(R.id.spinnerSchool);
        btnSubmit = findViewById(R.id.btnSubmit);
        result = findViewById(R.id.result);
    }

    private void initData () {
        results = new HashMap<>();
        checkBoxs = new ArrayList<>();
        radios = new ArrayList<>();
        stars = new ArrayList<>();
        countrys = new ArrayList<>();
        schools = new ArrayList<>();
    }
    private void addResult (List<String> rs, String name) {
        results.put(name, String.join(", ", rs));
    }

    private void showResult () {
        List<String> tmp = new ArrayList<>();
        for (Map.Entry<String, String> entry : results.entrySet())
            tmp.add(String.format("%s: %s", entry.getKey(), entry.getValue()));
        result.setText(String.join("\n", tmp));
    }
}