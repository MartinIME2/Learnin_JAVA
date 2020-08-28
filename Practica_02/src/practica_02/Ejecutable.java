package practica_02;

import java.util.Scanner;

public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int PosX, PosY, op;

        PosX = (int) (Math.random() * 101);//Para incluir al 100
        PosY = (int) (Math.random() * 101);//Para incluir al 100

        do {
            System.out.println("Bessel está en (" + PosX + "," + PosY + ")");
            System.out.println("1. Girar al Norte y avanzar 10 pasos");
            System.out.println("2. Girar al Sur y avanzar 20 pasos");
            System.out.println("3. Girar al Este y avanzar 10 pasos");
            System.out.println("4. Girar al Oeste y avanzar 10 pasos");
            System.out.println("5. Salir");
            op = entrada.nextInt();//Lectura de la opcion que se elije
            switch (op) {
                case 1:
                    PosY = PosY + 10;
                    break;
                case 2:
                    PosY = PosY - 20;
                    break;
                case 3:
                    PosX = PosX - 10;
                    break;
                case 4:
                    PosX = PosX + 10;
                    break;
                case 5:
                    System.out.println("Adiós Bessel!");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (op != 5);
    }
}
