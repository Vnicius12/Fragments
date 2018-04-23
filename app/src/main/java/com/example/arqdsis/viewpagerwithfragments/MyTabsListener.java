package com.example.arqdsis.viewpagerwithfragments;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.support.v4.view.ViewPager;

/**
 * Created by arqdsis on 23/04/2018.
 */

public class MyTabsListener implements ActionBar.TabListener {
    private ViewPager viewPager;
    private int index;

    public MyTabsListener(ViewPager viewPager, int index) {
        this.viewPager = viewPager;
        this.index = index;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        viewPager.setCurrentItem(index);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }
}
