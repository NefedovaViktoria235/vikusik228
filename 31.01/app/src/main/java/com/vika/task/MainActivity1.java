package com.vika.task;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {
    TextView textView;
    EditText editTextText , editTextText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextText = findViewById(R.id.editTextText);
        editTextText2 = findViewById(R.id.editTextText2);
        textView = findViewById(R.id.textView);
    }

    @SuppressLint("SetTextI18n")
    public void viches(View view) {
        double a = Double.parseDouble(editTextText.getText().toString());
        double b = Double.parseDouble(editTextText2.getText().toString());
        textView.setText("" + (((a + b)/ 2)));
    }

    public void sled(View view) {
        Intent intent = new Intent(this , MainActivity2.class);
        startActivity(intent);
    }
}