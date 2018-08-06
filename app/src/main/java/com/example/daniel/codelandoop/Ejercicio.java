package com.example.daniel.codelandoop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Ejercicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio);
        String [] Ejercicios;
        Ejercicios=getResources().getStringArray(R.array.ejercicios);
        final TextView tvEjercicio = (TextView) findViewById(R.id.tvEjercicio);
        int fase = getIntent().getExtras().getInt("fase");
        tvEjercicio.setText(Ejercicios[fase]);
    }
}
