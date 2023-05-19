package EjercicioClase06;

public class Perro {
    private Boolean enAdopcion;
    private String raza;
    private Integer fechaNacimiento;
    private Double peso;
    private Boolean tieneChip;
    private Boolean lastimado;
    private String nombrePila;
    public Perro(String raza, Integer fechaNacimiento, Double peso, Boolean tieneChip, Boolean lastimado, String nombrePila) {
        this.enAdopcion = false;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.lastimado = lastimado;
        this.nombrePila = nombrePila;
    }
    public Perro(Boolean enAdopcion, String raza, Integer fechaNacimiento, Double peso, Boolean tieneChip, Boolean lastimado, String nombrePila) {
        this.enAdopcion = enAdopcion;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.lastimado = lastimado;
        this.nombrePila = nombrePila;
    }

    public void adoptar(String nombrePila){
        if (lastimado == false && peso > 5){
            enAdopcion = true;
            System.out.println(nombrePila + " es adorablemente adoptado");
        }else{
            System.out.println(nombrePila + "cooperaste");
        }
    }

    public Boolean getEnAdopcion() {
        return enAdopcion;
    }

    public void setEnAdopcion(Boolean enAdopcion) {
        this.enAdopcion = enAdopcion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Integer fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Boolean getTieneChip() {
        return tieneChip;
    }

    public void setTieneChip(Boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    public Boolean getLastimado() {
        return lastimado;
    }

    public void setLastimado(Boolean lastimado) {
        this.lastimado = lastimado;
    }

    public String getNombrePila() {
        return nombrePila;
    }

    public void setNombrePila(String nombrePila) {
        this.nombrePila = nombrePila;
    }
}
