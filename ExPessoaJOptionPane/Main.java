package ExPessoaJOptionPane;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ", "Cadastro", JOptionPane.QUESTION_MESSAGE);
        String idadeString = JOptionPane.showInternalInputDialog(null, "Digite sua idade: ", "Cadastro", JOptionPane.QUESTION_MESSAGE);

        try {
            int idade = Integer.parseInt(idadeString);
            Pessoa pessoa = new Pessoa(nome, idade);

            String mensagem = "Dados Informados:\n" + "Nome: " + pessoa.getNome()+ "\n"+ "Idade: "+ pessoa.getIdade()+ "anos\n"+ "Status: Você é "+ pessoa.Maioridade()+ ".";
            JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, 
                "Erro: insira um número válido.", 
                "Erro de Entrada", 
                JOptionPane.ERROR_MESSAGE);
        }
    } 
}
