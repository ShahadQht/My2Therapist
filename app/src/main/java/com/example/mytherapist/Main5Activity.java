package com.example.mytherapist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        ViewPager vp3 = findViewById(R.id.vp3);
        FragmentAdapter3 adapter3 = new FragmentAdapter3(getSupportFragmentManager());
        vp3.setAdapter(adapter3);
    }
}
