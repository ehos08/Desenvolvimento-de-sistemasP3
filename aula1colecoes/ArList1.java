package aula1colecoes;

import java.util.ArrayList;

public class ArList1 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        //adicionar
        nomes.add("Enzo H.");
        nomes.add("Beastruz Ribas");
        nomes.add("Enzo Emerson Alves D. Lima");
        //listar
        for(int i = 0; i <nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
        //alterar
        nomes.set(1,"Pedro Alvares Cabral");
        
        //remover
        nomes.remove(2);

        System.out.println("==============================");
        for(String nome : nomes) {
            System.out.println(nome);
        }
    }
}
