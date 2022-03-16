package br.com.local.lafayetteprojeto;

public class Artigos {
    //atributos globais
    private String titulo;
    private String subTitulo;
    private String info;


    public Artigos(String titulo, String subTitulo, String info) {
        this.titulo = titulo;
        this.subTitulo = subTitulo;
        this.info = info;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
