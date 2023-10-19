package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Update extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        Intent currentIntent = getIntent();
        TextView u = findViewById(R.id.updateName);
        u.setText(currentIntent.getStringExtra("message_key"));
    }
}