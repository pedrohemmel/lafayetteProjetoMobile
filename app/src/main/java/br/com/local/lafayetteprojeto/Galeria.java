package br.com.local.lafayetteprojeto;

public class Galeria {

    private int foto;
    private String titulo;
    private String secTexto;
    private String sinopseGaleria;

    public Galeria(int foto, String titulo, String secTexto, String sinopseGaleria) {
        this.foto = foto;
        this.titulo = titulo;
        this.secTexto = secTexto;
        this.sinopseGaleria = sinopseGaleria;
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

    public String getSecTexto() {
        return secTexto;
    }

    public void setSecTexto(String secTexto) {
        this.secTexto = secTexto;
    }

    public String getSinopseGaleria() {
        return sinopseGaleria;
    }

    public void setSinopseGaleria(String sinopseGaleria) {
        this.sinopseGaleria = sinopseGaleria;
    }
}
