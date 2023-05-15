package EjercicioClase03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer texto: ");
        String texto1 = scanner.nextLine();

        System.out.print("Ingresa el segundo texto: ");
        String texto2 = scanner.nextLine();

        boolean distintas = cadenasDeTextoDistintas(texto1, texto2);

        System.out.println("Las cadenas de texto son distintas: " + distintas);

        scanner.close();
    }

    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB) {
        return !unTextoA.equals(unTextoB);
    }
}

