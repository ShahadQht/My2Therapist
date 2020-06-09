package com.example.mytherapist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class info extends AppCompatActivity {
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        radioGroup = findViewById(R.id.radioGroup);


        Button b = findViewById(R.id.button4);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                switch (radioGroup.getCheckedRadioButtonId())
                {
                    case R.id.radioButton3:

                        Intent i = new Intent(info.this,Main2Activity.class);
                        startActivity(i);
                        break;

                    case R.id.radioButton4:

                    Intent i2 = new Intent(info.this,Main22Activity.class);
                        startActivity(i2);
                        break;
                }

            }
        });


    }

}
