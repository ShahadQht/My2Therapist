package com.example.mytherapist;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter2 extends FragmentPagerAdapter {
    public FragmentAdapter2( FragmentManager fm2) { super(fm2);
    }


    @Override
    public Fragment getItem(int position) {

        if (position == 0)
            return new QFragment();

        else if (position == 1)
            return new Q2Fragment();

       else  if (position == 2)
            return new Q3Fragment();

        else
            return new Q4Fragment();

    }

    @Override
    public int getCount()
    { return 4; }
}
