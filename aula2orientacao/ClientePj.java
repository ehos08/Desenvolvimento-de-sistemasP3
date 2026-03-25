package aula2orientacao;
public class ClientePj extends Cliente {
    private String cnpj;
    public ClientePj(String nome, int codigo, String endereco, String cnpj){
        super(nome, codigo, endereco);
        this.cnpj = cnpj;
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
    public String getCnpj(){
        return cnpj;
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
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("O cnpj é :" + getCnpj());
    }

}