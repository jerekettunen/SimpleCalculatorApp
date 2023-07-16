package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private double answer;
    private static final DecimalFormat df = new DecimalFormat("#.##########");

    private EditText firstNumber;
    private EditText secondNumber;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("init");
        firstNumber = findViewById(R.id.firstNumberInput);
        secondNumber = findViewById(R.id.secondNumberInput);
        output = findViewById(R.id.answerText);
        System.out.println("numbers");
    }

    public void add(View view){

        answer = toDouble(firstNumber) + toDouble(secondNumber);
        output.setText(df.format(answer));


    }

    public void subtract(View view){
        answer = toDouble(firstNumber) - toDouble(secondNumber);
        output.setText(df.format(answer));



    }

    public void multiply(View view){
        answer = toDouble(firstNumber) * toDouble(secondNumber);
        output.setText(df.format(answer));



    }

    public void divide(View view){
        answer = toDouble(firstNumber) / toDouble(secondNumber);
        output.setText(df.format(answer));


    }

    private double toDouble(EditText text){
        return Double.parseDouble(text.getText().toString());
    }
}