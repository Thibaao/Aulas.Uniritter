package Exercicios.Drive.Lista_OO_Basico.Exe004;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Rodrigo");
        aluno.setNota(8.5);
        System.out.println(aluno.getnome() + " - Nota: " + aluno.getNota());

        aluno.setNota(-3);
    }
}