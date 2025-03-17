package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da venda: R$");
        double valorTotal = scanner.nextDouble();

        // Total a pagar com desconto de 10%
        double valorComDesconto = valorTotal * 0.9;

        // Valor de cada parcela de 3x sem juros
        double valorParcela = valorTotal / 3;

        // Comissão do vendedor em caso de venda a vista de 5% do total da venda
        double comissaoAvista = valorComDesconto * 0.05;

        // Comissão do vendedor em caso de venda parcelada de 5% do total da venda
        double comissaoParcelada = valorTotal * 0.05;

        // Exibir os resultados
        System.out.println("Total á pagar com desconto de 10%: R$" + valorComDesconto);
        System.out.println("Valor de cada parcela (3x sem juros): R$" + valorParcela);
        System.out.println("Comissão do vendedor (á vista): R$" + comissaoAvista);
        System.out.println("Comissão do vendedor (parcelamento): R$" + comissaoParcelada);

        scanner.close();
    }
}