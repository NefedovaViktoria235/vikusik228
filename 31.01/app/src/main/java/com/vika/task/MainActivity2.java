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

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    EditText editTextText, editTextText2, editTextText4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editTextText = findViewById(R.id.editTextText);
        editTextText2 = findViewById(R.id.editTextText2);
        editTextText4 = findViewById(R.id.editTextText4);
        textView = findViewById(R.id.textView);
    }

    @SuppressLint("SetTextI18n")
    public void viches(View view) {
        double a = Double.parseDouble(editTextText.getText().toString());
        double b = Double.parseDouble(editTextText2.getText().toString());
        double c = Double.parseDouble(editTextText4.getText().toString());

        double temp = a;
        a = c;
        c = b;
        b = temp;

        textView.setText("После изменения: \nA = " +
                a + ", \nB = " + b + ", \nC = " + c);
    }

    public void sled(View view) {
        Intent intent = new Intent(this , MainActivity3.class);
        startActivity(intent);
    }
}