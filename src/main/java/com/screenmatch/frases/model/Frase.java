package com.screenmatch.frases.model;

public class Frase {
    private String titulo;
    private String cita;
    private String autor;
    private String poster;

    public Frase(String titulo, String cita, String autor, String poster) {
        this.titulo = titulo;
        this.cita = cita;
        this.autor = autor;
        this.poster = poster;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCita() {
        return cita;
    }

    public void setCita(String cita) {
        this.cita = cita;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
