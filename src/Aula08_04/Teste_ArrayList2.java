package Aula08_04;

public class Teste_ArrayList2 {

    // ATRIBUTOS

    private String nome;
    private String idade;

    // MÉTODOS CONSTRUTORES

    public void Aluno(String nome, String idade) {
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