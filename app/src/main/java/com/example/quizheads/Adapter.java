package com.example.quizheads;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Map;

import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private Map<String, String> dataMap;
    private String[] dataKeys;
    private LayoutInflater mInflater;

    // data is passed into the constructor
    Adapter(Context context, Map<String, String> dataMap) {
        this.mInflater = LayoutInflater.from(context);
        this.dataMap = dataMap;
        dataKeys = dataMap.keySet().toArray(new String[dataMap.size()]);
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.textview_recyclerview, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String country = dataKeys[position];
        String mainCity = dataMap.get(country);
        holder.myTextView.setText(country);
        holder.myTextView2.setText(mainCity);
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return dataMap.size();
    }

    // stores and recycles views as they are scrolled off screen
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView myTextView;
        TextView myTextView2;

        ViewHolder(View itemView) {
            super(itemView);
            myTextView = itemView.findViewById(R.id.coutryName);
            myTextView2 = itemView.findViewById(R.id.countryMainCity);
        }
    }
}
