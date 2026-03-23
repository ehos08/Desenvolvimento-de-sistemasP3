package aula1orientacao;

public class PessoaApp {
   public PessoaApp() {
   }

   public static void main(String[] var0) {
      Pessoa var1 = new Pessoa("Beatriz", 17);
      Pessoa var2 = new Pessoa("Enzo", 18);

      System.out.println("O nome da pessoa é... " + var1.getNome());
      System.out.println("A idade da pessoa é... " + var1.getIdade());

      var1.setNome("Beatriz Ribeiro");
      var1.setIdade(18);

      System.out.println("O nome da pessoa é... " + var1.getNome());
      System.out.println("A idade da pessoa é... " + var1.getIdade());

      var2.setNome("Enzo Oliveira");
      var2.setIdade(19);
      
      System.out.println("O nome da pessoa é... " + var2.getNome());
      System.out.println("A idade da pessoa é... " + var2.getIdade());
   }
}