package com.example.rajulnahar.navdrawernvervp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Rajul Nahar on 01-01-2017.
 */

public class MainFragment extends android.support.v4.app.Fragment {
    public MainFragment()   {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.card,container,false);
        return view;
    }
}
