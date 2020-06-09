package com.example.mytherapist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        ViewPager vp4 = findViewById(R.id.vp6);
        FragmentAdapter4 adapter4 = new FragmentAdapter4(getSupportFragmentManager());
        vp4.setAdapter(adapter4);
    }
}
