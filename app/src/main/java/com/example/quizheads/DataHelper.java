package com.example.quizheads;

import android.content.Context;

import java.util.HashMap;
import java.util.Map;

public class DataHelper {


    public static Map<String, String> createMapOfCountries(Context context) {
        Map<String, String> countries = new HashMap<>();
        countries.put(context.getString(R.string.afghanistan), context.getString(R.string.afghanistan_capital));
        countries.put(context.getString(R.string.albania), context.getString(R.string.albania_capital));
        countries.put(context.getString(R.string.algeria), context.getString(R.string.algeria_capital));
        countries.put(context.getString(R.string.angola), context.getString(R.string.angola_capital));
        countries.put(context.getString(R.string.australia), context.getString(R.string.australia_capital));
        countries.put(context.getString(R.string.austria), context.getString(R.string.austria_capital));
        countries.put(context.getString(R.string.croatia), context.getString(R.string.croatia_capital));
        countries.put(context.getString(R.string.czechia), context.getString(R.string.czechia_capital));
        countries.put(context.getString(R.string.denmark), context.getString(R.string.denmark_capital));
        countries.put(context.getString(R.string.finland), context.getString(R.string.finland_capital));
        countries.put(context.getString(R.string.france), context.getString(R.string.france_capital));
        countries.put(context.getString(R.string.germany), context.getString(R.string.germany_capital));
        countries.put(context.getString(R.string.hungary), context.getString(R.string.hungary_capital));
        countries.put(context.getString(R.string.italy), context.getString(R.string.italy_capital));
        countries.put(context.getString(R.string.norway), context.getString(R.string.norway_capital));
        countries.put(context.getString(R.string.poland), context.getString(R.string.poland_capital));
        countries.put(context.getString(R.string.portugal), context.getString(R.string.portugal_capital));
        countries.put(context.getString(R.string.slovakia), context.getString(R.string.slovakia_capital));
        countries.put(context.getString(R.string.spain), context.getString(R.string.spain_capital));
        countries.put(context.getString(R.string.sweden), context.getString(R.string.sweden_capital));

        return countries;
    }
}
