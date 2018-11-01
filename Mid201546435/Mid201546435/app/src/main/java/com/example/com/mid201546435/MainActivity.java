package com.example.com.mid201546435;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mButton_fin;
    private Button mButton_cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onclick1(View v) {
        Intent intent = new Intent(v.getContext(), Main2Activity.class);
        startActivity(intent);
        finish();
    }

    public void onclick2(View view) {
        finishAffinity();
    }
}
