package com.example.joker.mili;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.*;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Joker on 5/10/2020.
 */

public class First_VP extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.frag1,container,false);
        return view;
    }

    public static First_VP newInstance() {

        Bundle args = new Bundle();

        First_VP fragment = new First_VP();
        fragment.setArguments(args);
        return fragment;
    }
}
