package com.example.quizheads;

import android.annotation.SuppressLint;
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
import androidx.recyclerview.widget.RecyclerView;

import static java.lang.Math.random;

public class QuickStart extends AppCompatActivity  {
        String questionNumber = "Question number";
        int number = 1;
        StartLearning mapa = new StartLearning();


        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_quickstart);

            TextView textViewQuestion = findViewById(R.id.questionNameTextView);
            EditText textForAnswer = findViewById(R.id.answerEditText);
            Button showResult = findViewById(R.id.showResultButton);
            RecyclerView recyclerView = findViewById(R.id.recycler_view_learning_countries);
            showQuestion();
            increaseQuestionNumber();
        }

        public void increaseQuestionNumber() {
            final TextView textViewQuestionNumber = findViewById(R.id.questionNumber);
            TextView textViewQuestion = findViewById(R.id.questionNameTextView);
            Button nextQuestion = findViewById(R.id.nextQuestionButton);

            textViewQuestionNumber.setText("Question number " + number);
            nextQuestion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (number <= 9) {
                        number++;
                        textViewQuestionNumber.setText("Question number " + number);
                        showQuestion();
                    }
                }});
            }

        @SuppressLint("SetTextI18n")
        public void showQuestion() {
            TextView textViewQuestion = findViewById(R.id.questionNameTextView);

            ArrayList<String> keyList = new ArrayList<String>(mapa.getMapCountries().keySet());
            ArrayList<String> valueList = new ArrayList<String>(mapa.getMapCountries().values());

            int randomIndex1 = (int) (Math.random() * 10);

            ArrayList<String> list1 = new ArrayList<>();
            list1.add("What is the capital city of: " + keyList.get(randomIndex1));
            list1.add("In which state is this city located : " + valueList.get(randomIndex1));

            int randomIndex2 = (int) (Math.random() * list1.size());
            textViewQuestion.setText(list1.get(randomIndex2));
        }
}
