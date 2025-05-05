package Exercicios.Drive.Lista_OO_Basico.Exe002;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("A última música", "Nicholas Sparks", "2009");
        Livro livro2 = new Livro("Café com deus pai", "Junior Rostirola", "2024");

        livro1.exibirInfo();
        livro2.exibirInfo();
    }
}