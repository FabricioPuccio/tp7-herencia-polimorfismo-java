package katas.figuras;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    // Métodos específicos de Rectángulo
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}
