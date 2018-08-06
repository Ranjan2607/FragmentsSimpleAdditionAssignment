package com.example.rajivranjan.fragmentssimpleadditionassignment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SimpleAddition  extends Fragment {
    View view;
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.simpleaddition, container, false);

        if (getArguments() != null) {
            textView = (TextView) view.findViewById(R.id.text11);

            String strtext = getArguments().getString("edttext");
            textView.setText(strtext);
        }

        return view;
    }
}
