package Clase16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadorList;

    public Equipo(String nombre) {
        this.nombre = nombre;
        jugadorList = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador){
        jugadorList.add(jugador);
    }

    public Integer cantidadJugadoresLesionados(){
        Integer cantidadLesionados = 0;
        for (Jugador jugador : jugadorList) {
            if(jugador.getLesionado() && jugador.getLesionado()){
                cantidadLesionados++;
            }
        }
        return cantidadLesionados;
    }

    public void mostrarJugadoresTitulares(){
        Collections.sort(jugadorList);
        //jugadorList.sort(null); otra forma de hacer lo mismo
        for (Jugador jugador : jugadorList) {
            if(jugador.getTitular())
                System.out.println(jugador);
        }
    }
}
