package Exercicios.Drive.Lista_OO_Basico.Exe001;

public class Livro {
    public String titulo;
    public String autor;
    public String ano;

    public void exibirInfo() {
        System.out.println(titulo + " - " + autor + " (" + ano + ")");
    }
}