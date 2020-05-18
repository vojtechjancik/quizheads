package com.example.quizheads;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class StartLearning extends AppCompatActivity {
    /*private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;*/
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startlearning);

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recycler_view_learning_countries);
        adapter = new Adapter(this, DataHelper.createMapOfCountries(this));
        recyclerView.setAdapter(adapter);
    }
}
