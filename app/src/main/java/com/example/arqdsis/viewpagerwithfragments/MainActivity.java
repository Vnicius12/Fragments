package com.example.arqdsis.viewpagerwithfragments;

import android.app.ActionBar;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.viewPager);

        FragmentManager fm = getSupportFragmentManager();

        viewPager.setAdapter(new TabsAdapter(fm));

        final android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        actionBar.addTab(actionBar.newTab().setText("Frag 1").setTabListener((android.support.v7.app.ActionBar.TabListener) new MyTabsListener(viewPager, 0)));
        actionBar.addTab(actionBar.newTab().setText("Frag 2").setTabListener((android.support.v7.app.ActionBar.TabListener) new MyTabsListener(viewPager, 1)));
        actionBar.addTab(actionBar.newTab().setText("Frag 3").setTabListener((android.support.v7.app.ActionBar.TabListener) new MyTabsListener(viewPager, 2)));

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }
            @Override
            public void onPageSelected(int position) {
                Toast. makeText (MainActivity.this, "chamou", Toast. LENGTH_SHORT ).show();
                actionBar.setSelectedNavigationItem(position);         }
                @Override         public void onPageScrollStateChanged(int state) {

                }
        });
    }
}
