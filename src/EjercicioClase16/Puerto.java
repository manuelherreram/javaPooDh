package EjercicioClase16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Puerto {
    private String nombre;
    private List<Contenedor> contenedorList;

    public Puerto(String nombre) {
        this.nombre = nombre;
        contenedorList = new ArrayList<>();
    }

    public void ingresarContenedor(Contenedor contenedor) {
        contenedorList.add(contenedor);
    }

    public void mostrarContenedores() {
        Collections.sort(contenedorList);
        for (Contenedor contenedor : contenedorList) {
            System.out.println(contenedor);
        }
    }

    public int getCantidadContenedoresPeligrosos() {
        int cantidadContenedoresPeligrosos = 0;
        for (Contenedor contenedor : contenedorList) {
            if (contenedor.getEsMaterialPeligroso() && contenedor.getPais().equals("Desconocida")) {
                cantidadContenedoresPeligrosos++;
            }
        }
        return cantidadContenedoresPeligrosos;
    }
}