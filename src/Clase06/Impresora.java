package Clase06;

public class Impresora {

    private String modelo;
    private String tipoConexion;

    private Integer fechaFabricacion;
    private Integer cantidadHojas;

    public Impresora(String modelo, String tipoConexion, Integer fechaFabricacion) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
        this.cantidadHojas = 4;
    }

    public Impresora(String modelo, String tipoConexion, Integer fechaFabricacion, Integer cantidadHojas) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
        this.cantidadHojas = 20;
    }
    // metodo imprimir
    public void imprimir(String textoImprimir){
        if (hayHojas()) {
            System.out.println(textoImprimir);
            cantidadHojas--;
        } else {
            System.out.println("No hay suficientes hojas para imprimir.");
        }
    }

    // funcion para comprobar la cantidad de hojas
    private Boolean hayHojas(){
        return cantidadHojas>0;
    }
}
