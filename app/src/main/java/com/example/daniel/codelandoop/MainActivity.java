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
        String [] items = getResources().getStringArray(R.array.fases);
        final ImageView imvUno = (ImageView) findViewById(R.id.imvUno);
        final ImageView imvDos = (ImageView) findViewById(R.id.imvDos);
        final ImageView imvTres = (ImageView) findViewById(R.id.imvTres);
        final ImageView imvCuatro = (ImageView) findViewById(R.id.imvCuatro);
        imvUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarVentana(v,0);
            }
        });
        imvDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarVentana(v,1);
            }
        });
        imvTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarVentana(v,2);
            }
        });
        imvCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarVentana(v,3);
            }
        });

    }
    public void lanzarVentana(View view,int position){
        Intent i = new Intent(view.getContext(), fases.class);
        i.putExtra("fase",position);
        startActivity(i);
    }
}
