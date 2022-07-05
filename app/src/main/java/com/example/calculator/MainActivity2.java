package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    ScrollView sv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent it = getIntent();


        String history = it.getStringExtra("history");



        TextView strHistory = findViewById(R.id.viewHistory);

        strHistory.setMovementMethod(new ScrollingMovementMethod());
        strHistory.setText(history.toString());

    }

    public void back(View v){
        finish();
    }
}