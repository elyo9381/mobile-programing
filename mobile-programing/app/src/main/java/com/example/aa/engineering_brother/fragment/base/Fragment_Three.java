package com.example.aa.engineering_brother.fragment.base;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aa.engineering_brother.R;



public class Fragment_Three extends Fragment {

    public Fragment_Three() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment__three, container, false);
        return view;
    }

//    public static Fragment_Three newInstance() {
//        Bundle args = new Bundle();
//        Fragment_Three fragment_three = new Fragment_Three();
//        fragment_three.setArguments(args);
//        return fragment_three;
//    }

}
