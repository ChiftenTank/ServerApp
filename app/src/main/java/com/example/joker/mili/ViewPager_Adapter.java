package com.example.joker.mili;

import android.support.v4.app.*;
import android.support.v4.app.Fragment;

/**
 * Created by Joker on 5/10/2020.
 */

public class ViewPager_Adapter extends FragmentPagerAdapter {
    public ViewPager_Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return Frag1_ViewPager.newInstance();
            case 1:
                return Frag2_ViewPager.newInstance();
            case 2:
                return Frag3_ViewPager.newInstance();

        }
        return  getItem(position);
    }


    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Newest";
            case 1:
                return "Favorites";
            case 2:
                return "Most Visited";
            default:
                return "";
        }
    }
}
