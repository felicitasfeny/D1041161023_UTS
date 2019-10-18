package com.example.mymaterial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class component_one extends AppCompatActivity {
    private static final String LOG_TAG =
            component_one.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component_one);
    }

    public void next_one(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, syntax_one.class);
        startActivity(intent);
    }

    public void back_one(View view) {
        Toast.makeText(this,"Back", Toast.LENGTH_LONG).show();
        finish();
    }
}
