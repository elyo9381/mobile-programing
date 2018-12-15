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


public class WeightFragment extends Fragment {

    public WeightFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_weight, container, false);

        Button weight_bt1 = (Button) view.findViewById(R.id.weight_bt1);
        weight_bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.onFragmentChanged(81);

            }
        });
        Button weight_bt2 = (Button) view.findViewById(R.id.weight_bt2);
        weight_bt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.onFragmentChanged(82);

            }
        });
        Button weight_bt3 = (Button) view.findViewById(R.id.weight_bt3);
        weight_bt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.onFragmentChanged(83);

            }
        });
        Button weight_bt4 = (Button) view.findViewById(R.id.weight_bt4);
        weight_bt4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.onFragmentChanged(84);

            }
        });

        return view;
    }

}
