package com.madhatters.androidbasic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by bullhead on 3/16/18.
 *
 */

public class ViewPagerActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        ViewPager viewPager=findViewById(R.id.demoViewPager);
        TabLayout tabLayout=findViewById(R.id.tabLayout);

        tabLayout.setupWithViewPager(viewPager);
        PagerAdapter viewPagerAdapter=new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);

    }
    private class PagerAdapter extends FragmentStatePagerAdapter{
        private String[] pageTitles={"One","Two","Three"};

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return PagerFragment.newInstance(pageTitles[position]);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return pageTitles[position];
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
