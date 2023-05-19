package Clase06;

public class Main {
    public static void main(String[] args) {
        Impresora impresora = new Impresora("HP", "USB", 2009);
        Impresora impresora1 = new Impresora("Epson", "WiFi", 2020, 100);

        impresora.imprimir("Hola mundo");
        impresora.imprimir("Hola mundo");
        impresora.imprimir("Hola mundo");
        impresora.imprimir("Hola mundo");
        impresora.imprimir("Hola mundo");
        impresora.imprimir("Hola mundo");

        impresora1.imprimir("Hola");

    }
}
