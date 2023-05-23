package Clase07;

public class Paseador {
    private String nombre;

    public Paseador(String nombre) {
        this.nombre = nombre;
    }

    public void pasearUnPerro(Perro perro){
        System.out.println("El paseador "+ nombre + " pasea a " + perro.getApodo());
    }
}
