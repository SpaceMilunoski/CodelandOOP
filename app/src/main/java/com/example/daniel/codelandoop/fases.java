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
                    String url="";
                    if (j==0){
                        url="https://docs.google.com/forms/d/e/1FAIpQLSc2n-JIDT1dJQNpECzLIXrYVF_vmO5qywrWeUR8E9PE5gKq4Q/viewform?usp=sf_link";
                    }else if (j==1){
                        url="https://docs.google.com/forms/d/e/1FAIpQLSd40BE2wvjTA_Gw1DtKvcENj1YUIWjhd-bnhdreQEhFr3_-wA/viewform?usp=sf_link";
                    }else if (j==2){
                        url="https://docs.google.com/forms/d/e/1FAIpQLSc9Cf5l0SO8BGcdms3wQg5jegHNS6888dvNGAqEHTc-yn4tSQ/viewform?usp=sf_link";
                    }else if (j==3){
                        url="https://docs.google.com/forms/d/e/1FAIpQLSdmF2-iBL89Y5sNmWdk4leJ7-pKq86UBzb9EY0k7EKMiiTlhQ/viewform?usp=sf_link";
                    }
                    in.putExtra("url",url);
                    startActivity(in);
                }else if (position==ni-1){

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
