package com.example.daniel.codelandoop;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class temas extends AppCompatActivity {
    AlertDialog.Builder tema;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temas);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        final Button btnCs = (Button) findViewById(R.id.btCs);
        final Button btnJava = (Button) findViewById(R.id.btJava);
        final Button btnCmm = (Button) findViewById(R.id.btCmm);
        final TextView tvTemas = (TextView) findViewById(R.id.tvContenido);
        final TextView tvTituloo = (TextView) findViewById(R.id.tvTitulo);
        String [] items = {};
        String [] temas = {};
        String [] nomFases = getResources().getStringArray(R.array.nomfases);
        String [] eCgato = {};
        String [] eJava = {};
        String [] eCplus = {};
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        int fase = getIntent().getIntExtra("fase",0);
        int posicion = getIntent().getIntExtra("tema",0);
        toolbar.setTitle(String.valueOf(nomFases[fase]));
        if(getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tema = new AlertDialog.Builder(temas.this);
        if (fase==0){
            items=getResources().getStringArray(R.array.tf1);
            temas=getResources().getStringArray(R.array.fase1);
            eCgato=getResources().getStringArray(R.array.ef1C);
            eJava=getResources().getStringArray(R.array.ef1java);
            eCplus=getResources().getStringArray(R.array.ef1Cplus);
        }
        else if (fase==1){
            items=getResources().getStringArray(R.array.tf2);
            temas=getResources().getStringArray(R.array.fase2);
            eCgato=getResources().getStringArray(R.array.ef2C);
            eJava=getResources().getStringArray(R.array.ef2java);
            eCplus=getResources().getStringArray(R.array.ef2Cplus);
        }
        else if (fase==2){
            items=getResources().getStringArray(R.array.tf3);
            temas=getResources().getStringArray(R.array.fase3);
            eCgato=getResources().getStringArray(R.array.ef3C);
            eJava=getResources().getStringArray(R.array.ef3java);
            eCplus=getResources().getStringArray(R.array.ef3Cplus);
        }
        else if (fase==3){
            items=getResources().getStringArray(R.array.tf4);
            temas=getResources().getStringArray(R.array.fase4);
            eCgato=getResources().getStringArray(R.array.ef4C);
            eJava=getResources().getStringArray(R.array.ef4java);
            eCplus=getResources().getStringArray(R.array.ef4Cplus);
        }
            tvTituloo.setText(temas[posicion]);
            tvTemas.setText(items[posicion]);
        final String java=eJava[posicion];
        final String cs=eCgato[posicion];
        final String cmm=eCplus[posicion];
        if (cmm.length()==0){
            btnCmm.setVisibility(View.INVISIBLE);
            btnCs.setVisibility(View.INVISIBLE);
            btnJava.setVisibility(View.INVISIBLE);
        }
        btnCmm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarEjemplo(cmm);
            }
        });
        btnCs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarEjemplo(cs);
            }
        });
        btnJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarEjemplo(java);
            }
        });
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }
    public void mostrarEjemplo(String mensaje){
        tema.setMessage(mensaje);
        //tema.setView(mView);
        tema.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog dialog = tema.create();
        dialog.show();
    }
}
