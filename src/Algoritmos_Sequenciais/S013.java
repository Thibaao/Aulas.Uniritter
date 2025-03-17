package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar que o usuário informe o valor do depósito
        System.out.print("Digite o valor do depósito: ");
        double deposito = scanner.nextInt();

        // Solicitar que o usuário informe a taxa de juros
        System.out.print("Digite a taxa de juros ( em % ): ");
        double taxaJuros = scanner.nextDouble();

        // Calcular o valor de rendimento
        double rendimento = deposito * (taxaJuros / 100);

        // Calcular o valor total pós rendimento
        double valorTotal = deposito + rendimento;

        // Exibir os resultados
        System.out.printf("O valor de rendimento é: R$ %.2f%n", rendimento);
        System.out.printf("O valor total depois do rendimento é: %.2f%n", valorTotal);

        scanner.close();
    }
}