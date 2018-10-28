package com.example.aa.mobile;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CaIntentActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTextView_result;
    private Button mButton_result;
    private String operator;
    private int firstNum;
    private int secondNum;
    private int result;
    private String equation;
    private String result1;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ca_intent);

        mTextView_result = (TextView) findViewById(R.id.Calcul_result);

        Intent intent = getIntent();
        operator = intent.getStringExtra("operator");
        firstNum = Integer.parseInt(intent.getStringExtra("firstNum"));
        secondNum = Integer.parseInt(intent.getStringExtra("secondNum"));
        result = getResult(firstNum, secondNum, operator);
        equation = firstNum + " " + operator + " " + secondNum + " = " + result;
        result1 = ""+ result;

        mTextView_result.setText(equation);

        findViewById(R.id.result_btn).setOnClickListener(this);
    }

    private int getResult(int firstNum, int secondNum, String operator)
    {
        switch (operator) {
            case ("+"):
                return firstNum + secondNum;
            case "-":
                return firstNum - secondNum;
            case "*":
                return firstNum * secondNum;
            case "/":
                return (int) firstNum / secondNum;
            default:
                return 0;
        }
    }

    @Override
    public void onClick(View v) {
        Intent resultIntent = new Intent();
        resultIntent.putExtra("equation", result1);
        setResult(RESULT_OK, resultIntent);
        finish();
    }
}
