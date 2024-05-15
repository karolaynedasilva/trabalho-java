package Atividade;

public class Losango extends Shape{
    private double diagonalMaior;
    private double diagonalMenor;

    public Losango(double diagonalMaior, double diagonalMenor) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public String getName() {
        return "Losango";
    }

    @Override
    public double calculateArea() {
        return (diagonalMaior * diagonalMenor) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * Math.sqrt((diagonalMaior * diagonalMaior + diagonalMenor * diagonalMenor) / 4);
    }
}

