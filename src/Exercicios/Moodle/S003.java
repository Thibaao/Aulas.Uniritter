package Exercicios.Moodle;

// Faça um algoritmo que leia o valor unitário de um produto, a quantidade e o percentual de imposto.
// Calcule e mostre o valor total do produto acrescentando o imposto lido.

// Valor unitário do produto: R$50,00
// Quantidade de produtos: 3
// Percentual de imposto: 10%
// 50 x 3 = 150 | 10% de 150 = 15 | Total: 150 + 15 = 165

import java.util.Scanner;

public class S003 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor unitário do produto: ");
        double valorUnitario = scanner.nextDouble();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o percentual de imposto do produto (%): ");
        double percentualImposto = scanner.nextDouble();

        double valorBruto = valorUnitario * quantidade;
        double valorImposto = valorBruto * (percentualImposto / 100);
        double valorTotal = valorBruto + valorImposto;

        System.out.printf("Valor total calculado com o imposto: R$ %.2f\n", valorTotal);
    }
}