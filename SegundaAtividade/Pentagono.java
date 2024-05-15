package SegundaAtividade;

public class Pentagono extends Shape{
    private double lado;

    public Pentagono(double lado) {
        this.lado = lado;
    }

    @Override
    public String getNome() {
        return "Pentágono";
    }
    @Override
    public double calcularArea() {
        return (0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5)))) * lado * lado;
    }
    @Override
    public double calcularPerimetro() {
        return 5 * lado;
    }
}
