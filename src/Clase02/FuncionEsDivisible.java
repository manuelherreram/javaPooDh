package Clase02;

public abstract class FuncionEsDivisible {
    public static void main(String[] args) {
        int a = 15;
        int b = 3;
        boolean resultado = esDivisible(a, b);
        System.out.println("¿Es " + a + " divisible por " + b + "? " + resultado);
    }
    public static Boolean esDivisible(int a, int b) {
        if(a % b == 0) {
            return true;
        } else {
            return false;
        }
    }
}

