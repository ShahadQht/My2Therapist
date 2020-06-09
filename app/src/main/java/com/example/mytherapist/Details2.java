package com.example.mytherapist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Details2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details2);

        Bundle data = getIntent().getExtras();
        final TheList d = (TheList) data.getSerializable("Therapists");

        TextView name = findViewById(R.id.textView4);
        name.setText(d.getName());

        ImageView img = findViewById(R.id.imageView3);
        img.setImageResource(d.getImageRefrence());

        TextView college = findViewById(R.id.textView5);
        college.setText(d.getCollege());

        TextView infoo = findViewById(R.id.textView8);
        infoo.setText(d.getInfoo());

        Button e = findViewById(R.id.button8);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i4 = new Intent(Details2.this,Main7Activity.class);

               startActivity(i4);

            }
        });
    }
}
