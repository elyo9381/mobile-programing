package com.example.com.mid201546435;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    private TextView mResult_TextView;
    private Button mButton_Going;
    private Button mButton_Stop;
    private Double firstNum;
    private Double secondNum;
    private Double result;
    private String operator;
    private String equation;
    private String result1;
    private String Add;
    private String Sub;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mResult_TextView = (TextView) findViewById(R.id.result_textView);

        Intent intent = getIntent();
        operator = intent.getStringExtra("operator");
        firstNum = Double.parseDouble(intent.getStringExtra("firstNum"));
        secondNum = Double.parseDouble(intent.getStringExtra("secondNum"));
        result = getResult(firstNum, secondNum, operator);
        equation = firstNum + " " + operator + " " + secondNum + " = " + result;
        result1 = ""+ result;

        mResult_TextView.setText(equation);
    }

    public void onclick_going(View view) {
        Intent resultIntent = new Intent();
        resultIntent.putExtra("equation", result1);
        setResult(RESULT_OK, resultIntent);
        finish();
    }

    public void onclick_stop(View v) {
        Intent intent = new Intent(v.getContext(),MainActivity.class);
        startActivity(intent);
        finish();
    }

    private Double getResult(Double firstNum, Double secondNum, String operator)
    {
        switch (operator) {
            case ("+"):
                return firstNum + secondNum;
            case ("-"):
                return firstNum - secondNum;
            default:
                return null;
        }
    }

}
