package com.example.mymaterial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void component1(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, component_one.class);
        startActivity(intent);
    }

    public void component2(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, component_two.class);
        startActivity(intent);
    }

    public void component3(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, component_three.class);
        startActivity(intent);
    }

    public void component4(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, component_four.class);
        startActivity(intent);
    }

    public void component5(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, component_five.class);
        startActivity(intent);
    }
}
