package com.example.mytherapist;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class QQ4Fragment extends Fragment {

    public QQ4Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View v = inflater.inflate(R.layout.fragment_q_q4, container, false);
        ImageView iv = v.findViewById(R.id.imageView40);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IE = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/_ICREZm9CtE"));
                startActivity(IE);
            }
        });
         return v;
    }
}
