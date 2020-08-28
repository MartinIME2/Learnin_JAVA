/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo;

import com.ejemplo.dominio.CuentaBanco;
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
        int a = 5;
        Scanner entrada = new Scanner(System.in);//Lee numeros
        Scanner entrada2 = new Scanner(System.in);//Lee cadenas

        CuentaBanco miCuenta = new CuentaBanco("Bessel");
        miCuenta.setCodigo(a);//Pasa el codigo de la cuenta al objeto cuenta

        

        System.out.println("Ingrese el código de la cuenta: ");
        int codigo = entrada.nextInt();

        System.out.println("Ingrese el saldo inicial de la cuenta: ");
        float saldo = entrada.nextFloat();

        System.out.println("Ingrese el nombre del Titular de la cuenta: ");
        String titular = entrada2.nextLine();

        System.out.println(miCuenta.toString());
        
        CuentaBanco miCuenta2 = new CuentaBanco(codigo, saldo, titular);

        System.out.println(miCuenta2.toString());

        if (miCuenta.getSaldo() > miCuenta2.getSaldo()) {
            System.out.println("La cuenta " + miCuenta.getTitular() + "tiene mayor saldo");
        } else {
            if (miCuenta.getSaldo() < miCuenta2.getSaldo()) {
                System.out.println("La cuenta " + miCuenta2.getTitular() + "tiene mayor saldo");
            } else {
                System.out.println("Las cuentas tienen el mismo saldo");
            }
        }

    }

}
