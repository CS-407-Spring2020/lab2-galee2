package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ClickActivity extends AppCompatActivity {

    TextView disp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click);

        disp = findViewById(R.id.dispText);
        Intent intent = getIntent();
        String str = "Hello " + intent.getStringExtra("message");
        disp.setText(str);
    }
}
