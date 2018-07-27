package com.example.daniel.codelandoop;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
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
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        int fase = getIntent().getIntExtra("fase",0);
        int posicion = getIntent().getIntExtra("tema",0);
        toolbar.setTitle("Fase "+String.valueOf(fase +1));
        if(getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tema = new AlertDialog.Builder(temas.this);
        btnCmm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarEjemplo();
            }
        });
        btnCs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarEjemplo();
            }
        });
        btnJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarEjemplo();
            }
        });
        if (fase==0){
            items=getResources().getStringArray(R.array.tf1);
            temas=getResources().getStringArray(R.array.fase1);
            tvTituloo.setText(temas[posicion]);
        }
        else if (fase==1){
            items=getResources().getStringArray(R.array.tf2);
            temas=getResources().getStringArray(R.array.fase2);
            tvTituloo.setText(temas[posicion]);
        }
        else if (fase==2){
            items=getResources().getStringArray(R.array.tf3);
            temas=getResources().getStringArray(R.array.fase3);
            tvTituloo.setText(temas[posicion]);
        }
        else if (fase==3){
            items=getResources().getStringArray(R.array.tf4);
            temas=getResources().getStringArray(R.array.fase4);
            tvTituloo.setText(temas[posicion]);
        }
        tvTemas.setText(items[posicion]);


    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }
    public void mostrarEjemplo(){
        tema.setMessage("Class ejemplo{\n" +
                "   contenido;\n" +
                "}");
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
