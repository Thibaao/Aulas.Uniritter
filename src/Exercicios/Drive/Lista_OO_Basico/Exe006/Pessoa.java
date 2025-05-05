package Exercicios.Drive.Lista_OO_Basico.Exe006;

public class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco.getEnderecoCompleto());
    }
}