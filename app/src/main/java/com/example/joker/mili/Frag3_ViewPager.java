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

public class Frag3_ViewPager extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.frag_viewpager3,container,false);
        return view;
    }

    public static Frag3_ViewPager newInstance() {

        Bundle args = new Bundle();

        Frag3_ViewPager fragment = new Frag3_ViewPager();
        fragment.setArguments(args);
        return fragment;
    }
}
