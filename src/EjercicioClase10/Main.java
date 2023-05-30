package EjercicioClase10;

public class Main {
    public static void main(String[] args) {

        Nave nave = new Nave(5, 5, 'N', 1.0);

        nave.irA(7, 7, 'E');

        nave.girar('S');

        Asteroide asteroide = new Asteroide(10, 10, 'S', 20);

        asteroide.irA(8, 8, 'N');

    }
}

