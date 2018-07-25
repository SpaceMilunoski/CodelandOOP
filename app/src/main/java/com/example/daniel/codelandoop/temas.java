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
        String [] items = {};
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitle("Titulo de la fase");
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
        items=getResources().getStringArray(R.array.tf1);
        tvTemas.setText(items[0]);


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
