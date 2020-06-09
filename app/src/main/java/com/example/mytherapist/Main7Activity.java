package com.example.mytherapist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        Bundle data = getIntent().getExtras();
        final TheList d = (TheList) data.getSerializable("Therapists");

        Button e = findViewById(R.id.button9);

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i4 = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + d.getEmail()));
                startActivity(i4);

            }
        });
    }
}
