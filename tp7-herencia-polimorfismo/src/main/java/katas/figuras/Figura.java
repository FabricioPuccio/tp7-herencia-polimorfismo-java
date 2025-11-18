package katas.figuras;

public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto - las subclases DEBEN implementarlo
    public abstract double calcularArea();

    // Método concreto - compartido por todas las subclases
    public void mostrarInformacion() {
        System.out.println("Figura: " + nombre + " - Área: " + calcularArea());
    }

    public String getNombre() {
        return nombre;
    }
}
