package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Context context;
    private TextView regiterTextView;
    private EditText gmail;
    private EditText pass;
    private Button btnLogin;

    public static final int REQUEST_CODE_REGISTER = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout_login);
        context = this;
        initView();
        regiterTextView.setOnClickListener(view -> regiter());
        btnLogin.setOnClickListener(view -> {showMessage();});
    }

    private void initView () {
        regiterTextView = findViewById(R.id.regiter);
        gmail = findViewById(R.id.gmail);
        pass = findViewById(R.id.password);
        btnLogin = findViewById(R.id.btnLogin);
    }

    private void regiter () {
        Intent intent = new Intent(context, RegiterActivity.class);
        startActivityForResult(intent, REQUEST_CODE_REGISTER);
    }

    private void showMessage () {
        if (checkLogin())
            Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_SHORT).show();
        else Toast.makeText(getApplicationContext(), "False", Toast.LENGTH_SHORT).show();
    }

    private boolean checkLogin () {
        if (gmail.getText().toString().equals("admin") && pass.getText().toString().equals("admin"))
            return true;
        return false;
    }
}