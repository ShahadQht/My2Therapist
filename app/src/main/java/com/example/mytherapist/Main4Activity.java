package com.example.mytherapist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ViewPager vp2 = findViewById(R.id.vp2);
        FragmentAdapter2 adapter2 = new FragmentAdapter2(getSupportFragmentManager());
        vp2.setAdapter(adapter2);
    }
}
