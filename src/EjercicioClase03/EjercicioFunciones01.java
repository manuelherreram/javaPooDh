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
        if (numero < 2) {
            return false;
        }

        for (int i = 2; i * i <= numero; i++) {
            if (esDivisible(numero, i)) {
                return false;
            }
        }

        return true;
    }

    public static Boolean esDivisible(int a, int b) {
        return a % b == 0;
    }
}
