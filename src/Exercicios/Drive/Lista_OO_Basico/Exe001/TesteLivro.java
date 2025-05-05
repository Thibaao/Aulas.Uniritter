package Exercicios.Drive.Lista_OO_Basico.Exe001;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "A última música";
        livro1.autor = "Nicholas Sparks";
        livro1.ano = "2009";

        Livro livro2 = new Livro();
        livro2.titulo = "Café com deus pai";
        livro2.autor = "Junior Rostirola";
        livro2.ano = "2024";

        livro1.exibirInfo();
        livro2.exibirInfo();
    }
}