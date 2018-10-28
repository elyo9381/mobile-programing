package com.example.aa.mobile;


import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class CalActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mEditText_first;
    private EditText mEditText_second;
    private TextView mTextView_receive;
    private Button mButton_add;
    private Button mButton_sub;
    private Button mButton_mul;
    private Button mButton_div;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);

        mEditText_first = (EditText) findViewById(R.id.first_input);
        mEditText_second = (EditText) findViewById(R.id.second_input);
        mTextView_receive =(TextView) findViewById(R.id.receive_cal);
        mButton_add = (Button) findViewById(R.id.add_btn);
        mButton_sub = (Button) findViewById(R.id.sub_btn);
        mButton_mul = (Button) findViewById(R.id.mul_btn);
        mButton_div = (Button) findViewById(R.id.div_btn);



        findViewById(R.id.add_btn).setOnClickListener(this);
        findViewById(R.id.sub_btn).setOnClickListener(this);
        findViewById(R.id.mul_btn).setOnClickListener(this);
        findViewById(R.id.div_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String firstNum = mEditText_first.getText().toString();
        String secondNum = mEditText_second.getText().toString();
        String operator = (String) ((Button) v).getText();

        if( firstNum.length() == 0 ) {
            Toast.makeText(CalActivity.this, "첫번째 값을 입력하세요!", Toast.LENGTH_SHORT).show();
            mEditText_first.requestFocus();
            return;
        } else if ( secondNum.length() == 0 ) {
            Toast.makeText(CalActivity.this, "두번째 값을 입력하세요!", Toast.LENGTH_SHORT).show();
            mEditText_second.requestFocus();
            return;
        }

        if(operator.equals("/") && secondNum.equals("0")) {
            Toast.makeText(CalActivity.this, "0 으로 나눌 수 없습니다!", Toast.LENGTH_SHORT).show();
            mEditText_second.requestFocus();
            return;
        }

        Intent intent = new Intent(v.getContext(), CaIntentActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        intent.putExtra("firstNum", firstNum);
        intent.putExtra("secondNum", secondNum);
        intent.putExtra("operator", operator);

        startActivityForResult(intent, 1000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1000 && resultCode == RESULT_OK) {
            mTextView_receive.setText("최종 결과값 : "+data.getStringExtra("equation"));
        }
    }
}

