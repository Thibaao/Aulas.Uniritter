package Exercicios.Drive.Lista_OO_Basico.Exe007;

import java.util.ArrayList;

public class Curso {
    private String nomeCurso;
    private ArrayList<Aluno> alunos;

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {
        System.out.println("Alunos do curso " + nomeCurso + ":");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome());
        }
    }
}