/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo;

import com.ejemplo.dominio.Punto;
import java.util.Scanner;

/**
 *
 * @author augus
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la coordenada en el eje X: ");
        int EjeX = entrada.nextInt();
        System.out.println("Ingrese la coordenada en el eje Y: ");
        int EjeY = entrada.nextInt();

        Punto punto1 = new Punto(EjeX, EjeY);

        
        System.out.println(punto1.cuadrante(EjeX, EjeY));
        System.out.println(punto1.distanciaeje(EjeX, EjeY));

    }
}
