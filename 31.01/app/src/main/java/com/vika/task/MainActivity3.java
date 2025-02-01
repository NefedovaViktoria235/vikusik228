package com.vika.task;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {
    TextView textView;
    EditText editTextText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        editTextText = findViewById(R.id.editTextText2);
        textView = findViewById(R.id.textView);
    }

    @SuppressLint("SetTextI18n")
    public void viches(View view) {
        double a = Double.parseDouble(editTextText.getText().toString());
        textView.setText("" + (a * 9 / 5 + 32));
    }

    public void sled(View view) {
    }
}