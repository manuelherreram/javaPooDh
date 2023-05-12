package Clase03;
import java.util.Scanner;
public class EjercicioClase03 {
    public static void main(String[] args) {
        // Pido el nombre de la mascota
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la mascota: ");
        String nombre = scanner.nextLine();

        // Pido la cantidad de comida de la mascota
        System.out.println("Ingrese la cantidad maxima de comida: ");
        Double comidaCome = scanner.nextDouble();

        // Utilizo la funcion
        Integer totalPaquetes = cuantoPaquetes(comidaCome);

        // Imprimo el resultado
        System.out.println(nombre + " necesitó " + totalPaquetes + " paquetes");
    }
    // Funcion cuantoPaquetes
    public static Integer cuantoPaquetes(Double cantidadComidaMaxima){
        Integer paquetesTotales = 0; // Inicializo el contador de paquetes
        Double comidaEntregada = 0.0; // Inicializo el peso de la comida entregada
        Scanner scanner = new Scanner(System.in);

        while(cantidadComidaMaxima > comidaEntregada){
            System.out.println("Ingrese el peso de la comida: ");
            Double pesoPaquete = scanner.nextDouble();
            comidaEntregada += pesoPaquete;
            paquetesTotales++;
        }
        return paquetesTotales;
    }
}
