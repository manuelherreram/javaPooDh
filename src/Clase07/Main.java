package Clase07;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Guachimingo");
        Persona persona = new Persona("Manuel", perro);
        Paseador paseador = new Paseador("José");

        persona.pasearConSuPerro();
        paseador.pasearUnPerro(perro);
    }
}
