package com.example.quizheads;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AboutThisProject extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutthisproject);

        TextView textView = findViewById(R.id.aboutProjectText);
        textView.setText("Creating project for learning Android and Java programming. " +
                "App is about learning and testing your skills about countries and it's capital cities.");
    }
}
