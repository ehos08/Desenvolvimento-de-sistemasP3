package aula1_JOption;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MenuOptionPane {
    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<>();
        boolean executando=true;
        while (executando){
            String opcao= JOptionPane.showInputDialog(null, "Escolha a opção:\n 1-Cadatrar\n 2-Listar\n 3-Sair ", "Menu principal",JOptionPane.QUESTION_MESSAGE);

            if (opcao==null) {
                JOptionPane.showMessageDialog(null,"Operação cancelada");
                break;
            }
            switch (opcao) {
                case "1":
                    String produto = JOptionPane.showInputDialog(null, "Digite o nome do produto", "Cadastro de produtos", JOptionPane.QUESTION_MESSAGE);
                    if (produto==null|| produto.trim().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Produto não cadastrado");
                    }else{
                        produtos.add(produto);
                        JOptionPane.showMessageDialog(null, "Produto cadastrado com êxito.", produto, 0);
                    }
                    break;
                case "2":
                    if (produtos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum produto cadastrado");
                    }else{
                        String lista = "Produtos cadastrados\n\n";
                        for( int i=0;i<produtos.size();i++){
                            lista+=(i+1)+" - "+produtos.get(i);
                        }
                        JOptionPane.showMessageDialog(null, lista, "Lista de produtos", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Fechando programa...");
                    break;
            
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                    break;
            }

        }
    }
    
}
