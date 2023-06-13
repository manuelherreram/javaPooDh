package EjercicioClase10;

public class Objeto {
    private int posx;
    private int posy;
    private char direccion;

    public Objeto(int x, int y, char direccion) {
        this.posx = x;
        this.posy = y;
        this.direccion = direccion;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    public void irA(int x, int y, char direccion) {
        // A implementar: movimiento hacia la posición (x,y)
        this.direccion = direccion;
        this.posx = x;
        this.posy = y;
    }
}

