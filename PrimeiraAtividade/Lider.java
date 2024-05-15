package PrimeiraAtividade;

public class Lider extends Funcionario{
    public Lider(String nome, double valorHora, int horasTrabalhadas) {
        super(nome, valorHora, horasTrabalhadas);
    }

    // Sobrescrita do método calcularSalario para adicionar bônus
    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 1.02; // Bônus de 2%
    }
}
