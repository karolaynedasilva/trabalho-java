package SegundaAtividade;

public class Main {
    public static void main(String[] args) {
        Shape retangulo = new Retangulo(10, 15);
        System.out.println("Nome da Forma: " + retangulo.getNome());
        System.out.println("Área Calculada: " + retangulo.calcularArea());
        System.out.println("Perímetro total: " + retangulo.calcularPerimetro());

        Shape circulo = new Circulo(10);
        System.out.println("\nNome da Forma: " + circulo.getNome());
        System.out.println("Área Calculada: " + circulo.calcularArea());
        System.out.println("Perímetro total: " + circulo.calcularPerimetro());

        Shape losango = new Losango(10, 8);
        System.out.println("\nNome da Forma: " + losango.getNome());
        System.out.println("Área Calculada: " + losango.calcularArea());
        System.out.println("Perímetro total: " + losango.calcularPerimetro());

        Shape hexagono = new Hexagono(8);
        System.out.println("\nNome da Forma: " + hexagono.getNome());
        System.out.println("Área Calculada: " + hexagono.calcularArea());
        System.out.println("Perímetro total: " + hexagono.calcularPerimetro());

        Shape pentagono = new Pentagono(5);
        System.out.println("\nNome da Forma: " + pentagono.getNome());
        System.out.println("Área Calculada: " + pentagono.calcularArea());
        System.out.println("Perímetro total: " + pentagono.calcularPerimetro());
    }
}
