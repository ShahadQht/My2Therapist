package com.example.mytherapist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ViewPager vp = findViewById(R.id.vp);
        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager());
        vp.setAdapter(adapter);
    }
}
