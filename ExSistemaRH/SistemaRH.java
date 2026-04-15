package ExSistemaRH;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;
public class SistemaRH {
    public static void main(String[] args) {
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        System.out.println("=== Sistema de Cadastro e Salários ===");

        while (opcao != 3) {
            try {
                System.out.println("\nMenu:");
                System.out.println("1 - Cadastrar Gerente");
                System.out.println("2 - Cadastrar Vendedor");
                System.out.println("3 - Exibir Relatório e Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                if (opcao == 1 || opcao == 2) {
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o salário base: R$ ");
                    double salarioBase = scanner.nextDouble();

                    if (opcao == 1) {
                        Funcionario gerente = new Gerente(nome, salarioBase);
                        listaFuncionarios.add(gerente);
                        System.out.println("Sucesso: Gerente cadastrado!");
                        
                    } else if (opcao == 2) {
                        System.out.print("Digite o valor da comissão: R$ ");
                        double comissao = scanner.nextDouble();       
                        Funcionario vendedor = new Vendedor(nome, salarioBase, comissao);
                        listaFuncionarios.add(vendedor);
                        System.out.println("Sucesso: Vendedor cadastrado!");
                    }
                } else if (opcao != 3) {
                    System.out.println("Aviso: Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro de Entrada: Tipo de dado incorreto. Por favor, insira números válidos.");
                scanner.nextLine();
                
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("\n===== Relatório final de funcionários=====");
        if (listaFuncionarios.isEmpty()) {
            System.out.println("Nenhum funcionário foi cadastrado no sistema.");
        } else {
            for (Funcionario f : listaFuncionarios) {
                f.exibirDados(); 
            }
        }
        
        scanner.close();
    }
}