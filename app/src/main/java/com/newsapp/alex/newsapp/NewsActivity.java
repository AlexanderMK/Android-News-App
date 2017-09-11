package com.newsapp.alex.newsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by alex on 9/8/17.
 */

public class NewsActivity extends AppCompatActivity {
    private TextView mLocationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        mLocationTextView = (TextView) findViewById(R.id.locationEditText);
        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("News Categories: " + location);
    }
}
