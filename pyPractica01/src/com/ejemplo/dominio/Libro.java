/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.dominio;

/**
 *
 * @author augus
 */
public class Libro {
    //Atributos:
    private int ISNB;
    private String titulo;
    private String autor;
    private int paginas;
    
    //Contructores:
    public Libro(int ISNB, String titulo, String autor, int paginas) {
        this.ISNB = ISNB;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    //Metodos:

    public int getISNB() {
        return ISNB;
    }

    public void setISNB(int ISNB) {
        this.ISNB = ISNB;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    public String toString(){
        String info = "El libro con ISBN " + ISNB + " creado por el autor " + autor + " tiene: " + paginas + " páginas";
        return info;
               
    }
}
