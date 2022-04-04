package br.com.local.lafayetteprojeto;

public class Artigos {
    //atributos globais
    private String titulo;
    private String subTitulo;
    private String sinopse;
    private int imagemArt;

    public Artigos(String titulo, String subTitulo, String sinopse, int imagemArt) {
        this.titulo = titulo;
        this.subTitulo = subTitulo;
        this.sinopse = sinopse;
        this.imagemArt = imagemArt;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubTitulo() {
        return subTitulo;
    }

    public void setSubTitulo(String subTitulo) {
        this.subTitulo = subTitulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getImagemArt() {
        return imagemArt;
    }

    public void setImagemArt(int imagemArt) {
        this.imagemArt = imagemArt;
    }
}
