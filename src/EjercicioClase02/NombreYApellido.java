package EjercicioClase02;

import java.util.Scanner;

public class NombreYApellido {
    public static void main(String[] args) {
        String nombre;
        String apellido;
        char inicialNombre;
        char inicialApellido;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        inicialNombre = nombre.charAt(0);

        System.out.println("Ingrese su apellido: ");
        apellido = scanner.nextLine();
        inicialApellido = apellido.charAt(0);

        System.out.println("La inicial de tu nombre es: "+ inicialNombre + " y la inicial de tu apellido es: " + inicialApellido);

        scanner.close();


    }
}
