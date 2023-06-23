package Clase21;

public class EmpleadoContratado extends Empleado {
    private Double importeHora;
    private Double retencionImpuesto;

    public EmpleadoContratado(String nombre, String apellido, Integer legajo, Double importeHora, Double retencionImpuesto) {
        super(nombre, apellido, legajo);
        this.importeHora = importeHora;
        this.retencionImpuesto = retencionImpuesto;
    }


    @Override
    public Double calcularSueldo(Integer diasTrabajados) {
        return importeHora * diasTrabajados * 8 * (100 - retencionImpuesto) / 100;
    }
}
