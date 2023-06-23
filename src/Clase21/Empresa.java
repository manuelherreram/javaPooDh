package Clase21;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String razonSocial;
    private List<Empleado> empleadoList;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        empleadoList = new ArrayList<>();
    }

    public Double calcularSueldosTotal(Integer diasTrabajados){
        Double sueldosTotal = 0.0;
        for (Empleado empleado : empleadoList) {
            sueldosTotal += empleado.calcularSueldo(diasTrabajados);
        }
        return sueldosTotal;
    }

    //metodo para agregar empleado a lista de empleado
    public void agregarEmpleado(Empleado empleado){
        empleadoList.add(empleado);
    }
}
