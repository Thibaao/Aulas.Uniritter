package Exercicios.Moodle;

import java.util.Scanner;

public class S013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do depósito: ");
        double deposito = scanner.nextDouble();
        System.out.print("Digite a taxa de juros (%): ");
        double taxaJuros = scanner.nextDouble();

        double rendimento = deposito * (taxaJuros / 100);
        double total = deposito + rendimento;

        System.out.printf("Rendimento: R$ %.2f%n", rendimento);
        System.out.printf("Total após o rendimento: R$ %.2f%n", total);
    }
}