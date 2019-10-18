package com.example.mymaterial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class component_four extends AppCompatActivity {
    private static final String LOG_TAG =
            component_four.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component_four);
    }

    public void back_one(View view) {
        Toast.makeText(this,"Back", Toast.LENGTH_LONG).show();
        finish();
    }

    public void next_one(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, syntax_four.class);
        startActivity(intent);
    }
}
