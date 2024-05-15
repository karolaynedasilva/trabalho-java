package Atividade;

public class Main {
    public static void main(String[] args) {
        Shape retangulo = new Retangulo(5, 10);
        System.out.println("Nome: " + retangulo.getName());
        System.out.println("Área: " + retangulo.calculateArea());
        System.out.println("Perímetro: " + retangulo.calculatePerimeter());

        Shape circulo = new Circulo(5);
        System.out.println("\nNome: " + circulo.getName());
        System.out.println("Área: " + circulo.calculateArea());
        System.out.println("Perímetro: " + circulo.calculatePerimeter());

        Shape losango = new Losango(6, 8);
        System.out.println("\nNome: " + losango.getName());
        System.out.println("Área: " + losango.calculateArea());
        System.out.println("Perímetro: " + losango.calculatePerimeter());

        Shape hexagono = new Hexagono(6);
        System.out.println("\nNome: " + hexagono.getName());
        System.out.println("Área: " + hexagono.calculateArea());
        System.out.println("Perímetro: " + hexagono.calculatePerimeter());

        Shape pentagono = new Pentagono(7);
        System.out.println("\nNome: " + pentagono.getName());
        System.out.println("Área: " + pentagono.calculateArea());
        System.out.println("Perímetro: " + pentagono.calculatePerimeter());
    }
}
