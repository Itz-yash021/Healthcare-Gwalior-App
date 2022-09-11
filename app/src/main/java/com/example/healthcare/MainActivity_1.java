package com.example.healthcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_1);

        //Referring the Views
        Button bt1 = (Button) findViewById(R.id.button1);
        Button bt2 = (Button) findViewById(R.id.button2);
        Button bt3 = (Button) findViewById(R.id.button3);
        Button bt4 = (Button) findViewById(R.id.button4);

        //Creating Listener for Button
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent For Navigating to Second Activity
                Intent i = new Intent(MainActivity_1.this, SecondActivity.class);

                //For Passing the Values to Second Activity
                i.putExtra("disease_name", "Cold and Flu");

                startActivity(i);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity_1.this, SecondActivity.class);
                i.putExtra("disease_name", "Stomach Aches");
                startActivity(i);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity_1.this, SecondActivity.class);
                i.putExtra("disease_name", "Conjunctivitis");
                startActivity(i);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity_1.this, SecondActivity.class);
                i.putExtra("disease_name", "Diarrhea");
                startActivity(i);
            }
        });
    }
}