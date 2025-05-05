package Aula08_04;

public class Aluno {

    // ATRIBUTOS

    private String nome;
    private String idade;

    // MÉTODOS CONSTRUTORES

    public Aluno(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // GETTERS & SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}