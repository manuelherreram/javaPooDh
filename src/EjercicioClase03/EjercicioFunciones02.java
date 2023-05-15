package EjercicioClase03;

import java.util.Scanner;

public class EjercicioFunciones02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int numero3 = scanner.nextInt();

        int maximo = maximoEntreTresNumeros(numero1, numero2, numero3);

        System.out.println("El máximo entre los tres números es: " + maximo);

        scanner.close();
    }

    static int maximoEntreTresNumeros(int unNumeroA, int unNumeroB, int unNumeroC) {
        int maximo = unNumeroA;

        if (unNumeroB > maximo) {
            maximo = unNumeroB;
        }

        if (unNumeroC > maximo) {
            maximo = unNumeroC;
        }

        return maximo;
    }
}
