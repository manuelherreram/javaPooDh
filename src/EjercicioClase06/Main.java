package EjercicioClase06;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Kiltro", 2020, 5.4, true, false, "Pulguita");
        Perro perro1 = new Perro(true, "chiwuawua", 2022, 8.0, true, true, "Longaniza");

        perro.adoptar("Pulguita");
        perro1.adoptar("Longaniza");

    }
}
