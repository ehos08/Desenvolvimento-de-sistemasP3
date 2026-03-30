package aula1colecoes;

import java.util.ArrayList;

public class ArList2 {
    public static void main(String[] args) {
        ArrayList<String> numeros = new ArrayList<>();
        //adicionar
        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
        //listar
        for(int i = 0; i <numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
        //alterar
        numeros.set(1, "4");
        
        //remover
        numeros.remove(2);

        System.out.println("==============================");
        for(String numero : numeros) {
            System.out.println(numero);
        }
    }
}

