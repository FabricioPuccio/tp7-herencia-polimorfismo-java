package katas.animales;

public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace: ¡Guau!");
    }

    @Override
    public void describirAnimal() {
        System.out.println(nombre + " es un perro juguetón");
    }
}
