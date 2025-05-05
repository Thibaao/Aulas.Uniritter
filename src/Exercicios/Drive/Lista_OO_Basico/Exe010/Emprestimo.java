package Exercicios.Drive.Lista_OO_Basico.Exe010;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
    }

    public void mostrarInfo() {
        System.out.println("Empréstimo:");
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Livro: " + livro.getTitulo());
    }
}