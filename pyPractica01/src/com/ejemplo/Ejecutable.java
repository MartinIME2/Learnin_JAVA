/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo;

import com.ejemplo.dominio.Libro;

/**
 *
 * @author augus
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro(22, "The life of Gaussito", "Gauss", 123);
        Libro libro2 = new Libro(55, "The interesting life of Bessel", "Bessel", 321);

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        if (libro1.getPaginas() > libro2.getPaginas()) {
            System.out.println("El libro " + libro1.getAutor() + " tiene más páginas");
        } else {
            if (libro2.getPaginas() > libro1.getPaginas()) {
                System.out.println("El libro " + libro2.getTitulo()+ " tiene más páginas");
            } else {
                System.out.println("Tienen la misma cantidad de páginas");
            }

        }

    }
}
