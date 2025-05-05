package Exercicios.Drive.Lista_OO_Basico.Exe010;

public class TesteEmprestimo {
    public static void main(String[] args) {
        Livro livro = new Livro("Percy Jackson e o ladrão de raios");
        Usuario usuario = new Usuario("Rodrigo Thibes");

        Emprestimo emprestimo = new Emprestimo(livro, usuario);
        emprestimo.mostrarInfo();
    }
}