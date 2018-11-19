package com.example.aa.engineering_brother;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Button_Activity extends AppCompatActivity implements View.OnClickListener {

    private Button mAnnouncement_btn;
    private Button mRecommend_btn;
    private Button mReview_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_);


        mAnnouncement_btn = (Button) findViewById(R.id.announcement_btn);
        mRecommend_btn= (Button) findViewById(R.id.recommend_btn);
        mReview_btn = (Button) findViewById(R.id.review_btn);

        findViewById(R.id.announcement_btn).setOnClickListener(this);
        findViewById(R.id.recommend_btn).setOnClickListener(this);
        findViewById(R.id.review_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        startActivity(intent);
        finish();

    }
}
