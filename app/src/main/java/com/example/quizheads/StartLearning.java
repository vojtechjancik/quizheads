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
        countries.put("Afghanistan", "Kabul");
        countries.put("Albania", "Tirana");
        countries.put("Algeria", "Algiers");
        countries.put("Australia", "Perth");
        countries.put("Austria", "Vienna");
        countries.put("Croatia", "Zagreb");
        countries.put("Czech Republic", "Prague");
        countries.put("Denmark", "Copenhagen");
        countries.put("Finland", "Helsinki");
        countries.put("France", "Paris");
        countries.put("Germany", "Berlin");
        countries.put("Hungary", "Budapest");
        countries.put("Italy", "Roma");
        countries.put("Norway", "Oslo");
        countries.put("Poland", "Warsaw");
        countries.put("Portugal", "Lisboa");
        countries.put("Slovakia", "Bratislava");
        countries.put("Spain", "Madrid");
        countries.put("Sweden", "Stockholm");
        //countries.put( getString(R.string.angola), getString(R.string.angola_capital)); //Not working, but should be!

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
