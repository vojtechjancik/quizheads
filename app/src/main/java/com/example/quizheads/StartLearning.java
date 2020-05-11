package com.example.quizheads;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class StartLearning extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startlearning);

        // data to populate the RecyclerView with
        Map<String, String> countries = new HashMap<>();
        countries.put("Czech Republic", "Prague");
        countries.put("Slovakia", "Bratislava");
        countries.put("France", "Paris");
        countries.put("Germany", "Berlin");
        countries.put("Austria", "Vienna");
        //countries.get("Czech Republic");


        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recycler_view_learning_countries);
        adapter = new Adapter(this, countries);

        recyclerView.setAdapter(adapter);
    }
}
