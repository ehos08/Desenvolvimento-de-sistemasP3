package ExSistemaRH;
public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("erro de Validação: o nome do funcionário não pode ser vazio.");
        }
        if (salarioBase < 0) {
            throw new IllegalArgumentException("erro de Validação: o salário base não pode ser negativo.");
        }
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    public abstract double calcularSalario();

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: R$ "+ String.format("%.2f", salarioBase));
        System.out.println("Salário Final: R$ "+ String.format("%.2f", calcularSalario()));
    }
}
