package com.example.daniel.codelandoop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] items = getResources().getStringArray(R.array.nomfases);
        ListView lvMenu =(ListView) findViewById(R.id.menu);
        MenuAdapter adapter = new MenuAdapter(this,items);
        lvMenu.setAdapter(adapter);
        lvMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                lanzarVentana(view,position);
            }
        });
    }
    public void lanzarVentana(View view,int position){
        Intent i = new Intent(view.getContext(), fases.class);
        i.putExtra("fase",position);
        startActivity(i);
    }
}
