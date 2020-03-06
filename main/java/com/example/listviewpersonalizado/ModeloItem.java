package com.example.listviewpersonalizado;

public class ModeloItem {
    int foto;
    String titulo;
    String contenido;

    public ModeloItem(int foto, String titulo, String contenido) {
        this.foto = foto;
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
