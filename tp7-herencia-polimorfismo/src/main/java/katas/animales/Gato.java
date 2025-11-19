package katas.animales;

public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace: ¡Miau!");
    }

    @Override
    public void describirAnimal() {
        System.out.println(nombre + " es un gato independiente");
    }
}
