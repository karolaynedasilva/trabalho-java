package PrimeiraAtividade;

public class Gerente extends Funcionario{
    public Gerente(String nome, double valorHora, int horasTrabalhadas) {
        super(nome, valorHora, horasTrabalhadas);
    }

    // Sobrescrita do método calcularSalario para adicionar bônus
    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 1.05; // Bônus de 5%
    }
}
