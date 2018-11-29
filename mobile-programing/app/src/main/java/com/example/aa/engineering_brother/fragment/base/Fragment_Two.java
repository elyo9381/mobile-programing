package com.example.aa.engineering_brother.fragment.base;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.aa.engineering_brother.Loading_Activity;
import com.example.aa.engineering_brother.MainActivity;
import com.example.aa.engineering_brother.R;



public class Fragment_Two extends Fragment {

    public Fragment_Two() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup view = (ViewGroup)inflater.inflate(R.layout.fragment_fragment__two, container, false);

        Button mButton2 = (Button) view.findViewById(R.id.button2);
        mButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.onFragmentChanged(1);

            }
        });
        return view;
    }
//    public static Fragment_Two newInstance() {
//        Bundle args = new Bundle();
//        Fragment_Two fragment_two = new Fragment_Two();
//        fragment_two.setArguments(args);
//        return fragment_two;
//    }
}
