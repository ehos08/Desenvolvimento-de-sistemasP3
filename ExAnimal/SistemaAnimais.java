package ExAnimal;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAnimais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> listaAnimais= new ArrayList<>();
        int opcao=0;
        
        while (opcao!=3) {
            System.out.println("SISTEMA DE ANIMAIS E SEUS SONS");
            System.out.println("1- adicionar animal novo");
            System.out.println("2- emitir som do animal");
            System.out.println("3- sair do programa");
            System.out.println("Selecione uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    System.out.print("informe o nome do animal: ");
                    String nome =sc.nextLine();
                    System.out.print("informe o som que o animal faz: ");
                    String som =sc.nextLine();

                    listaAnimais.add(new AnimalAdicionado(nome, som));
                    System.out.println("Animal adicionado.");
                    break;
                case 2:
                    if (listaAnimais.isEmpty()) {
                        System.out.println("nenhum animal cadastrado.");
                    } else {
                        System.out.println("LISTA DE ANIMAIS");
                        for (int i = 0; i < listaAnimais.size(); i++) {
                            System.out.println(i + " - " + listaAnimais.get(i).getNome());
                        }
                        
                        System.out.print("Escolha o número do animal: ");
                        int escolha = sc.nextInt();

                        if (escolha >= 0 && escolha < listaAnimais.size()) {
                            listaAnimais.get(escolha).fazerSom();
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o programa....");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }

            
        }
        sc.close();
    }
}