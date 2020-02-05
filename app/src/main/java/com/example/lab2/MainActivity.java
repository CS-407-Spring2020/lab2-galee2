package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean clicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view) {
        EditText nameInput = findViewById(R.id.nameInput);
        //Toast.makeText(MainActivity.this, nameInput.getText().toString(), Toast.LENGTH_LONG).show();

        String str = nameInput.getText().toString();
        goToActivity2(str);

        // Log.i("Info", "Button clicked!");
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this, ClickActivity.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    public void changeText(View view) {
        Button changeButton = findViewById(R.id.changeButton);
        if (!clicked) {
            changeButton.setText("Don't Click Me!"); //button hasn't been clicked yet
            clicked = true;
        } else {
            changeButton.setText("Click Me!"); //button has been clicked already
            clicked = false;
        }
    }
}
