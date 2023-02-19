package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private Context context;
    private TextView regiterTextView;

    public static final int REQUEST_CODE_REGISTER = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout_login);
        context = this;
        regiterTextView = findViewById(R.id.regiter);
        regiterTextView.setOnClickListener(view -> regiter());
    }

    private void regiter () {
        Intent intent = new Intent(context, RegiterActivity.class);
        startActivityForResult(intent, REQUEST_CODE_REGISTER);
    }

}