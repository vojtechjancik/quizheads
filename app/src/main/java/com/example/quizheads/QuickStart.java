package com.example.quizheads;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class QuickStart extends AppCompatActivity  {
    int number = 1;
    StartLearning objectStartLearning = new StartLearning();
    int correctAnswerCounter = 0;



        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_quickstart);

            showQuestion();
            increaseQuestionNumber();
            showResults();
        }


        @SuppressLint("SetTextI18n")
        public void increaseQuestionNumber() {
            Button nextQuestion = findViewById(R.id.nextQuestionButton);
            final TextView textViewQuestionNumber = findViewById(R.id.questionNumber);
            final Button showResult = findViewById(R.id.showResultButton);
            final EditText textForAnswer = findViewById(R.id.answerEditText);
            showResult.setBackgroundResource(android.R.drawable.btn_default);
            nextQuestion.setBackgroundResource(android.R.drawable.btn_default);

            textViewQuestionNumber.setText(getString(R.string.question_number_2) + number);
            nextQuestion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (number <= 9) {
                        number++;
                        textViewQuestionNumber.setText(getString(R.string.question_number_2) + number);
                        showResult.setBackgroundResource(android.R.drawable.btn_default);
                        textForAnswer.setText("");
                        showResult.setEnabled(true);

                        showQuestion();
                    }
                }});
            }

        @SuppressLint("SetTextI18n")
        public void showQuestion() {
            final TextView textViewQuestion = findViewById(R.id.questionNameTextView);
            final Button showResult = findViewById(R.id.showResultButton);
            final EditText textForAnswer = findViewById(R.id.answerEditText);
            Map<String, String> getMapOfCountries = DataHelper.createMapOfCountries(this);

            final ArrayList<String> keyList = new ArrayList<String>(getMapOfCountries.keySet());
            final ArrayList<String> valueList = new ArrayList<String>(getMapOfCountries.values());

            final int indexOfQuestionNumbers = (int) (Math.random() * 10);

            final ArrayList<String> listOfQuestions = new ArrayList<>();
            listOfQuestions.add(getString(R.string.question_capital_city) + keyList.get(indexOfQuestionNumbers));
            listOfQuestions.add(getString(R.string.question_country) + valueList.get(indexOfQuestionNumbers));

            final int randomIndex2 = (int) (Math.random() * listOfQuestions.size());
            final String random1 = listOfQuestions.get(randomIndex2);

            textViewQuestion.setText(random1);

            showResult.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String textFromAnswer = textForAnswer.getText().toString();

                    if(randomIndex2 == 1 && textFromAnswer.contains(keyList.get(indexOfQuestionNumbers))) {
                        showResult.setBackgroundColor(Color.parseColor("#00BB11"));
                        showResult.setEnabled(false);
                        correctAnswerCounter++;
                    } else if(randomIndex2 == 0 && textFromAnswer.equals(valueList.get(indexOfQuestionNumbers))){
                        showResult.setBackgroundColor(Color.parseColor("#00BB11"));
                        showResult.setEnabled(false);
                        correctAnswerCounter++;
                    } else {
                        showResult.setBackgroundColor(Color.parseColor("#FF0000"));
                    }
                }

            });

        }

        public void showResults() { //TODO
            Button nextQuestion = findViewById(R.id.nextQuestionButton);
            final Button showResult = findViewById(R.id.showResultButton);

            if(number == 9) {
                showResult.setText("See all results");
                nextQuestion.setVisibility(View.INVISIBLE);
                showResult.setVisibility(View.VISIBLE);
            }
        }
}
