package com.example.fragmentapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class frag_3 extends Fragment {
Button btn3;

    public frag_3() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view=inflater.inflate(R.layout.fragment_frag_3, container, false);
       setupVi(view);
       return view;
    }
    public  void setupVi(View v){
        btn3=v.findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "fragment 3 is here", Toast.LENGTH_SHORT).show();
            }
        });
    }
}