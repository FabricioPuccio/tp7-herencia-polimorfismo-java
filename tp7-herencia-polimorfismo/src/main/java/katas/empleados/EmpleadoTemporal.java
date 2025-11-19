package katas.empleados;

public class EmpleadoTemporal extends Empleado {
    private double bonoProductividad;
    private boolean tiempoCompleto;

    public EmpleadoTemporal(String nombre, String id, double salarioBase,
                            boolean tiempoCompleto) {
        super(nombre, id, salarioBase);
        this.tiempoCompleto = tiempoCompleto;
        this.bonoProductividad = tiempoCompleto ? 1000 : 500;
    }

    @Override
    public double calcularSueldo() {
        return salarioBase + bonoProductividad;
    }

    // Método específico de EmpleadoTemporal
    public boolean isTiempoCompleto() {
        return tiempoCompleto;
    }

    public double getBonoProductividad() {
        return bonoProductividad;
    }
}