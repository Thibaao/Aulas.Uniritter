package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Informar a quantidade de pães e broas que foram vendidas
        System.out.print("Digite a quantidade de pães vendidos: ");
        int quantidadePaes = scanner.nextInt();
        System.out.print("Digite a quantidade de broas vendidas: ");
        int quantidadeBroas = scanner.nextInt();

        // Preço unitário dos pães e broas
        double precoPao = 0.12;
        double precoBroa = 1.50;

        // Cálculo dos totais vendidos
        double totalPaes = quantidadePaes * precoPao;
        double totalBroas = quantidadeBroas * precoBroa;
        double totalVendido = totalBroas + totalPaes;

        // Cálculo do valor á ser depositado
        double valorPoupanca = totalVendido * 0.10;

        // Impressão dos resultados
        System.out.printf("Você teve um lucro de: R$ %.2f em pães!%n", totalPaes);
        System.out.printf("Você teve um lucro de: R$ %.2f em Broas!%n", totalBroas);
        System.out.printf("Você arrecadou: R$ %.2f Reais!%n", totalVendido);
        System.out.printf("Você depositou: R$ %.2f Reais na poupança!%n", valorPoupanca);

        scanner.close();
    }
}
