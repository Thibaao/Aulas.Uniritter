package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Informar o valor de dinheiro que será utilizado
        System.out.print("Digite a quantia de dinheiro em reais (BRL): ");
        double reais = scanner.nextDouble();

        // Leitura das cotações das moedas
        System.out.print("Digite a cotação em dólar (USD): ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Digite a cotação em Euro (EUR): ");
        double cotacaoEuro = scanner.nextDouble();

        System.out.print("Digite a cotação em Libra (GBP): ");
        double cotacaoLibra = scanner.nextDouble();

        // Conversão em Dólar
        double valorEmDolar = reais / cotacaoDolar;
        // Cotação em Euro
        double valorEmEuro = reais / cotacaoEuro;
        // Cotação em Libra
        double valorEmLibra = reais / cotacaoLibra;

        // Impressão dos valores convertidos
        System.out.printf("Valor em dólares (USD): %.2f%n", valorEmDolar);
        System.out.printf("Valor em Euro (EUR): %.2f%n", valorEmEuro);
        System.out.printf("Valor em Libra (GBP): %.2f%n", valorEmLibra);

        scanner.close();
    }
}