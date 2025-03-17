package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar os dados de entrada do usuário
        System.out.print("Digite o valor unitário do produto: ");
        double valorUnitario = scanner.nextDouble();

        System.out.print("Digite a quantidade de produtos: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o percentual de imposto: ");
        double percentualImposto = scanner.nextDouble();

        // Calcular o valor total sem imposto
        double valorTotalSemImposto = valorUnitario * quantidade;

        // Calcular valor do imposto
        double valorImposto = valorTotalSemImposto * (percentualImposto / 100);

        // Calcular o valor total com imposto
        double valorTotalComImposto = valorTotalSemImposto + valorImposto;

        // Exibir o valor total com imposto
        System.out.printf("O valor total do produto com imposto é: R$ %.2f%n", valorTotalComImposto);

        scanner.close();
    }
}
