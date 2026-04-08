package ExAnimal;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAnimais {
    public static void limparConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            for (int i = 0; i < 50; i++) System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> listaAnimais= new ArrayList<>();
        int opcao=0;
        
        while (opcao!=3) {
            System.out.println("\nSISTEMA DE ANIMAIS E SEUS SONS");
            System.out.println("1- adicionar animal novo");
            System.out.println("2- emitir som do animal");
            System.out.println("3- sair do programa");
            System.out.println("\nSelecione uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    limparConsole();
                    System.out.print("\ninforme o nome do animal: ");
                    String nome =sc.nextLine();
                    System.out.print("informe o som que o animal faz: ");
                    String som =sc.nextLine();

                    listaAnimais.add(new AnimalAdicionado(nome, som));
                    System.out.println("\nAnimal adicionado.");
                    limparConsole();
                    break;
                case 2:
                    limparConsole();
                    if (listaAnimais.isEmpty()) {
                        System.out.println("\nnenhum animal cadastrado.");
                    } else {
                        System.out.println("LISTA DE ANIMAIS");
                        for (int i = 0 ; i < listaAnimais.size(); i++) {
                            System.out.println(i + " - " + listaAnimais.get(i).getNome());
                        }
                        
                        System.out.print("Escolha o número do animal: ");
                        int escolha = sc.nextInt();
                        sc.nextLine();

                        if (escolha >= 0 && escolha < listaAnimais.size()) {
                            listaAnimais.get(escolha).fazerSom();
                        } else {
                            System.out.println("\nOpção inválida.");
                        }
                    }
                    System.out.println("\nPressione Enter para voltar ao menu...");
                    sc.nextLine();
                    limparConsole();
                    break;
                case 3:
                    System.out.println("\nEncerrando o programa....");
                    break;
                default:
                    System.out.println("\nOpção inválida, tente novamente.");
                    break;
            }
        }
        sc.close();
    }
}