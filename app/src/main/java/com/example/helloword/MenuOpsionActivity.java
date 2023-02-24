package com.example.helloword;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MenuOpsionActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_opsion);
        init();
    }

    private void init () {
        textView = findViewById(R.id.textViewMenuContext);
        registerForContextMenu(textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opsion, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_context, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.exit:
                System.exit(0);
                break;
            case R.id.file:
                Toast.makeText(this, "File", Toast.LENGTH_SHORT).show();
                break;
            case R.id.email:
                Toast.makeText(this, "Email", Toast.LENGTH_SHORT).show();
                break;
            case R.id.phone:
                Toast.makeText(this, "Phone", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.red:
                textView.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.red));
                break;
            case R.id.blue:
                textView.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.darkblue));
                break;
            case R.id.green:
                textView.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.green));
                break;
            case R.id.gray:
                textView.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.gray));
                break;
        }
        return super.onContextItemSelected(item);
    }
}