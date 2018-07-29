package com.example.daniel.codelandoop;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MenuAdapter extends BaseAdapter{
    private Context context;
    private String[] listItems;

    public MenuAdapter(Context context, String[] listItems) {
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
        convertView = LayoutInflater.from(context).inflate(R.layout.menu_item,null);
        TextView tvFases = (TextView) convertView.findViewById(R.id.tvFases);
        tvFases.setText(listItems[position]);
        return convertView;
    }
}
