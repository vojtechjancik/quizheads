package com.example.quizheads;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

    public class QuickStart extends AppCompatActivity {
        String questionNumber = "Question number";
        int number = 1;


        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_quickstart);

            TextView textViewQuestion = findViewById(R.id.questionNameTextView);
            EditText textForAnswer = findViewById(R.id.answerEditText);
            Button showResult = findViewById(R.id.showResultButton);

            increaseQuestionNumber();
        }

        public void increaseQuestionNumber() {
            final TextView textViewQuestionNumber = findViewById(R.id.questionNumber);
            Button nextQuestion = findViewById(R.id.nextQuestionButton);

            textViewQuestionNumber.setText("Question number " + number);
            nextQuestion.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        if (number <= 9) {
                            number++;
                            textViewQuestionNumber.setText("Question number " + number);
                        }
                    }});
            }


        /*public void showQuestion() {

            TextView textViewQuestion = findViewById(R.id.questionNameTextView);
            textViewQuestion.setText("What is the capital city of ");
        }*/

    }
