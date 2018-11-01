package com.example.aa.mobile;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    Bitmap image;
    ImageView BigImage;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mButton = (Button) findViewById(R.id.button2);

        findViewById(R.id.button2).setOnClickListener(this);
        Intent intent = getIntent();
        byte[] arr = getIntent().getByteArrayExtra("sunny");
        image = BitmapFactory.decodeByteArray(arr, 0, arr.length);
        BigImage = (ImageView)findViewById(R.id.imageView);
        BigImage.setImageBitmap(image);

        Toast.makeText(this, "잘 넘어왔다. ", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        String text = ((Button) v).getText().toString();
        Intent intent = new Intent();
        intent.putExtra("result", text);
        setResult(RESULT_OK, intent);
        finish();

    }
}

