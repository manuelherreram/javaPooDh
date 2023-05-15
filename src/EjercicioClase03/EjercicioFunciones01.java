package EjercicioClase03;

import java.util.Scanner;

public class EjercicioFunciones01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        boolean esPrimo = esPrimo(numero);

        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

        scanner.close();
    }
    public static boolean esPrimo(int numero) {
        int divisores = 1;
        for(int i = 2; i <= numero; i ++) {
            if( numero % i == 0 ) {
                divisores ++;
            }
        }
        return divisores == 2;
    }

    public static boolean esDivisible(int a, int b) {
        return a % b == 0;
    }
}
