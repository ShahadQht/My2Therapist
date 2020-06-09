package com.example.mytherapist;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    ArrayList<TheList> list ;
    Context context;

    public ListAdapter(ArrayList<TheList> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();

    }

    @Override
    public Object getItem(int position) {
        return list.get(position);

    }


    @Override
    public long getItemId(int position) {
        return 0;

    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {



        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.listcell,parent,false);

        TextView name = rowView.findViewById(R.id.textView2);
        TextView college = rowView.findViewById(R.id.textView3);
        ImageView img = rowView.findViewById(R.id.imageView2);



        name.setText(list.get(position).getName());
        college.setText(list.get(position).getCollege());
        img.setImageResource(list.get(position).getImageRefrence());

        return rowView;

    }
}