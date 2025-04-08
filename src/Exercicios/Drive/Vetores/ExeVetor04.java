package Exercicios.Drive.Vetores;

import java.util.Scanner;

public class ExeVetor04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[8];

        System.out.println("Digite 8 números inteiros para o vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("A[" + i + "]: ");
            vetorA[i] = scanner.nextInt();

            if (vetorA[i] % 2 == 0) {
                vetorB[i] = 1;
            } else {
                vetorB[i] = 0;
            }
        }

        // Exibindo os vetores
        System.out.println("\nVetor A:");
        for (int valor : vetorA) {
            System.out.print(valor + " ");
        }

        System.out.println("\nVetor B (1 = par, 0 = ímpar):");
        for (int valor : vetorB) {
            System.out.print(valor + " ");
        }
    }
}