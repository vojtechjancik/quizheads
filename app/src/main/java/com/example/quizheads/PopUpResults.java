package com.example.quizheads;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import androidx.appcompat.app.AppCompatActivity;

public class PopUpResults extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        final TextView textViewScore = findViewById(R.id.textView);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup);

        Button closePopUpButton = findViewById(R.id.closePopUpButton);

        closePopUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PopUpResults.this, MainActivity.class);
                Bundle bundle = intent.getExtras();

                startActivity(intent);
            }
        });

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (height * .6));
    }

    private void NumberOfRightAnswers() { //TODO
        TextView resultText = findViewById(R.id.textView);

    }
}

