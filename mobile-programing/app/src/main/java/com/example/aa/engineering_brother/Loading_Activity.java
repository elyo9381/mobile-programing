package com.example.aa.engineering_brother;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Loading_Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_);

        hideActionBar();

        startLoading();
    }

    private void startLoading() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run(){
                Intent intent = new Intent(getBaseContext(), Button_Activity.class);
                startActivity(intent);
                finish();
            }

        }, 2000);
    }

    private void hideActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null ){
            actionBar.hide();
        }
    }
}
