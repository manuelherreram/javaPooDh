package Clase07;

public class Persona {
    private String nombre;
    private Perro perro;

    public Persona(String nombre, Perro perro) {
        this.nombre = nombre;
        this.perro = perro;
    }

    public void pasearConSuPerro(){
        System.out.println(nombre + " esta paseando con su perrito " + perro.getApodo());
    }
}
