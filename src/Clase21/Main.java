package Clase21;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("DigitalHouse");
        EmpleadoFactory fabricaEmpleados = EmpleadoFactory.getInstance();

        empresa.agregarEmpleado(fabricaEmpleados.crearEmpleado(EmpleadoFactory.CLAVE_EMP_PH));
        empresa.agregarEmpleado(fabricaEmpleados.crearEmpleado(EmpleadoFactory.CLAVE_EMP_RD));

        System.out.println(empresa.calcularSueldosTotal(30));
    }
}
