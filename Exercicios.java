import java.util.Scanner;

public class Exercicios {

    public static void crescenteDe10a20() {
        System.out.println(" Crescente de 10 a 20 ");
        for (int i = 10; i <= 20; i++) {
            System.out.println(i);
        }
    }
    public static void decrescenteDe20a10() {
        System.out.println(" Decrescente de 20 a 10 ");
        for (int i = 20; i >= 10; i--) {
            System.out.println(i);
        }
    }
    public static void imparesEPares() {
        System.out.println(" Impares de 1 a 51 ");
        for (int i = 1; i <= 51; i += 2) {
            System.out.println(i);
        }
        System.out.println(" Pares de 52 a 100 ");
        for (int i = 52; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
    public static void tabuadaDe1a10() {
        System.out.println(" Tabuada de 1 a 10 ");
        for (int tabuada = 1; tabuada <= 10; tabuada++) {
            System.out.println(" Tabuada do " + tabuada );
            for (int mult = 1; mult <= 10; mult++) {
                System.out.println(tabuada + " x " + mult + " = " + (tabuada * mult));
            }
            System.out.println();
        }
    }
    public static void tabuadaUsuario(Scanner scanner) {
        System.out.print("Digite um numero para ver sua tabuada: ");
        int numero = scanner.nextInt();
        System.out.println(" Tabuada do " + numero);
        for (int mult = 1; mult <= 10; mult++) {
            System.out.println(numero + " x " + mult + " = " + (numero * mult));
        }
    }
    public static void menuInterativo(Scanner scanner) {
        int opcao;
        do {
            
            System.out.println("         MENU PRINCIPAL       ");
            System.out.println("╠══════════════════════════════╣");
            System.out.println("║  1 - Calcular Tabuada        ║");
            System.out.println("║  2 - Contagem Regressiva     ║");
            System.out.println("║  0 - Sair                    ║");
            System.out.println("╚══════════════════════════════╝");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o numero para a tabuada: ");
                    int numero = scanner.nextInt();
                    System.out.println(" Tabuada do " + numero);
                    for (int mult = 1; mult <= 10; mult++) {
                        System.out.println(numero + " x " + mult + " = " + (numero * mult));
                    }
                    break;
                case 2:
                    System.out.print("Digite o numero inicial da contagem regressiva: ");
                    int inicio = scanner.nextInt();
                    System.out.println(" Contagem Regressiva ");
                    for (int i = inicio; i >= 0; i--) {
                        System.out.println(i);
                    }
                    System.out.println("FIM");
                    break;
                case 0:
                    System.out.println("Encerrando......");
                    break;
                default:
                    System.out.println("Opcao invalida. Escolha 0, 1 ou 2.");
            }
        } while (opcao != 0);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        crescenteDe10a20();
        System.out.println();

        decrescenteDe20a10();
        System.out.println();

        imparesEPares();
        System.out.println();

        tabuadaDe1a10();

        tabuadaUsuario(scanner);
        System.out.println();

        menuInterativo(scanner);

        scanner.close();
    }
}