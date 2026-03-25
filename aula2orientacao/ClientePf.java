package aula2orientacao;
public class ClientePf extends Cliente {
    private String cpf;
    public ClientePf(String nome, int codigo, String endereco, String cpf){
        super(nome, codigo, endereco);
        this.cpf = cpf;
    }
//gets
    public String getNome(){
        return super.getNome();
    }
    public int getCodigo(){
        return super.getCodigo();
    }
    public String getEndereco(){
        return super.getEndereco();
    }
    public String getCpf(){
        return cpf;
    }
//sets
    public void setNome(String nome){
        super.setNome(nome);
    }
    public void setCodigo(int codigo){
        super.setCodigo(codigo);
    }
    public void setEndereco(String endereco){
        super.setEndereco(endereco);
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("O cpf é :" + getCpf());
    }
    
}
