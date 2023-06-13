package EjercicioClase16;

public class Contenedor implements Comparable<Contenedor> {
    private Integer numero;
    private String pais;
    private Boolean esMaterialPeligroso;

    public Contenedor(Integer numero, String pais, Boolean esMaterialPeligroso) {
        this.numero = numero;
        this.pais = pais;
        this.esMaterialPeligroso = esMaterialPeligroso;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getPais() {
        return pais;
    }

    public Boolean getEsMaterialPeligroso() {
        return esMaterialPeligroso;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "numero=" + numero +
                ", pais='" + pais + '\'' +
                ", esMaterialPeligroso=" + esMaterialPeligroso +
                '}';
    }

    @Override
    public int compareTo(Contenedor otroContenedor) {
        return this.getNumero().compareTo(otroContenedor.getNumero());
    }
}