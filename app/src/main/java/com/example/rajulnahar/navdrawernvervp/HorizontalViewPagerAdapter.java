package com.example.rajulnahar.navdrawernvervp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.util.CircularArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajul Nahar on 01-01-2017.
 */

public class HorizontalViewPagerAdapter extends FragmentStatePagerAdapter {

    public CircularArray<Fragment> fragmentList;
    public HorizontalViewPagerAdapter(FragmentManager fm) {
        super(fm);
        Fragment x = new HeadnTail();
        fragmentList = new CircularArray<Fragment>();
        fragmentList.addFirst(new MainFragment());
        fragmentList.addFirst(x);
        fragmentList.addLast(new HeadnTail());

    }


    @Override
    public Fragment getItem(int position) {

        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
