package com.example.aa.engineering_brother;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Button_Activity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "확인 : ";


    private Button mAnnouncement_btn;
    private Button mRecommend_btn;
    private Button mReview_btn;

    public String btn1;
    public String btn2;
    public String btn3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_);

        Log.d(TAG, "on create");


        mAnnouncement_btn = (Button) findViewById(R.id.announcement_btn);
        mRecommend_btn= (Button) findViewById(R.id.recommend_btn);
        mReview_btn = (Button) findViewById(R.id.review_btn);

        findViewById(R.id.announcement_btn).setOnClickListener(this);
        findViewById(R.id.recommend_btn).setOnClickListener(this);
        findViewById(R.id.review_btn).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(v.getContext(), MainActivity.class);

        switch (v.getId()){
            case R.id.announcement_btn:
                btn1 = "R.id.announcement_btn";
                intent.putExtra("1",btn1);
                startActivity(intent);
                finish();
            case R.id.recommend_btn:
                btn2 = "R.id.recommend_btn";
                intent.putExtra("2",btn2);
                startActivity(intent);
                finish();
            case R.id.review_btn:
                btn3 = "R.id.review_btn";
                intent.putExtra("3",btn3);
                startActivity(intent);
                finish();
        }


    }
}
