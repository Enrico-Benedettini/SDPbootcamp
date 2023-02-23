package com.github.Enrico_Benedettini.bootcamp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
        Bundle b = getIntent().getExtras();
        String name = b == null ? "ERROR" : b.getString("name");

        TextView x = (TextView) findViewById(R.id.yourName);
        x.setText(name);
    }
}