package katas.empleados;

public abstract class Empleado {
    protected String nombre;
    protected String id;
    protected double salarioBase;

    public Empleado(String nombre, String id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    // Método abstracto - cada tipo de empleado calcula diferente
    public abstract double calcularSueldo();

    // Método concreto compartido
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + " | ID: " + id +
                " | Sueldo: $" + calcularSueldo());
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getId() { return id; }
    public double getSalarioBase() { return salarioBase; }
}