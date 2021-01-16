package com.shreya.winter_semester_timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String MSG = "com.shreya.winter_semester_timetable.monday";
    public static final String MSG2 = "com.shreya.winter_semester_timetable.tuesday";
    public static final String MSG3 = "com.shreya.winter_semester_timetable.wednesday";
    public static final String MSG4 = "com.shreya.winter_semester_timetable.thursday";
    public static final String MSG5 = "com.shreya.winter_semester_timetable.friday";
    Button btn;
    Intent intent;
    String day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mondaySchedule(View view)
    {

        btn = findViewById(R.id.button1);
        day = btn.getText().toString();
        intent = new Intent(this, Monday.class);
        intent.putExtra(MSG, day);
        startActivity(intent);
    }

    public void tuesdaySchedule(View view)
    {
        btn = findViewById(R.id.button2);
        day = btn.getText().toString();
        intent = new Intent(this, Tuesday.class);
        intent.putExtra(MSG2, day);
        startActivity(intent);
    }

    public void wednesdaySchedule(View view)
    {
        btn = findViewById(R.id.button3);
        day = btn.getText().toString();
        intent = new Intent(this, Wednesday.class);
        intent.putExtra(MSG3, day);
        startActivity(intent);
    }

    public void thursdaySchedule(View view)
    {
        btn = findViewById(R.id.button4);
        day = btn.getText().toString();
        intent = new Intent(this, Thursday.class);
        intent.putExtra(MSG4, day);
        startActivity(intent);
    }

    public void fridaySchedule(View view)
    {
        btn = findViewById(R.id.button5);
        day = btn.getText().toString();
        intent = new Intent(this, Friday.class);
        intent.putExtra(MSG5, day);
        startActivity(intent);
    }
}