package com.example.mytherapist;

import android.widget.BaseAdapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter3 extends FragmentPagerAdapter {
    public FragmentAdapter3( FragmentManager fm3) { super(fm3);
    }


    @Override
    public Fragment getItem(int position) {

        if (position == 0)
            return new AAFragment();

        else if (position == 1)
            return new AA2Fragment();

        else if(position == 2)
            return new AA3Fragment();

        else
            return new AA4Fragment();
    }

    @Override
    public int getCount()
    { return 4; }
}
