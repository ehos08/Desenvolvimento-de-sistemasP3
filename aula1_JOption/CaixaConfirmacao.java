package aula1_JOption;

import javax.swing.JOptionPane;

public class CaixaConfirmacao {
    public static void main(String[] args) {
        int resposta =JOptionPane.showConfirmDialog(null, "Deseja continuar?", "confirmação", JOptionPane.YES_NO_OPTION);

        if (resposta==JOptionPane.YES_OPTION){
        JOptionPane.showMessageDialog(null, "Você ecolheu'Sim'","Resultado",JOptionPane.INFORMATION_MESSAGE);
        }else{
        JOptionPane.showMessageDialog(null, "Você escolheu 'Não' ", "Resultade", JOptionPane.WARNING_MESSAGE);
        }
    }
}
