package com.example.quizheads;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button quickStart = findViewById(R.id.quickTestButton);
        Button startLearning = findViewById(R.id.learningButton);
        Button aboutThisProject = findViewById(R.id.aboutButton);

        quickStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, QuickStart.class);
                startActivity(i);
            }
        });

        startLearning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, StartLearning.class);
                startActivity(i);
            }
        });

        aboutThisProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AboutThisProject.class);
                startActivity(i);
            }
        });


    }
 }
