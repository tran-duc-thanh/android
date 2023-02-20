package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    private EditText number1;
    private EditText number2;
    private TextView result;
    private Button button;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_handling_1);
        number1 = findViewById(R.id.valNumber1);
        number2 = findViewById(R.id.valNumber2);
        result = findViewById(R.id.valResult);
        button = findViewById(R.id.btn);
        spinner = findViewById(R.id.spinner);
        button.setOnClickListener(view -> {
            result.setText(String.format("%f", tinh(number1, number2, button, spinner.getSelectedItem().toString())));
            setContentView(R.layout.event_handling_1);
        });
    }

    private float tinh (EditText number1, EditText number2, Button button,String key) {
        float numb1 = Integer.parseInt(number1.getText().toString());
        float numb2 = Integer.parseInt(number2.getText().toString());
        switch (key) {
            case "+":
                button.setText("cộng");
                return numb1 + numb2;
            case "-":
                button.setText("trừ");
                return numb1 - numb2;
            case "x":
                button.setText("nhân");
                return numb1 * numb2;
            case ":":
                button.setText("chia");
                return numb1 / numb2;
            default:
                return 0;
        }
    }
}