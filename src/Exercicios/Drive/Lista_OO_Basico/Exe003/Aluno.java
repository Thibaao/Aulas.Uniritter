package Exercicios.Drive.Lista_OO_Basico.Exe003;

public class Aluno {
    private String nome;
    private static int totalAlunos = 0;

    public Aluno(String nome) {
        this.nome = nome;
        totalAlunos++;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + " | Total de Alunos: " + totalAlunos);
    }
}