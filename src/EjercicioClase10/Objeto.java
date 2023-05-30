package EjercicioClase10;

public class Objeto {
    protected int posx;
    protected int posy;
    protected char direccion;

    public Objeto(int x, int y, char direccion) {
        this.posx = x;
        this.posy = y;
        this.direccion = direccion;
    }

    public void irA(int x, int y, char direccion) {
        this.direccion = direccion;
        this.posx = x;
        this.posy = y;
    }
}
