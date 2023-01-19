package com.example.temperatureconversionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Fahrenheit;
    EditText Celsius;
    Button convert_Fahrenheit;
    Button convert_Celsius;
    ConstraintLayout layout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fahrenheit = findViewById(R.id.Fahrenheit_Input);
        Celsius = findViewById(R.id.Celsius_input);
        convert_Fahrenheit = findViewById(R.id.FahrenheitButton);
        convert_Celsius = findViewById(R.id.CelsiusButton);

        convert_Fahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String f = Fahrenheit.getText().toString();
                double x = Double.parseDouble(f);
                double celsius = ((x-32)/1.8);
                Fahrenheit.setText(celsius + "");

            }
        });

        convert_Celsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = Celsius.getText().toString();
                double d = Double.parseDouble(c);
                double fahrenheit = d * 1.8 + 32;
                Celsius.setText(fahrenheit + "");

            }
        });


    }
}