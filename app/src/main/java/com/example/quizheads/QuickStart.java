package com.example.quizheads;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import static java.lang.Math.random;

public class QuickStart extends AppCompatActivity  {
    String questionNumber = "Question number";
    int number = 1;
    StartLearning mapa = new StartLearning();
    int correctAnswerCounter = 0;


        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_quickstart);

           /* TextView textViewQuestion = findViewById(R.id.questionNameTextView);
            EditText textForAnswer = findViewById(R.id.answerEditText);
            Button showResult = findViewById(R.id.showResultButton);
            RecyclerView recyclerView = findViewById(R.id.recycler_view_learning_countries);*/

            showQuestion();
            increaseQuestionNumber();
            showResults();
        }

        public void increaseQuestionNumber() {
            Button nextQuestion = findViewById(R.id.nextQuestionButton);
            final TextView textViewQuestionNumber = findViewById(R.id.questionNumber);
            final Button showResult = findViewById(R.id.showResultButton);
            final EditText textForAnswer = findViewById(R.id.answerEditText);
            showResult.setBackgroundResource(android.R.drawable.btn_default);
            nextQuestion.setBackgroundResource(android.R.drawable.btn_default);

            textViewQuestionNumber.setText("Question number " + number);
            nextQuestion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (number <= 9) {
                        number++;
                        textViewQuestionNumber.setText("Question number " + number);
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

            final ArrayList<String> keyList = new ArrayList<String>(mapa.getMapCountries().keySet());
            final ArrayList<String> valueList = new ArrayList<String>(mapa.getMapCountries().values());

            final int indexOfQuestionNumbers = (int) (Math.random() * 10);

            final ArrayList<String> listOfQuestions = new ArrayList<>();
            listOfQuestions.add("What is the capital city of: " + keyList.get(indexOfQuestionNumbers));
            listOfQuestions.add("In which state is this capital city located: " + valueList.get(indexOfQuestionNumbers));

            final int randomIndex2 = (int) (Math.random() * listOfQuestions.size());
            final String random1 = listOfQuestions.get(randomIndex2);

            textViewQuestion.setText(random1);

            showResult.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String textFromAnswer = textForAnswer.getText().toString();

                    if(textFromAnswer.contains(keyList.get(indexOfQuestionNumbers)) || textFromAnswer.equals(valueList.get(indexOfQuestionNumbers))) {
                        showResult.setBackgroundColor(Color.parseColor("#00BB11"));
                        showResult.setEnabled(false);
                        correctAnswerCounter++;
                    } else {
                        showResult.setBackgroundColor(Color.parseColor("#FF0000"));
                    }
                }
            });

        }

        public void showResults() {
            Button nextQuestion = findViewById(R.id.nextQuestionButton);
            final Button showResult = findViewById(R.id.showResultButton);

            if(number == 10) {
                showResult.setText("See all results");
                nextQuestion.setVisibility(View.INVISIBLE);
            }
        }
}
