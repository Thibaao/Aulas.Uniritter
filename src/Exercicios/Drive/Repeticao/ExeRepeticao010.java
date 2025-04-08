package Exercicios.Drive.Repeticao;

import java.util.Scanner;

public class ExeRepeticao010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("=== Multiplicação de 1 até o número ===");

        while (true) {
            System.out.print("\nDigite um número inteiro positivo (ou 0 para sair): ");
            numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("Programa encerrado. Valeu!");
                break;
            }

            if (numero < 0) {
                System.out.println("Número inválido! Digite apenas valores positivos.");
                continue;
            }

            int multiplicacao = 1;
            System.out.print("Processo: ");

            for (int i = 1; i <= numero; i++) {
                multiplicacao *= i;
                System.out.print(i);
                if (i != numero) {
                    System.out.print(" x ");
                }
            }

            System.out.println(" = " + multiplicacao);
        }
    }
}