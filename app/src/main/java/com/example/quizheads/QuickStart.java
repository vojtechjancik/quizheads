package com.example.quizheads;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

    public class QuickStart extends AppCompatActivity {

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_quickstart);

            TextView textViewQuestion = findViewById(R.id.questionTextView);
            Button showResult = findViewById(R.id.showResultButton);

            showQuestion();

            textViewQuestion.setText(showQuestion());

        }

        public String showQuestion() {
            String showQuestionText = "Question";
            return showQuestionText;
        }
    }
