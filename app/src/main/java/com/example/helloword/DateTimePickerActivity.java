package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class DateTimePickerActivity extends AppCompatActivity {

    private EditText time, date;
    private Button btnTime, btnDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date_time_picker);
        initView();

        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        btnTime.setOnClickListener(view -> { new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hour, int minute) {
                time.setText(String.format("%d:%d", hour, minute));
            }
        }, hour, minute, true).show();
        });

        btnDate.setOnClickListener(view -> {new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                date.setText(String.format("%d/%d/%d", day, month + 1, year));
            }
        }, year, month, day).show();
        });
    }

    private void initView () {
        time = findViewById(R.id.timePicker);
        date = findViewById(R.id.datePicker);
        btnTime = findViewById(R.id.btnTime);
        btnDate = findViewById(R.id.btnDate);
    }
}