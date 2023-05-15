package EjercicioClase02;

public class Main {
    public static void main(String[] args) {
        //Definir dos cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un mensaje
        String nombre1 = "Manuel";
        String nombre2 = "Daniela";
        if (nombre1.equals(nombre2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son diferentes");
        }
        // Definir dos Integer y determinar cuál es mayor, cuál es menor o si son iguales.
        //Informar el resultado obtenido.
        Integer num1 = 10;
        Integer num2 = 2;
        int comparar = num1.compareTo(num2);
        if (comparar > 0){
            System.out.println("num1 es mayor que num2");
        } else if (comparar < 0) {
            System.out.println("num1 es menor que num2");
        } else {
            System.out.println("Los numeros son iguales");
        }

    }
}
