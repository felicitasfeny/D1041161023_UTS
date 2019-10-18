package com.example.mymaterial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class syntax_four extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syntax_four);
    }

    public void back_one(View view) {
        Toast.makeText(this,"Back", Toast.LENGTH_LONG).show();
        finish();
    }
}
