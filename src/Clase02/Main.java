import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola! Cuál es tu nombre?");
        String nombre = scanner.nextLine();

        System.out.println("y tu edad?");
        Integer edad = scanner.nextInt();

        System.out.println("Tu nombre es: " + nombre + " y tu edad es: " + edad);
        for (int i = 0; i <=10 ; i++) {
            System.out.println(i);
        }

        esDivisible(edad, 2);
    }

    // Funciones
    public static Boolean esDivisible(int a, int b) {
        if(a % b == 0) {
            return true;
        } else {
            return false;
        }
    }
}


