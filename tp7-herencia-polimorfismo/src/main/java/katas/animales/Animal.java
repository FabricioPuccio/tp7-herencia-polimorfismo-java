package katas.animales;

public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método que será sobrescrito por las subclases
    public void hacerSonido() {
        System.out.println("Sonido genérico de animal");
    }

    // Método que también será sobrescrito
    public void describirAnimal() {
        System.out.println(nombre + " es un animal");
    }

    // Getter
    public String getNombre() {
        return nombre;
    }
}
