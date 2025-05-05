package Exercicios.Drive.Lista_OO_Basico.Exe002;

public class Livro {
    private String titulo;
    private String autor;
    private String ano;

    public Livro(String titulo, String autor, String ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void exibirInfo() {
        System.out.println(titulo + " - " + autor + " (" + ano + ")");
    }
}