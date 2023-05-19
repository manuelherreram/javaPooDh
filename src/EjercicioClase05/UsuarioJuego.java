package EjercicioClase05;

public class UsuarioJuego {
        private String nombre;
        private String clave;
        private Double puntaje;
        private Integer nivel;

        public UsuarioJuego(String nombre, String clave){
            this.nombre = nombre;
            this.clave = clave;
            this.puntaje = 0.0;
            this.nivel = 0;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public void aumentarPuntaje() {
        this.puntaje++;
    }

    public void subirNivel() {
        this.nivel++;
    }

    public void bonus(int valor) {
        this.puntaje += valor;
    }

}
