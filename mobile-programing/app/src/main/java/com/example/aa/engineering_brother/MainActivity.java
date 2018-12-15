package com.example.aa.engineering_brother;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.aa.engineering_brother.fragment.recommend.AgeFragment;
import com.example.aa.engineering_brother.fragment.base.Fragment_One;
import com.example.aa.engineering_brother.fragment.base.Fragment_Three;
import com.example.aa.engineering_brother.fragment.base.Fragment_Two;
import com.example.aa.engineering_brother.fragment.recommend.BatteryFragment;
import com.example.aa.engineering_brother.fragment.recommend.BrandFragment;
import com.example.aa.engineering_brother.fragment.recommend.DevelFragment;
import com.example.aa.engineering_brother.fragment.recommend.DisplaySizeFragment;
import com.example.aa.engineering_brother.fragment.recommend.GameFragment;
import com.example.aa.engineering_brother.fragment.recommend.GraphicFragment;
import com.example.aa.engineering_brother.fragment.recommend.PriceFragment;
import com.example.aa.engineering_brother.fragment.recommend.ResultFragment;
import com.example.aa.engineering_brother.fragment.recommend.StorageFragment;
import com.example.aa.engineering_brother.fragment.recommend.StorageSizeFragment;
import com.example.aa.engineering_brother.fragment.recommend.WeightFragment;
import com.example.aa.engineering_brother.Button_Activity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "확인 : ";

    private BroadcastReceiver mReceiver;

    private final int FRAGMENT1 = 1;
    private final int FRAGMENT2 = 2;
    private final int FRAGMENT3 = 3;

    private Button bt_tab1, bt_tab2,bt_tab3;
    private Button btn1;




    public Fragment_One fragment_one = new Fragment_One();
    public Fragment_Two fragment_two = new Fragment_Two();
    public Fragment_Three fragment_three = new Fragment_Three();
    public AgeFragment ageFragment = new AgeFragment();
    public PriceFragment priceFragment = new PriceFragment();
    public GameFragment gameFragment = new GameFragment();
    public GraphicFragment graphicFragment = new GraphicFragment();
    public DevelFragment develFragment = new DevelFragment();
    public StorageFragment storageFragment = new StorageFragment();
    public StorageSizeFragment storageSizeFragment = new StorageSizeFragment();
    public BatteryFragment batteryFragment = new BatteryFragment();
    public DisplaySizeFragment displaySizeFragment = new DisplaySizeFragment();
    public WeightFragment weightFragment = new WeightFragment();
    public BrandFragment brandFragment = new BrandFragment();
    public ResultFragment resultFragment = new ResultFragment();


    // 초기 프래그먼트 뿌려주기

    public String intent;
    public String announce;
    public String recommend ;
    public String review;

    // 클릭했을시 데이터가 들어갈 변수
    public String price_100;
    public String price_200;
    public String price_300;
    public String price_400;

    public String doc;
    public String game;
    public String develope;
    public String graphic;
    public String HDD;
    public String SSD;
    public String S_128G;
    public String S_256G;
    public String S_512G;
    public String S_1T;
    public String hour_4;
    public String hour_6;
    public String hour_8;
    public String hour_10;

    public String dis_13;
    public String dis_15;
    public String dis_17;

    public String wei_1KG;
    public String wei_1dot5KG;
    public String wei_2KG;
    public String wei_2KG_over;

    public String good;
    public String dome;
    public String overseas;

    // 브로드캐스트를 통해서 넘길 데이터 변수들
    private String price;
    private String job;
    private String storage;
    private String storage_size;
    private String battery;
    private String display;
    private String weight;
    private String brand;





    ArrayList arrayList = new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "main oncreated");

        mReceiver = new MyReceiver();

        // 위젯에 대한 참조
        bt_tab1 = (Button)findViewById(R.id.bt_tab1);
        bt_tab2 = (Button)findViewById(R.id.bt_tab2);
        bt_tab3 = (Button)findViewById(R.id.bt_tab3);

        // 탭 버튼에 대한 리스너 연결
        bt_tab1.setOnClickListener(this);
        bt_tab2.setOnClickListener(this);
        bt_tab3.setOnClickListener(this);

        Log.d(TAG, "1");
