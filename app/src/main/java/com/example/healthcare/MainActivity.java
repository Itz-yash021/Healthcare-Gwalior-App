package com.example.healthcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referring the Views
        Button bt1 = (Button) findViewById(R.id.button_1);
        Button bt2 = (Button) findViewById(R.id.button_2);

        //Creating Listener for Button
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent For Navigating to Second Activity
                Intent i = new Intent(MainActivity.this, MainActivity_1.class);
                startActivity(i);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivity_2.class);
                startActivity(i);
            }
        });
    }
}