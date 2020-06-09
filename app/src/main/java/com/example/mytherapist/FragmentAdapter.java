package com.example.mytherapist;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    public FragmentAdapter( FragmentManager fm) { super(fm);
    }


    @Override
    public Fragment getItem(int position) {

        if (position == 0)
            return new AFragment();

        else if (position == 1)
            return new A2Fragment();

        else if (position == 2)
            return new A3Fragment();

        else
            return new A4Fragment();
    }

    @Override
    public int getCount()
    { return 4; }
}
