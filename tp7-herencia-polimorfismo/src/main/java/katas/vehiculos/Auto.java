package katas.vehiculos;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    // Constructor que usa super()
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo); // Inicializa atributos de Vehiculo
        this.cantidadPuertas = cantidadPuertas;
    }

    // Sobrescritura del método
    @Override
    public void mostrarInfo() {
        System.out.println("Auto: " + marca + " " + modelo +
                " - " + cantidadPuertas + " puertas");
    }

    // Método específico de Auto
    public int getCantidadPuertas() {
        return cantidadPuertas;
    }
}
