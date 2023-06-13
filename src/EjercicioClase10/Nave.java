package EjercicioClase10;

public class Nave extends Objeto {
    private double velocidad;
    private int vida;

    public Nave(int x, int y, char direccion, double velocidad) {
        super(x, y, direccion);
        this.velocidad = velocidad;
        this.vida = 100;
    }

    @Override
    public void irA(int x, int y, char direccion) {
        if (getDireccion() != direccion) {
            girar(direccion);
        }
        super.irA(x, y, direccion);
    }

    public void girar(char direccion) {
        setDireccion(direccion);
    }
}

