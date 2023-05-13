package Clase01;

public class Divisible {
    public static void main(String[] args) {
        // Definimos los dos numeros enteros
        Integer num1 = 10;
        Integer num2 = 2;

        // Comprobamos que sea divisible por num2

        if (num1 % num2 == 0){
            System.out.println(num1 + " es divisible por " + num2);
        }else{
            System.out.println(num1 + " no es divisible por " + num2);
        }
    }
}
