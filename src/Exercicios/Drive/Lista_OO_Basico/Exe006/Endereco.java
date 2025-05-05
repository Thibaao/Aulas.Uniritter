package Exercicios.Drive.Lista_OO_Basico.Exe006;

public class Endereco {
    private String rua;
    private int numero;
    private String cidade;

    public Endereco(String rua, int numero, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getEnderecoCompleto() {
        return rua + ", " + numero + " - " + cidade;
    }
}