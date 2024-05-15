package Atividade;

public class Hexagono extends Shape{
    private double lado;

    // Construtor
    public Hexagono(double lado) {
        this.lado = lado;
    }

    // Implementação dos métodos abstratos
    @Override
    public String getName() {
        return "Hexágono";
    }

    @Override
    public double calculateArea() {
        return (3 * Math.sqrt(3) * lado * lado) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return 6 * lado;
    }
}
