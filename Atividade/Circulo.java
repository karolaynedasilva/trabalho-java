package Atividade;

public class Circulo extends Shape{
    private double raio;

    // Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Implementação dos métodos abstratos
    @Override
    public String getName() {
        return "Círculo";
    }

    @Override
    public double calculateArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * raio;
    }
}

