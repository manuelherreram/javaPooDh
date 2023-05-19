package EjercicioClase05;

public class Main {
    public static void main(String[] args) {
        UsuarioJuego usuarioJuego = new UsuarioJuego("Joseryn", "playa123");
        System.out.println("El usuario se llama: " + usuarioJuego.getNombre());
        usuarioJuego.setNombre("Manu");
        System.out.println("El usuario ahora se llama: " + usuarioJuego.getNombre());

    }
}
