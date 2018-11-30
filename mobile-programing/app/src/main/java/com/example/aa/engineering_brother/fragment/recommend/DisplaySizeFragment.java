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


public class DisplaySizeFragment extends Fragment {


    public DisplaySizeFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup view =(ViewGroup) inflater.inflate(R.layout.fragment_display_size, container, false);

        Button dis_bt1 = (Button) view.findViewById(R.id.dis_bt1);
        dis_bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.onFragmentChanged(71);

            }
        });
        Button dis_bt2 = (Button) view.findViewById(R.id.dis_bt2);
        dis_bt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.onFragmentChanged(71);

            }
        });
        Button dis_bt3 = (Button) view.findViewById(R.id.dis_bt3);
        dis_bt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.onFragmentChanged(71);

            }
        });


        return view;



    }


}
