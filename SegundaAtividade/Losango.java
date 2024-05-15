package SegundaAtividade;

public class Losango extends Shape{
    private double diagonalMaior;
    private double diagonalMenor;

    public Losango(double diagonalMaior, double diagonalMenor) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public String getNome() {
        return "Losango";
    }
    @Override
    public double calcularArea() {
        return (diagonalMaior * diagonalMenor) / 2;
    }
    @Override
    public double calcularPerimetro() {
        return 4 * Math.sqrt((diagonalMaior * diagonalMaior + diagonalMenor * diagonalMenor) / 4);
    }
}

