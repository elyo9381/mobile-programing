package com.example.aa.engineering_brother;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    public String data1;

    public static final String MY_ACTION = "com.example.aa.engineering_brother.action.ACTION_MY_BROADCAST";

    @Override
    public void onReceive(Context context, Intent intent) {
        if(Intent.ACTION_POWER_CONNECTED.equals(intent.getAction())){
            Toast.makeText(context, "전원이 연결됨", Toast.LENGTH_SHORT).show();
        } else if(MY_ACTION.equals(intent.getAction())){
            data1 = intent.getStringExtra("value");
            Toast.makeText(context, data1, Toast.LENGTH_SHORT).show();
        }
    }
}