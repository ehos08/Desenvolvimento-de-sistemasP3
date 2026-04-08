package ExAnimal;
abstract class Animal {
    private String nome;
    public Animal( String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public abstract void fazerSom();
}

class AnimalAdicionado extends Animal {
    private String som;

    public AnimalAdicionado(String nome, String som){
        super(nome);
        this.som = som;
    }
    public void fazerSom() {
        System.out.println("O " + getNome() + " faz " + som);
    }

}