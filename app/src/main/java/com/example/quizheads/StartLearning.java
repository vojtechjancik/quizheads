package com.example.quizheads;

import android.os.Bundle;
import android.widget.TextView;

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
    Map<String, String> countries = new HashMap<>();

    public Map<String, String> getMapCountries() {
        countries.put("Czech Republic", "Prague");
        countries.put("Slovakia", "Bratislava");
        countries.put("France", "Paris");
        countries.put("Germany", "Berlin");
        countries.put("Austria", "Vienna");
        countries.put("Hungary", "Budapest");
        countries.put("Sweden", "Stockholm");
        countries.put("Norway", "Oslo");
        countries.put("Finland", "Helsinki");
        countries.put("Spain", "Madrid");
        countries.put("Australia", "Perth");
        countries.put("Denmark", "Kobenhaven");
        countries.put("Poland", "Warszawa");
        countries.put("Italy", "Roma");
        countries.put("Portugal", "Lisboa");
        countries.put("Croatia", "Zagreb");
        return countries;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startlearning);
        getMapCountries();

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recycler_view_learning_countries);
        adapter = new Adapter(this, countries);
        recyclerView.setAdapter(adapter);
    }
}
