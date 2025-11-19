package katas.animales;

public class Vaca extends Animal {
    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace: ¡Muuu!");
    }

    @Override
    public void describirAnimal() {
        System.out.println("La vaca " + nombre + " tiene cabeza y tiene cola");
    }
}
