package com.example.a10119014_andridwip;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple (@Link Fragment} subvlass.
 */

public class HomeFragment extends Fragment {

    private TextView textView;


    public HomeFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_2, container, false);
       // komponen
        textView = view.findViewById(R.id.text);
        textView.setText("andri");
        return view;
    }
}