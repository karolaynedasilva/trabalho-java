package PrimeiraAtividade;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;

    // Construtor
    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }

    // Método para adicionar funcionário à lista
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    // Método para calcular o salário total dos funcionários
    public double calcularSalarioTotal() {
        double salarioTotal = 0;
        for (Funcionario funcionario : funcionarios) {
            salarioTotal += funcionario.calcularSalario();
        }
        return salarioTotal;
    }
}
