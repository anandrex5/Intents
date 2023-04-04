package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        userName =findViewById(R.id.textView2);

        //Define the TextView

        Intent intent = getIntent();
        //Create an string container
        String name = intent.getStringExtra("keyword");

                //If we send Boolean then code will we
                //String name = intent.getBooleanExtra("keyword");

        userName.setText(name);

    }
}