package Clase16;

public class Jugador implements Comparable<Jugador>{
    private Integer numeroCamiseta;
    private String nombre;
    private Boolean lesionado;
    private Boolean titular;

    public Jugador(Integer numeroCamiseta, String nombre, Boolean lesionado, Boolean titular) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    @Override
    public int compareTo(Jugador otroJugador) {
        return this.numeroCamiseta.compareTo(otroJugador.numeroCamiseta);
    }

    public Boolean getLesionado() {
        return lesionado;
    }

    public Boolean getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "numeroCamiseta=" + numeroCamiseta +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

