package katas.vehiculos;

public class Vehiculo {
    // Atributos protegidos (accesibles por subclases)
    protected String marca;
    protected String modelo;

    // Constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método que será sobrescrito en la subclase
    public void mostrarInfo() {
        System.out.println("Vehículo: " + marca + " " + modelo);
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
