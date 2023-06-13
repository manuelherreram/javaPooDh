package Clase16;

public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("POO SuperCub");

        equipo.agregarJugador(new Jugador(1, "Manuel", true, false));
        equipo.agregarJugador(new Jugador(10, "Jose", true, true));
        equipo.agregarJugador(new Jugador(9, "Monse", false, true));

        System.out.println(equipo.cantidadJugadoresLesionados());
        equipo.mostrarJugadoresTitulares();
    }



}
