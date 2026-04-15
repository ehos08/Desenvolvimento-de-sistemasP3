package ExSistemaRH;
public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        if (comissao < 0) {
            throw new IllegalArgumentException("Erro de validação: A comissão não pode ser negativa.");
        }
        this.comissao = comissao;
    }
    public double calcularSalario() {
        return salarioBase+comissao;
    }
    public void exibirDados() {
        System.out.println("\n   ---Dados do Vendedor---   ");
        super.exibirDados();
    }
}