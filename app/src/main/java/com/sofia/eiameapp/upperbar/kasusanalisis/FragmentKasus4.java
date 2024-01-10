package com.sofia.eiameapp.upperbar.kasusanalisis;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sofia.eiameapp.R;

public class FragmentKasus4 extends Fragment {


    public FragmentKasus4() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.upperbar_kasus_analisis_fragment_kasus4, container, false);
    }
}