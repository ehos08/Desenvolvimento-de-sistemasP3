package aula1colecoes;

import java.util.Scanner;

public class ArList3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        
        //adicionar
        for(int i = 0; i < 5; i++) {
            System.out.print("Digite um nome: ");
            nomes.add(sc.nextLine());
        }
        //listar
        for(int i=0; i<nomes.size(); i++) {
            System.out.println(i+ " - " +nomes.get(i));
        }
        //alterar
        int indiceAlterado;
        do {
            System.out.print("Digite o indice do nome a ser alterado: ");
            indiceAlterado = sc.nextInt();
            sc.nextLine();
            if (indiceAlterado < 0 || indiceAlterado >= nomes.size()) {
                System.out.println("Indice inválido.");
            }
        } while (indiceAlterado < 0 || indiceAlterado >= nomes.size());
        System.out.print("Digite o novo nome: ");
        String novoNome = sc.nextLine();
        
        //alterar o novo item 
        nomes.set(indiceAlterado, novoNome);
        System.out.println("Nome alterado com sucesso.");

        //remover
        int indice;
        do { 
            System.out.println("Digite o indice do nome a ser removido: ");
            indice = sc.nextInt();
            
            if (indice <0 || indice >= nomes.size()){
                System.out.println("Indice inválido.");
            }
        } while (indice <0 || indice >= nomes.size());
        nomes.remove(indice);
        System.out.println("Nome removido com sucesso.");
        
        for(String nome : nomes) {
            System.out.println(nome);
        }
        sc.close();
    }    
} 