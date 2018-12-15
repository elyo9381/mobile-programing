package com.example.aa.engineering_brother;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Result_Activity extends AppCompatActivity {

    public String price;
    public String job;
    public String storage;
    public String storage_size;
    public String battery;
    public String display;
    public String weight;
    public String brand;
    private TextView mTextView0;
    private TextView mTextView1;
    private TextView mTextView2;
    private TextView mTextView3;
    private TextView mTextView4;
    private TextView mTextView5;
    private TextView mTextView6;
    private TextView mTextView7;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_);

        mTextView0 = (TextView) findViewById(R.id.text_result0);
        mTextView1 = (TextView) findViewById(R.id.text_result1);
        mTextView2 = (TextView) findViewById(R.id.text_result2);
        mTextView3 = (TextView) findViewById(R.id.text_result3);
        mTextView4 = (TextView) findViewById(R.id.text_result4);
        mTextView5 = (TextView) findViewById(R.id.text_result5);
        mTextView6 = (TextView) findViewById(R.id.text_result6);
        mTextView7 = (TextView) findViewById(R.id.text_result7);




        Intent intent = getIntent();
        processCommand(intent);
//        data1 = intent.getStringExtra("value");
//
//        mTextView.setText(data1);
//        Toast.makeText(this, data1, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        processCommand(intent);
        super.onNewIntent(intent);
    }

    private void processCommand(Intent intent) {
        if(intent != null){
            String price = intent.getStringExtra("price");
            String job = intent.getStringExtra("job");
            String storage = intent.getStringExtra("storage");
            String storage_size = intent.getStringExtra("storage_size");
            String battery = intent.getStringExtra("battery");
            String display = intent.getStringExtra("display");
            String weight = intent.getStringExtra("weight");
            String brand = intent.getStringExtra("brand");
            mTextView0.setText(price);
            mTextView1.setText(job);
            mTextView2.setText(storage);
            mTextView3.setText(storage_size);
            mTextView4.setText(battery);
            mTextView5.setText(display);
            mTextView6.setText(weight);
            mTextView7.setText(brand);

        }
    }


}
