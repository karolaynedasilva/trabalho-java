package Atividade;

public class Pentagono extends Shape{
    private double lado;

    // Construtor
    public Pentagono(double lado) {
        this.lado = lado;
    }

    // Implementação dos métodos abstratos
    @Override
    public String getName() {
        return "Pentágono";
    }

    @Override
    public double calculateArea() {
        return (0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5)))) * lado * lado;
    }

    @Override
    public double calculatePerimeter() {
        return 5 * lado;
    }
}
