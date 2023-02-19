package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RegiterActivity extends AppCompatActivity {

    private Context context;
    private TextView loginTextView;

    private Bundle requestLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout_regiter);
        context = this;
        requestLogin = savedInstanceState;
        loginTextView = findViewById(R.id.login);
        loginTextView.setOnClickListener(view -> login());
    }

    private void login () {
        Intent intent = new Intent(context, LoginActivity.class);
        startActivity(intent, requestLogin);
    }
}