package com.github.Enrico_Benedettini.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent myIntent = new Intent(MainActivity.this, GreetingActivity.class);
        EditText x = (EditText) findViewById(R.id.mainName);
        String yourName = x.getText().toString();
        myIntent.putExtra("name", yourName); //Optional parameters
        MainActivity.this.startActivity(myIntent);
    }
}