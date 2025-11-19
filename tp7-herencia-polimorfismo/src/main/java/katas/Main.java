package katas;

import katas.vehiculos.Vehiculo;
import katas.vehiculos.Auto;
import katas.figuras.Figura;
import katas.figuras.Circulo;
import katas.figuras.Rectangulo;
import katas.empleados.Empleado;
import katas.empleados.EmpleadoPlanta;
import katas.empleados.EmpleadoTemporal;
import katas.animales.Animal;
import katas.animales.Perro;
import katas.animales.Gato;
import katas.animales.Vaca;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ejecutarKata1Vehiculos();
        ejecutarKata2Figuras();
        ejecutarKata3Empleados();
        ejecutarKata4Animales();
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

    public static void ejecutarKata3Empleados() {
        System.out.println("\n\n=== KATA 3: EMPLEADOS Y POLIMORFISMO ===\n");

        // Crear lista polimórfica de empleados
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Melisa Martellini", "EMP-001", 2500, 5));
        empleados.add(new EmpleadoTemporal("Julián López", "EMP-002", 2000, true));
        empleados.add(new EmpleadoPlanta("Sandra Fernández", "EMP-003", 3000, 8));
        empleados.add(new EmpleadoTemporal("Fabricio Puccio", "EMP-004", 1800, false));

        System.out.println("--- Cálculo de Sueldos (Polimorfismo) ---");
        for (Empleado empleado : empleados) {
            empleado.mostrarInformacion();
        }

        System.out.println("\n--- Clasificación con instanceof ---");
        int contadorPlanta = 0;
        int contadorTemporal = 0;
        double totalSueldos = 0;

        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPlanta) {
                contadorPlanta++;
                EmpleadoPlanta planta = (EmpleadoPlanta) empleado; // Downcasting seguro
                System.out.println(empleado.getNombre() + " - Planta (" +
                        planta.getAñosAntiguedad() + " años)");
            } else if (empleado instanceof EmpleadoTemporal) {
                contadorTemporal++;
                EmpleadoTemporal temp = (EmpleadoTemporal) empleado;
                String tipoJornada = temp.isTiempoCompleto() ? "Tiempo Completo" : "Medio Tiempo";
                System.out.println(empleado.getNombre() + " - Temporal (" + tipoJornada + ")");
            }
            totalSueldos += empleado.calcularSueldo();
        }

        System.out.println("\n--- Resumen ---");
        System.out.println("Total empleados planta: " + contadorPlanta);
        System.out.println("Total empleados temporales: " + contadorTemporal);
        System.out.println("Total sueldos: $" + totalSueldos);
    }

    public static void ejecutarKata4Animales() {
        System.out.println("\n\n=== KATA 4: ANIMALES Y COMPORTAMIENTO SOBRESCRITO ===\n");

        // Usar List para mayor flexibilidad
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Lyon"));
        animales.add(new Gato("Whiskers"));
        animales.add(new Vaca("Lola"));
        animales.add(new Perro("Indio"));
        animales.add(new Gato("Luna"));

        System.out.println("--- Sonidos de Animales (Polimorfismo) ---");
        for (Animal animal : animales) {
            animal.hacerSonido(); // Polimorfismo: cada animal hace su sonido
        }

        System.out.println("\n--- Descripción de Animales ---");
        for (Animal animal : animales) {
            animal.describirAnimal(); // Polimorfismo: cada animal se describe diferente
        }

        System.out.println("\n--- Verificación de Tipos con instanceof ---");
        int perros = 0, gatos = 0, vacas = 0;

        for (Animal animal : animales) {
            if (animal instanceof Perro) {
                perros++;
                System.out.println(animal.getNombre() + " es un Perro");
            } else if (animal instanceof Gato) {
                gatos++;
                System.out.println(animal.getNombre() + " es un Gato");
            } else if (animal instanceof Vaca) {
                vacas++;
                System.out.println(animal.getNombre() + " es una Vaca");
            }
        }

        System.out.println("\n--- Resumen ---");
        System.out.println("Total perros: " + perros);
        System.out.println("Total gatos: " + gatos);
        System.out.println("Total vacas: " + vacas);
        System.out.println("Total animales: " + animales.size());

        // Demostración adicional: upcasting y downcasting
        System.out.println("\n--- Demostración de Upcasting ---");
        Animal animalGenerico = new Perro("Rex"); // Upcasting implícito
        animalGenerico.hacerSonido(); // Ejecuta Perro.hacerSonido()

        System.out.println("\n--- Demostración de Downcasting Seguro ---");
        if (animalGenerico instanceof Perro) {
            Perro perroEspecifico = (Perro) animalGenerico; // Downcasting seguro
            System.out.println("Downcasting exitoso: " + perroEspecifico.getNombre() + " es un perro");
        }
    }
}
