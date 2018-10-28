package com.example.aa.mobile;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.btn);

        findViewById(R.id.btn).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Main2Activity.class);
        Bitmap sendBitmap = BitmapFactory.decodeResource(getResources(),R.drawable.sunny);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        sendBitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        intent.putExtra("sunny",byteArray);
        startActivity(intent);

    }

    public void onClick1ed(View view) {
        Toast.makeText(this, "버튼이 눌렸어요!", Toast.LENGTH_SHORT).show();
    }
}
