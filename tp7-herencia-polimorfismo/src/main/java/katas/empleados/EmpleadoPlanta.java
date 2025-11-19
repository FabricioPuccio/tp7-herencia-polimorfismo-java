package katas.empleados;

public class EmpleadoPlanta extends Empleado {
    private double bonoAntiguedad;
    private int añosAntiguedad;

    public EmpleadoPlanta(String nombre, String id, double salarioBase,
                          int añosAntiguedad) {
        super(nombre, id, salarioBase);
        this.añosAntiguedad = añosAntiguedad;
        this.bonoAntiguedad = añosAntiguedad * 500; // $500 por año
    }

    @Override
    public double calcularSueldo() {
        return salarioBase + bonoAntiguedad;
    }

    // Método específico de EmpleadoPlanta
    public int getAñosAntiguedad() {
        return añosAntiguedad;
    }

    public double getBonoAntiguedad() {
        return bonoAntiguedad;
    }
}
