package com.example.aa.engineering_brother.fragment.recommend;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.aa.engineering_brother.MainActivity;
import com.example.aa.engineering_brother.R;


public class BatteryFragment extends Fragment {

    public BatteryFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_battery, container, false);

        Button battery_btn1 = (Button) view.findViewById(R.id.battery_btn1);
        battery_btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.onFragmentChanged(61);

            }
        });
        Button battery_btn2 = (Button) view.findViewById(R.id.battery_btn2);
        battery_btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.onFragmentChanged(61);

            }
        });
        Button battery_btn3 = (Button) view.findViewById(R.id.battery_btn3);
        battery_btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.onFragmentChanged(61);

            }
        });
        Button battery_btn4 = (Button) view.findViewById(R.id.battery_btn4);
        battery_btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.onFragmentChanged(61);

            }
        });
        return view;
    }


}
