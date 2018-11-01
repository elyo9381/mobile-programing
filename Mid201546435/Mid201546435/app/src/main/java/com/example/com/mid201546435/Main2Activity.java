package com.example.com.mid201546435;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private Button mAdd_btn;
    private Button mSub_btn;
    private EditText mEditText1;
    private EditText mEditText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);
        mAdd_btn = (Button) findViewById(R.id.add_btn);
        mSub_btn = (Button) findViewById(R.id.sub_btn);

        findViewById(R.id.add_btn).setOnClickListener(this);
        findViewById(R.id.sub_btn).setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        String firstNum  = mEditText1.getText().toString();
        String secondNum = mEditText2.getText().toString();
        String operator = (String) ((Button) v).getText();

        if(operator.equals("덧셈")){
            operator ="+";
        }else if(operator.equals("뺄셈")){
            operator ="-";
        }

        if( firstNum.length() == 0 ) {
            Toast.makeText(Main2Activity.this, "첫번째 값을 입력하세요!", Toast.LENGTH_SHORT).show();
            mEditText1.requestFocus();
            return;
        } else if ( secondNum.length() == 0 ) {
            Toast.makeText(Main2Activity.this, "두번째 값을 입력하세요!", Toast.LENGTH_SHORT).show();
            mEditText2.requestFocus();
            return;
        }

        if(operator.equals("/") && secondNum.equals("0")) {
            Toast.makeText(Main2Activity.this, "0 으로 나눌 수 없습니다!", Toast.LENGTH_SHORT).show();
            mEditText2.requestFocus();
            return;
        }

        Intent intent = new Intent(v.getContext(), Main3Activity.class);
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
            mEditText1.setText(data.getStringExtra("equation"));
            mEditText2.setText(" ");



        }
    }
}
