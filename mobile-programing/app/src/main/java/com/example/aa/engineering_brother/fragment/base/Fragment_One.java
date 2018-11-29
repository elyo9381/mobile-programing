package com.example.aa.engineering_brother.fragment.base;

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

/**
 */
public class Fragment_One extends Fragment {


    public Fragment_One() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_fragment__one, container, false);

        Button price1_btn = (Button) view.findViewById(R.id.cpu_btn);
        price1_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.onFragmentChanged(111);

            }
        });

        Button price2_btn = (Button) view.findViewById(R.id.graphic_btn);
        price2_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.onFragmentChanged(121);

            }
        });

        Button price3_btn = (Button) view.findViewById(R.id.ram_btn);
        price3_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.onFragmentChanged(131);

            }
        });

        Button price4_btn = (Button) view.findViewById(R.id.hdd_btn);
        price4_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.onFragmentChanged(141);

            }
        });

        return view;
    }

//    public static Fragment_One newInstance() {
//        Bundle args = new Bundle();
//        Fragment_One fragment_one = new Fragment_One();
//        fragment_one.setArguments(args);
//        return fragment_one;
//    }


}
