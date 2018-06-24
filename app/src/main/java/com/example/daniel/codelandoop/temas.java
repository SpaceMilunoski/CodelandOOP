package com.example.daniel.codelandoop;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class temas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temas);
        final Button btnCs = (Button) findViewById(R.id.btCs);
        final Button btnJava = (Button) findViewById(R.id.btJava);
        final Button btnCmm = (Button) findViewById(R.id.btCmm);
        final AlertDialog.Builder tema = new AlertDialog.Builder(temas.this);
        final View mView = getLayoutInflater().inflate(R.layout.ejemplos,null);
        btnCs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
        });
        btnJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
        });
        btnCmm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
        });
    }
}
