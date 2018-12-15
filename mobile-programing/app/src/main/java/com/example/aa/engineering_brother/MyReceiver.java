package com.example.aa.engineering_brother;

        import android.content.BroadcastReceiver;
        import android.content.Context;
        import android.content.Intent;
        import android.util.Log;
        import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    private static final String TAG = "received data : ";

    public String price;
    public String job;
    public String storage;
    public String storage_size;
    public String battery;
    public String display;
    public String weight;
    public String brand;

    public static final String MY_ACTION = "com.example.aa.engineering_brother.action.ACTION_MY_BROADCAST";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onRecevied()호출됨.");
        if(Intent.ACTION_POWER_CONNECTED.equals(intent.getAction())){
            Toast.makeText(context, "전원이 연결됨", Toast.LENGTH_SHORT).show();
        } else if(MY_ACTION.equals(intent.getAction())){
            price = intent.getStringExtra("price");
            job = intent.getStringExtra("job");
            storage = intent.getStringExtra("storage");
            storage_size = intent.getStringExtra("storage_size");
            battery = intent.getStringExtra("battery");
            display = intent.getStringExtra("display");
            weight = intent.getStringExtra("weight");
            brand = intent.getStringExtra("brand");



            Log.d(TAG, price);
            sendToActivity(context, price, job, storage ,storage_size,battery,display ,weight ,brand);
        }
    }

    private void sendToActivity(Context context, String price, String job, String storage ,String storage_size, String battery, String display ,String weight ,String brand) {
        Intent intent = new Intent(context, Result_Activity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|
                        Intent.FLAG_ACTIVITY_SINGLE_TOP|
                        Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("price",price);
        intent.putExtra("job",job);
        intent.putExtra("storage",storage);
        intent.putExtra("storage_size",storage_size);
        intent.putExtra("battery",battery);
        intent.putExtra("display",display);
        intent.putExtra("weight",weight);
        intent.putExtra("brand",brand);
        context.startActivity(intent);
    }


}