package ejemplo;

import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner lectorCadena = new Scanner(System.in);

        //Definir variables
        int n, tipo;//velero o lancha
        String nombre, nombreMayor;
        float monto, acuVelero, acuLancha, montoMayor, cuotaProm;
        boolean velero1 = false;
        boolean lancha1 = false;

        //Inicialización de las variables
        acuLancha = acuVelero = 0;
        montoMayor = 0;
        nombreMayor = "";

        //Leer datos de entrada
        do {
            System.out.println("Ingrese el número de barcos");
            n = entrada.nextInt();
        } while (n <= 0);//Cuando n es cero o neg, se vuelve a pedi

        //procesar los datos
        for (int i = 0; i < n; i++) {
            //Leer datos de cada embargación
            System.out.println("Ingrese el Nombre de la embarcación: ");
            nombre = lectorCadena.nextLine();

            do {
                System.out.println("Ingrese el tipo de embarcación 1:velero|2:Lancha");
                tipo = entrada.nextInt();

                if (tipo < 1 || tipo > 2) {
                    System.out.println("valor incorrecto! ingrese 1 o 2");
                }

            } while (tipo < 1 || tipo > 2);

            System.out.println("Ingrese el monto mensual: ");
            monto = entrada.nextFloat();

            if (tipo == 1) {
                acuVelero = acuVelero + monto;

                if (velero1 == false) {
                    nombreMayor = nombre;//Primer mayor encontrado
                    montoMayor = monto;
                    velero1 = true;

                } else {
                    if (monto > montoMayor) {
                        montoMayor = monto;//ultimo mayor enocntrado
                        nombreMayor = nombre;
                    }
                }

            } else {
                acuLancha = acuLancha + monto;
            }
        }
        //mostrar resultados
        cuotaProm = (acuVelero + acuLancha) / n;
        System.out.println("Total anual recaudado por veleros: " + (acuVelero * 12));
        System.out.println("Total anual recaudado por lanchas: " + (acuLancha * 12));
        if (velero1 == true) {
            System.out.println("El Nombre del velero con la mayor cuota es: " + nombreMayor);
            System.out.println("De $: " + montoMayor);
        }
        System.out.println("Cuaota mensual promedio: $ " + cuotaProm);
    }
}
