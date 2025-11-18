package katas;

import katas.vehiculos.Auto;
import katas.vehiculos.Vehiculo;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== KATA 1: VEHÍCULOS Y HERENCIA ===\n");

        // Crear instancia de Auto
        Auto miAuto = new Auto("Toyota", "Corolla", 4);

        System.out.println("--- Información del Auto ---");
        miAuto.mostrarInfo();

        // Demostrar upcasting
        System.out.println("\n--- Upcasting (Vehículo = Auto) ---");
        Vehiculo vehiculo = miAuto; // Upcasting implícito
        vehiculo.mostrarInfo(); // Polimorfismo: se ejecuta Auto.mostrarInfo()

        // Demostrar instanceof
        System.out.println("\n--- Verificación con instanceof ---");
        if (vehiculo instanceof Auto) {
            System.out.println("El vehículo es una instancia de Auto");
        }
        if (vehiculo instanceof Vehiculo) {
            System.out.println("El vehículo es una instancia de Vehiculo");
        }
    }
}
