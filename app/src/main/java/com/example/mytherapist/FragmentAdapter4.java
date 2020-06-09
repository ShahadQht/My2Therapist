package com.example.mytherapist;

import android.widget.BaseAdapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter4 extends FragmentPagerAdapter {
    public FragmentAdapter4( FragmentManager fm4) { super(fm4);
    }


    @Override
    public Fragment getItem(int position) {

        if (position == 0)
            return new QQFragment();

        else if (position == 1)
            return new QQ2Fragment();

        else if (position==2)
            return new QQ3Fragment();

        else
            return new QQ4Fragment();

    }

    @Override
    public int getCount()
    { return 4; }
}
