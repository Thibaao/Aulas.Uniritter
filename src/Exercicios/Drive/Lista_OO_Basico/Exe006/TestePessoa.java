package Exercicios.Drive.Lista_OO_Basico.Exe006;

public class TestePessoa {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua itapema", 55, "Cachoeirinha");
        Pessoa pessoa = new Pessoa("Rodrigo", endereco);
        pessoa.mostrarDados();
    }
}