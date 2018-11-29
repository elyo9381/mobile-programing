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


public class GraphicFragment extends Fragment {

    public GraphicFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_graphic, container, false);


        Button graphic_btn1  = (Button) view.findViewById(R.id.graphic_btn1);
        graphic_btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.onFragmentChanged(31);

            }
        });
        Button graphic_btn2  = (Button) view.findViewById(R.id.graphic_btn2);
        graphic_btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.onFragmentChanged(31);

            }
        });
        Button graphic_btn3  = (Button) view.findViewById(R.id.graphic_btn3);
        graphic_btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.onFragmentChanged(31);

            }
        });
        return view;
    }

}
