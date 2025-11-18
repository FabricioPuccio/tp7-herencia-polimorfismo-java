package katas;

import katas.vehiculos.Vehiculo;
import katas.vehiculos.Auto;
import katas.figuras.Figura;
import katas.figuras.Circulo;
import katas.figuras.Rectangulo;

public class Main {
    public static void main(String[] args) {

        //ejecutarKata1Vehiculos();
        ejecutarKata2Figuras();
    }

    public static void ejecutarKata1Vehiculos() {
        System.out.println("=== KATA 1: VEHÍCULOS Y HERENCIA ===\n");

        Auto miAuto = new Auto("Toyota", "Corolla", 4);

        System.out.println("--- Información del Auto ---");
        miAuto.mostrarInfo();

        System.out.println("\n--- Upcasting ---");
        Vehiculo vehiculo = miAuto;
        vehiculo.mostrarInfo();

        System.out.println("\n--- Verificación con instanceof ---");
        if (vehiculo instanceof Auto) {
            System.out.println("El vehículo es una instancia de Auto");
        }
    }

    public static void ejecutarKata2Figuras() {
        System.out.println("\n\n=== KATA 2: FIGURAS GEOMÉTRICAS ===\n");

        Figura[] figuras = {
                new Circulo("Círculo A", 5.0),
                new Rectangulo("Rectángulo B", 4.0, 6.0),
                new Circulo("Círculo C", 3.5)
        };

        System.out.println("--- Cálculo de Áreas (Polimorfismo) ---");
        for (Figura figura : figuras) {
            figura.mostrarInformacion();
        }

        System.out.println("\n--- Verificación de Tipos ---");
        for (Figura figura : figuras) {
            String tipo = (figura instanceof Circulo) ? "Círculo" : "Rectángulo";
            System.out.println(figura.getNombre() + " es un " + tipo);
        }
    }
}
