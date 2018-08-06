package com.example.daniel.codelandoop;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class fases extends AppCompatActivity {

    //private static final String TAG = "fases";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fases);
        final ListView lvFases = (ListView) findViewById(R.id.lvTemas);
        String [] items = {};
        final String [] cuestionario = getResources().getStringArray(R.array.Cuestionarios);

        int i = getIntent().getIntExtra("fase",0);

        //Log.d(TAG, "onCreate: valor de fase: " + i);
        if (i==0){
            items=getResources().getStringArray(R.array.fase1);
        }
        else if (i==1){
            items=getResources().getStringArray(R.array.fase2);
        }
        else if (i==2){
            items=getResources().getStringArray(R.array.fase3);
        }
        else if (i==3){
            items=getResources().getStringArray(R.array.fase4);
        }
        final int j = i;
        final int ni = items.length;
        Adapter adapter = new Adapter(this, items);
        lvFases.setAdapter(adapter);
        lvFases.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==ni-2){
                    Intent in = new Intent(fases.this,Cuestionario.class);
                    in.putExtra("url",cuestionario[j]);
                    startActivity(in);
                }else if (position==ni-1){
                    Intent eje = new Intent(fases.this,Ejercicio.class);
                    //eje.putExtra("tema",position);
                    eje.putExtra("fase",j);
                    startActivity(eje);
                }else {
                    Intent i = new Intent(fases.this,temas.class);
                    i.putExtra("tema",position);
                    i.putExtra("fase",j);
                    startActivity(i);
                }
            }
        });
        if(getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }
}
