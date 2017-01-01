package com.example.rajulnahar.navdrawernvervp;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;

/**
 * Created by Rajul Nahar on 01-01-2017.
 */

public class HorizontalViewPager extends ViewPager {
    public HorizontalViewPager(Context context) {
        super(context);
    }

    public HorizontalViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean canScrollVertically(int direction) {

        return false;
    }

    @Override
    public boolean canScrollHorizontally(int direction) {
        return false;
    }
}
