package EjercicioClase02;

import java.util.Scanner;

public class IngresarDatosConScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        float coeficiente;
        String nombre;
        char inicial;

        System.out.println("Ingrese el primer valor: ");
        num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo valor: ");
        num2 = scanner.nextInt();

        System.out.println("Ingrese el coeficiente: ");
        coeficiente = scanner.nextFloat();

        System.out.println("Ingrese su nombre: ");
        scanner.nextLine();
        nombre = scanner.nextLine();
        inicial = nombre.charAt(0);
        System.out.println("La inicial de tu nombre es: "+ inicial);

        scanner.close();

    }
}