//
//        announce = getIntent().getStringExtra("announce");
//
//
//         Intent intent_recom = getIntent();
//        recommend = intent_recom.getStringExtra("recommend");
//        //recommend = getIntent().getStringExtra("recommend");
//        Intent intent_review = getIntent();
//        review = intent_review.getStringExtra("review");

//
//        intent = getIntent().getStringExtra("1");
//        if(intent == "R.id.announcement_btn"){
//            getSupportFragmentManager()
//                    .beginTransaction()
//                    .add(R.id.fragment_container,fragment_one)
//                    .commit();
//        }
//        intent = getIntent().getStringExtra("2");
//        if( intent == "R.id.recommend_btn"){
//            getSupportFragmentManager()
//                    .beginTransaction()
//                    .add(R.id.fragment_container, fragment_two)
//                    .commit();
//        }
//        intent = getIntent().getStringExtra("3");
//        if( intent == "R.id.review_btn"){
//            getSupportFragmentManager()
//                    .beginTransaction()
//                    .add(R.id.fragment_container, fragment_three)
//                    .commit();
//
//
//        }



        callFragment(FRAGMENT2);

        Log.d(TAG, "main getintent");
//        Log.d(TAG, announce);


        // 임의로 액티비티 호출 시점에 어느 프레그먼트를 프레임레이아웃에 띄울 것인지를 정함
//        if(announce =="R.id.recommend_btn"){
//            getSupportFragmentManager()
//                    .beginTransaction()
//                    .add(R.id.fragment_container,fragment_one)
//                    .commit();
//        }
//        else if(recommend=="R.id.recommend_btn"){
//            getSupportFragmentManager()
//                    .beginTransaction()
//                    .add(R.id.fragment_container, fragment_two)
//                    .commit();
//        }
//        else if(review=="R.id.recommend_btn"){
//            getSupportFragmentManager()
//                    .beginTransaction()
//                    .add(R.id.fragment_container, fragment_three)
//                    .commit();
//        }
        // 임의로 액티비티 호출 시점에 어느 프레그먼트를 프레임레이아웃에 띄울 것인지를 정함



    }

//    @Override
//    public void sendBroadcast(Intent intent) {
//        Intent intent1 = new Intent(MyReceiver.MY_ACTION);
//        sendBroadcast(intent1);
//    }

    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_POWER_CONNECTED);
        filter.addAction(MyReceiver.MY_ACTION);
        registerReceiver(mReceiver,filter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(mReceiver);
    }

    private void callFragment(int frament_no){

        // 프래그먼트 사용을 위해
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        switch (frament_no){
            case 1:
                // '프래그먼트1' 호출
                transaction.replace(R.id.fragment_container, fragment_one);
                transaction.commit();
                break;

            case 2:
                // '프래그먼트2' 호출

                transaction.replace(R.id.fragment_container, fragment_two);
                transaction.commit();
                break;
            case 3:
                // '프래그먼트2' 호출

                transaction.replace(R.id.fragment_container, fragment_three);
                transaction.commit();
                break;
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_tab1 :
                // '버튼1' 클릭 시 '프래그먼트1' 호출
                callFragment(FRAGMENT1);
                break;

            case R.id.bt_tab2 :
                // '버튼2' 클릭 시 '프래그먼트2' 호출
                callFragment(FRAGMENT2);
                break;

            case R.id.bt_tab3 :
                // '버튼2' 클릭 시 '프래그먼트2' 호출
                callFragment(FRAGMENT3);
                break;
        }
    }

    public void onFragmentChanged(int index) {

        if (index == 0) {
            //fragment manager 를 이용하여 현재의 fragment를 교체
            //begin transaction를 이용하여 롤백할 수 있도록한다
            //commit를 호출하여 실행
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment_two)
                    .addToBackStack(null)
                    .commit();
        } else if (index == 1) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, priceFragment)
                    .addToBackStack(null)
                    .commit();


        }
        else if (index == 11) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, ageFragment)
                    .addToBackStack(null)
                    .commit();
