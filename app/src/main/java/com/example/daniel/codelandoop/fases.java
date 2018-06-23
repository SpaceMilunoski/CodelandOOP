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

    private static final String TAG = "fases";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fases);
        final ListView lvFases = (ListView) findViewById(R.id.lvTemas);
        String [] items = {};



        int i = getIntent().getIntExtra("fase",0);

        Log.d(TAG, "onCreate: valor de fase: " + i);
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
        ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        lvFases.setAdapter(adapter);
        lvFases.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(fases.this,temas.class);
                startActivity(i);
            }
        });
    }
}
