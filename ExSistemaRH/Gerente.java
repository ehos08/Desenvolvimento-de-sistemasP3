package ExSistemaRH;
public class Gerente extends Funcionario {
    
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + 2000.00;
    }

    @Override
    public void exibirDados() {
        System.out.println("\n--- Dados do Gerente ---");
        super.exibirDados();
    }
}