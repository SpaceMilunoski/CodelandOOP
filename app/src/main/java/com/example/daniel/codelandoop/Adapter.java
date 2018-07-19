package com.example.daniel.codelandoop;

import android.content.Context;
import android.content.Entity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter{
    private Context context;
    private String[] listItems;
    public Adapter(Context context, String [] listItems) {
        this.context = context;
        this.listItems = listItems;
    }


    public int getCount(){
        return listItems.length;
    }
    public Object getItem(int position){
        return listItems[position];
    }
    public long getItemId(int position){
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.item,null);
        TextView tvTemas = (TextView) convertView.findViewById(R.id.tvTemas);
        tvTemas.setText(listItems[position]);
        return convertView;
    }
}
