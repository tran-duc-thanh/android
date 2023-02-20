package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.helloword.enums.Calculation;

public class CalculatorActivity extends AppCompatActivity {

    public static final String NOT_ZEOR = "Number 2 phải khác 0";
    public static final String NOT_RESULT = "System error";
    public static final String EMPTY = "";

    private EditText number1;
    private EditText number2;
    private TextView result;
    private Button button;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_handling_1);
        initView();
        button.setOnClickListener(view -> {
            result.setText(calculate());
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                setViewBtn();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    private void initView () {
        number1 = findViewById(R.id.valNumber1);
        number2 = findViewById(R.id.valNumber2);
        result = findViewById(R.id.valResult);
        button = findViewById(R.id.btn);
        spinner = findViewById(R.id.spinner);
    }
    private String calculate () {
        float numb1 = Integer.parseInt(number1.getText().toString());
        float numb2 = Integer.parseInt(number2.getText().toString());
        switch (spinner.getSelectedItem().toString()) {
            case "+":
                return String.format("%.2f", numb1 + numb2);
            case "-":
                return String.format("%.2f", numb1 - numb2);
            case "x":
                return String.format("%.2f", numb1 * numb2);
            case ":":
                if (numb2 == 0) return NOT_ZEOR;
                return String.format("%.2f", numb1 / numb2);
            default:
                return NOT_RESULT;
        }
    }

    private void setViewBtn () {
        switch (spinner.getSelectedItem().toString()) {
            case "+":
                button.setText(Calculation.PLUS.getValue());
                break;
            case "-":
                button.setText(Calculation.MINUS.getValue());
                break;
            case "x":
                button.setText(Calculation.MULTIPLY.getValue());
                break;
            case ":":
                button.setText(Calculation.DIVISION.getValue());
                break;
            default:
                button.setText(EMPTY);
        }
    }
}