package Exercicios.Drive.Vetores;

import java.util.Scanner;

public class ExeVetor03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[8];

        System.out.println("Digite 8 números inteiros para o vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("A[" + i + "]: ");
            vetorA[i] = scanner.nextInt();
            vetorB[i] = vetorA[i] * i;
        }

        System.out.println("\nVetor A:");
        for (int valor : vetorA) {
            System.out.print(valor + " ");
        }

        System.out.println("\nVetor B (A[i] * índice):");
        for (int valor : vetorB) {
            System.out.print(valor + " ");
    }
}
}