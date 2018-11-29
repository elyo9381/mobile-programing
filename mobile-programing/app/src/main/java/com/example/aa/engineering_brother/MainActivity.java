package com.example.aa.engineering_brother;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aa.engineering_brother.fragment.recommend.AgeFragment;
import com.example.aa.engineering_brother.fragment.base.Fragment_One;
import com.example.aa.engineering_brother.fragment.base.Fragment_Three;
import com.example.aa.engineering_brother.fragment.base.Fragment_Two;
import com.example.aa.engineering_brother.fragment.recommend.BatteryFragment;
import com.example.aa.engineering_brother.fragment.recommend.DevelFragment;
import com.example.aa.engineering_brother.fragment.recommend.DisplaySizeFragment;
import com.example.aa.engineering_brother.fragment.recommend.GameFragment;
import com.example.aa.engineering_brother.fragment.recommend.GraphicFragment;
import com.example.aa.engineering_brother.fragment.recommend.PriceFragment;
import com.example.aa.engineering_brother.fragment.recommend.StorageFragment;
import com.example.aa.engineering_brother.fragment.recommend.StorageSizeFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    private final int FRAGMENT1 = 1;
    private final int FRAGMENT2 = 2;
    private final int FRAGMENT3 = 3;

    private Button bt_tab1, bt_tab2,bt_tab3;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 위젯에 대한 참조
        bt_tab1 = (Button)findViewById(R.id.bt_tab1);
        bt_tab2 = (Button)findViewById(R.id.bt_tab2);
        bt_tab3 = (Button)findViewById(R.id.bt_tab3);

        // 탭 버튼에 대한 리스너 연결
        bt_tab1.setOnClickListener(this);
        bt_tab2.setOnClickListener(this);
        bt_tab3.setOnClickListener(this);

        // 임의로 액티비티 호출 시점에 어느 프레그먼트를 프레임레이아웃에 띄울 것인지를 정함
        callFragment(FRAGMENT1);


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
        }
        else if (index == 12) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, ageFragment)
                    .addToBackStack(null)
                    .commit();
        }
        else if (index == 13) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, ageFragment)
                    .addToBackStack(null)
                    .commit();
        }
        else if (index == 14) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,ageFragment)
                    .addToBackStack(null)
                    .commit();
        }
        else if (index == 21) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,storageFragment)
                    .addToBackStack(null)
                    .commit();
        }
        else if (index == 22) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,gameFragment)
                    .addToBackStack(null)
                    .commit();
        }
        else if (index == 23) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,graphicFragment)
                    .addToBackStack(null)
                    .commit();
        }
        else if (index == 24) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,develFragment)
                    .addToBackStack(null)
                    .commit();
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
        }
        else if (index == 51) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,batteryFragment)
                    .addToBackStack(null)
                    .commit();
        }
        else if (index == 61) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,displaySizeFragment)
                    .addToBackStack(null)
                    .commit();
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
//        }
//        else if (index == 114) {
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