//            Intent intent1 = new Intent(MyReceiver.MY_ACTION);
//            intent1.putExtra("value","100미만");
//            sendBroadcast(intent1);
            price_100 = "100under";
            arrayList.add(0,price_100);


        }
        else if (index == 12) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, ageFragment)
                    .addToBackStack(null)
                    .commit();

            price_200 = "200under";
            arrayList.add(0,price_200);
        }
        else if (index == 13) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, ageFragment)
                    .addToBackStack(null)
                    .commit();

            price_300 = "300under";
            arrayList.add(0,price_300);
        }
        else if (index == 14) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,ageFragment)
                    .addToBackStack(null)
                    .commit();
            price_400 = "400under";
            arrayList.add(0,price_400);
        }
        else if (index == 21) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,storageFragment)
                    .addToBackStack(null)
                    .commit();

             doc = "doc";
            arrayList.add(1,doc);


        }
        else if (index == 22) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,gameFragment)
                    .addToBackStack(null)
                    .commit();

            game = "game";
            arrayList.add(1,game);
        }
        else if (index == 23) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,graphicFragment)
                    .addToBackStack(null)
                    .commit();
            develope = "develope";
            arrayList.add(1,develope);
        }
        else if (index == 24) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,develFragment)
                    .addToBackStack(null)
                    .commit();

            graphic= "graphic";
            arrayList.add(1,graphic);
        }

        else if (index == 31) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,storageFragment)
                    .addToBackStack(null)
                    .commit();
        }
        else if (index == 41) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,storageSizeFragment)
                    .addToBackStack(null)
                    .commit();
            HDD="HDD";
            arrayList.add(2,HDD);

        }
        else if (index == 42) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,storageSizeFragment)
                    .addToBackStack(null)
                    .commit();
            SSD="SSD";
            arrayList.add(2,SSD);

        }
        else if (index == 51) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,batteryFragment)
                    .addToBackStack(null)
                    .commit();

            S_128G = "128G";
            arrayList.add(3,S_128G);
        }
        else if (index == 52) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,batteryFragment)
                    .addToBackStack(null)
                    .commit();
            S_256G = "256G";
            arrayList.add(3,S_256G);
        }
        else if (index == 53) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,batteryFragment)
                    .addToBackStack(null)
                    .commit();
            S_512G = "512G";
            arrayList.add(3,S_512G);
        }
        else if (index == 54) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,batteryFragment)
                    .addToBackStack(null)
                    .commit();
            S_1T = "1T";
            arrayList.add(3,S_1T);
        }
        else if (index == 61) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,displaySizeFragment)
                    .addToBackStack(null)
                    .commit();
            hour_4 = "4";
            arrayList.add(4,hour_4);
        }
        else if (index == 62) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,displaySizeFragment)
                    .addToBackStack(null)
                    .commit();
            hour_6 = "6";
            arrayList.add(4,hour_6);
        }
        else if (index == 63) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,displaySizeFragment)
                    .addToBackStack(null)
                    .commit();
            hour_8 = "8";
            arrayList.add(4,hour_8);
        }
        else if (index == 64) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,displaySizeFragment)
                    .addToBackStack(null)
                    .commit();
            hour_10 = "10";
            arrayList.add(4,hour_10);
        }
        else if (index == 71) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,weightFragment)
                    .addToBackStack(null)
                    .commit();
            dis_13 = "13";
            arrayList.add(5,dis_13);
        }
        else if (index == 72) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,weightFragment)
                    .addToBackStack(null)
                    .commit();
            dis_15 = "15";
            arrayList.add(5,dis_15);
        }
        else if (index == 73) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,weightFragment)
                    .addToBackStack(null)
                    .commit();
            dis_17 = "17";
            arrayList.add(5,dis_17);
        }
        else if (index == 81) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,brandFragment)
                    .addToBackStack(null)
                    .commit();
            wei_1KG = "1";
            arrayList.add(6,wei_1KG);

        }
        else if (index == 82) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,brandFragment)
                    .addToBackStack(null)
                    .commit();
            wei_1dot5KG = "1.5";
            arrayList.add(6,wei_1dot5KG);
        }
        else if (index == 83) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,brandFragment)
                    .addToBackStack(null)
                    .commit();
            wei_2KG = "2";
            arrayList.add(6,wei_2KG);
        }
        else if (index == 84) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,brandFragment)
                    .addToBackStack(null)
                    .commit();
            wei_2KG_over = "2ov";
            arrayList.add(6,wei_2KG_over);
        }
        else if (index == 91) {

            Log.d(TAG, "결과 액티비티 떠야함");

            good = "good";
            arrayList.add(7,good);

            price = (String) arrayList.get(0);
            job = (String) arrayList.get(1);
            storage = (String) arrayList.get(2);
            storage_size =(String) arrayList.get(3);
            battery = (String) arrayList.get(4);
            display = (String) arrayList.get(5);
            weight = (String) arrayList.get(6);
            brand = (String) arrayList.get(7);

            Intent intent1 = new Intent(MyReceiver.MY_ACTION);
            intent1.putExtra("price",price);
            intent1.putExtra("job",job);
            intent1.putExtra("storage",storage);
            intent1.putExtra("storage_size",storage_size);
            intent1.putExtra("battery",battery);
            intent1.putExtra("display",display);
            intent1.putExtra("weight",weight);
            intent1.putExtra("brand",brand);

            sendBroadcast(intent1);


        }
        else if (index == 92) {

            dome = "dome";
            arrayList.add(7,dome);

            price = (String) arrayList.get(0);
            job = (String) arrayList.get(1);
            storage = (String) arrayList.get(2);
            storage_size =(String) arrayList.get(3);
            battery = (String) arrayList.get(4);
            display = (String) arrayList.get(5);
            weight = (String) arrayList.get(6);
            brand = (String) arrayList.get(7);

            Intent intent1 = new Intent(MyReceiver.MY_ACTION);
            intent1.putExtra("price",price);
            intent1.putExtra("job",job);
            intent1.putExtra("storage",storage);
            intent1.putExtra("storage_size",storage_size);
            intent1.putExtra("battery",battery);
            intent1.putExtra("display",display);
            intent1.putExtra("weight",weight);
            intent1.putExtra("brand",brand);
            sendBroadcast(intent1);

        }
        else if (index == 94) {

            overseas = "overseas";
            arrayList.add(7,overseas);

            price = (String) arrayList.get(0);
            job = (String) arrayList.get(1);
            storage = (String) arrayList.get(2);
            storage_size =(String) arrayList.get(3);
            battery = (String) arrayList.get(4);
            display = (String) arrayList.get(5);
            weight = (String) arrayList.get(6);
            brand = (String) arrayList.get(7);

            Intent intent1 = new Intent(MyReceiver.MY_ACTION);
            intent1.putExtra("price",price);
            intent1.putExtra("job",job);
            intent1.putExtra("storage",storage);
            intent1.putExtra("storage_size",storage_size);
            intent1.putExtra("battery",battery);
            intent1.putExtra("display",display);
            intent1.putExtra("weight",weight);
            intent1.putExtra("brand",brand);
            sendBroadcast(intent1);

        }
//        else if (index == 111) {
//            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, )
//                    .addToBackStack(null)
//                    .commit();
//        }
//        else if (index == 112) {
//            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, )
//                    .addToBackStack(null)
//                    .commit();
//        }
//        else if (index == 113) {
//            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, )
//                    .addToBackStack(null)
//                    .commit();
//        else if (index == 114) {
//        }
//            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, )
//                    .addToBackStack(null)
//                    .commit();
//        }
    }


//    public void onFragmentChanged(int index){
//        if(index==0){
//            Fragment_Two.newInstance();
//
//        }
//        else if(index ==1){
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.parentView,Fragment_One.newInstance())
//                    .addToBackStack(null)
//                    .commit();
//        }
//    }

}
