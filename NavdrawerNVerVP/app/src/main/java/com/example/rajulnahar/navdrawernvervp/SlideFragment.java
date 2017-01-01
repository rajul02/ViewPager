package com.example.rajulnahar.navdrawernvervp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class SlideFragment extends Fragment {
    TextView tv_desc;
    public long t1 = 0;
    public long t2;

    public SlideFragment() {
        // Required empty public constructor
    }
    HorizontalViewPager viewPager;
    HorizontalViewPagerAdapter horizontalViewPagerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_slide,container,false);
        viewPager = (HorizontalViewPager) view.findViewById(R.id.horizontalviewpager);
        horizontalViewPagerAdapter = new HorizontalViewPagerAdapter(getChildFragmentManager());
        viewPager.setAdapter(horizontalViewPagerAdapter);
        viewPager.setCurrentItem(1);

       /* tv_desc = (TextView) view.findViewById(R.id.tv_desc);
        tv_desc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(t1!= 0){
                    t2 = System.currentTimeMillis();
                    if(Math.abs(t2 - t1)<300){
                        Toast.makeText(SlideFragment.this.getContext(),"Double click ",Toast.LENGTH_SHORT).show();
                        t1 = 0;
                    }
                    else {
                        t1 = 0;
                    }
                }
                else   {
                    t1 = System.currentTimeMillis();
                }

            }
        });*/
        return view;
    }


}
