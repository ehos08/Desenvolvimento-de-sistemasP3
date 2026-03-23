package aula1orientacao;

public class Pessoa {
   private String nome;
   private int idade;

   public Pessoa(String var1, int var2) {
      this.nome = var1;
      this.idade = var2;
   }

   public String getNome() {
      return this.nome;
   }

   public int getIdade() {
      return this.idade;
   }

   public void setNome(String var1) {
      this.nome = var1;
   }

   public void setIdade(int var1) {
      this.idade = var1;
   }
}
