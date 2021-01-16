package com.shreya.winter_semester_timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Monday extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday);

        Intent intent = getIntent();
        String day = intent.getStringExtra(MainActivity.MSG);
        TextView textView = findViewById(R.id.textView2);
        textView.setText(day);

        textView = findViewById(R.id.textView6);
        textView.setText("No Lecture");

        textView = findViewById(R.id.textView10);
        textView.setText("Computer\n Networks");

        textView = findViewById(R.id.textView12);
        textView.setText("System\n Programming");
    }
}