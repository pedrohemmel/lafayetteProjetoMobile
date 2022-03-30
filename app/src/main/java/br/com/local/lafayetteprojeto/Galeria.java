package br.com.local.lafayetteprojeto;

public class Galeria {

    private int foto;
    private String titulo;
    private String secTexto;
    private String supportTexto;

    public Galeria(int foto, String titulo, String secTexto, String supportTexto) {
        this.foto = foto;
        this.titulo = titulo;
        this.secTexto = secTexto;
        this.supportTexto = supportTexto;
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

    public String getSupportTexto() {
        return supportTexto;
    }

    public void setSupportTexto(String supportTexto) {
        this.supportTexto = supportTexto;
    }
}
