package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Realizar a leitura do valor da mercadoria
        System.out.print("Digite o valor da mercadoria vendida: R$ ");
        double valorMercadoria = scanner.nextDouble();

        // Cálular as presstações
        int prestacao = (int) (valorMercadoria / 3); // Cálcula o valor inteiro das prestações
        double entrada = valorMercadoria - 2 * prestacao; // Cálcula o valor da entrada

        // Impressão dos resultados
        System.out.printf("Valor da entrada foi de: R$ %.2f%n", entrada);
        System.out.printf("Valor das prestações ficou em: R$ %d%n", prestacao);

        scanner.close();
    }
}
