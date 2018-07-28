package com.example.daniel.codelandoop;

public class MenuElemento {
    String texto;
    String fondo;

    public MenuElemento(String texto, String fondo) {
        this.texto = texto;
        this.fondo = fondo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getFondo() {
        return fondo;
    }

    public void setFondo(String fondo) {
        this.fondo = fondo;
    }
}
