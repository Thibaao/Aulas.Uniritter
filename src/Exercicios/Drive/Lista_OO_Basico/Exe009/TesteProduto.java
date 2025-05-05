package Exercicios.Drive.Lista_OO_Basico.Exe009;

public class TesteProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Notebook i7");
        produto.setPreco("5500.00");

        System.out.println("Produto: " + produto.getNome() + "| Preço: R$ " + produto.getPreco());

        produto.setPreco(-500.00);
    }
}