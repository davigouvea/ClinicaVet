package clinica.model;

public abstract class Animal {
    private String nome;
    private int idade;
    private Tutor tutor;

    public Animal(String nome, int idade, Tutor tutor) {
        this.nome = nome;
        this.idade = idade;
        this.tutor = tutor;
    }

    public abstract String emitirSom();

    public String getNome() { return nome; }
    public Tutor getTutor() { return tutor; }
}