package EjercicioClase16;

public class Main {
    public static void main(String[] args) {
        Puerto puerto = new Puerto("Puerto de Buenos Aires");

        // Ingresar algunos contenedores
        puerto.ingresarContenedor(new Contenedor(1, "China", false));
        puerto.ingresarContenedor(new Contenedor(2, "EEUU", true));
        puerto.ingresarContenedor(new Contenedor(3, "Brasil", true));
        puerto.ingresarContenedor(new Contenedor(4, "Rusia", false));
        puerto.ingresarContenedor(new Contenedor(5, "Canadá", false));
        puerto.ingresarContenedor(new Contenedor(6, "Desconocida", true));
        puerto.ingresarContenedor(new Contenedor(7, "Desconocida", true));

        // Mostrar los contenedores ordenados
        System.out.println("Contenedores ordenados por número:");
        puerto.mostrarContenedores();

        // Calcular la cantidad de contenedores peligrosos con país "Desconocida"
        int cantidadPeligrososDesconocidos = puerto.getCantidadContenedoresPeligrosos();
        System.out.println("Cantidad de contenedores peligrosos con país \"Desconocida\": " + cantidadPeligrososDesconocidos);
    }
}
