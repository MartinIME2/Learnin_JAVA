package practica_01;

import java.util.Scanner;

public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cp, ci, num;
        boolean anterior, avisoPI, paso0, paridad;
        Scanner entrada = new Scanner(System.in);

        cp = ci = 0; //Asignacion múltiple de variables
        anterior = false;
        avisoPI = true;
        paso0 = false;

        System.out.println("Ingrese un valor entero. Finaliza con un negativo");
        num = entrada.nextInt();

        while (num >= 0) {
            paridad = num % 2 == 0;//% devuelve el resto de la división por ese num
            if (paridad == true) {
                cp = cp + 1;
            } else {
                ci = ci + 1;
            }
            if (num == 0) {
                paso0 = true;
            }
            if (paridad == anterior) {
                avisoPI = false;
            }
            anterior = paridad;

            System.out.println("Ingrese un valor entero. Finaliza con un negativo");
            num = entrada.nextInt();
        }//Termina el while
        //Salidas:

        System.out.println("Cantidad de pares: " + cp + " y de impares: " + ci);
        if (paso0 == true) {
            System.out.println("Pasó al menos un cero!");
        }
        if (avisoPI == true) {
            System.out.print("Pasó una secuencia Par-Impar!");
        }
    }
}
