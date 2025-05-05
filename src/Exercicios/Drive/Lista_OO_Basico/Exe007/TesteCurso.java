package Exercicios.Drive.Lista_OO_Basico.Exe007;

public class TesteCurso {
    public static void main(String[] args) {
        Curso curso = new Curso("Análise e Desenvolvimento de Sistemas");

        Aluno aluno1 = new Aluno("Rodrigo");
        Aluno aluno2 = new Aluno("Diego");
        Aluno aluno3 = new Aluno("Fabricio");
        Aluno aluno4 = new Aluno("Victor");
        Aluno aluno5 = new Aluno("Pedro");

        curso.adicionarAluno(aluno1);
        curso.adicionarAluno(aluno2);
        curso.adicionarAluno(aluno3);
        curso.adicionarAluno(aluno4);
        curso.adicionarAluno(aluno5);

        curso.listarAlunos();
    }
}