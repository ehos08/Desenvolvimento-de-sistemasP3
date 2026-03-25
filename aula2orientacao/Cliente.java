package aula2orientacao;
public class Cliente {
    private String nome;
    private int codigo;
    private String endereco;

    public Cliente(String nome, int codigo, String endereco) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
    }
    public String getNome(){
        return nome;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getEndereco(){
        return endereco;
    }

    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void exibirInfo(){
        System.out.println("O nome é: " + getNome());
        System.out.println("O código é: " + getCodigo());
        System.out.println("O endereço é: " + getEndereco());
    }

}