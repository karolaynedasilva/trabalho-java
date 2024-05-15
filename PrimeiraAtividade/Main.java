package PrimeiraAtividade;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Ana", 16, 130);
        Lider lider1 = new Lider("Joana", 17, 120);
        Gerente gerente1 = new Gerente("Arnaldo", 35, 160);

        Empresa empresa = new Empresa();
        empresa.adicionarFuncionario(funcionario1);
        empresa.adicionarFuncionario(lider1);
        empresa.adicionarFuncionario(gerente1);

        double salarioTotal = empresa.calcularSalarioTotal();
        System.out.println("Salário total da empresa: " + salarioTotal);
    }
}
