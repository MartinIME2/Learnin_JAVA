/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author 54358
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int t[] = new int[10];
        int posicion;

        for (int i = 0; i < 10; i++) {//Llenamos la tabla
            System.out.println("Ingrese el valor a la tabla: ");
            t[i] = entrada.nextInt();

        }
        System.out.println();
        System.out.println("Ingrese la posicion a despejar: ");
        posicion = entrada.nextInt();
        for (int i = (posicion+1); i < 9; i++) {
            t[i] = t[i + 1];
        }
        System.out.println("La tabla queda: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(t[i]);

        }

    }
}
