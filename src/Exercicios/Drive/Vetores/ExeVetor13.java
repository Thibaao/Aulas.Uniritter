package Exercicios.Drive.Vetores;

import java.util.Scanner;

public class ExeVetor13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        System.out.println("Digite os 10 elementos do vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("Digite os 10 elementos do vetor B:");
        for (int i = 0; i < 10; i++) {
            System.out.print("B[" + i + "]: ");
            vetorB[i] = scanner.nextInt();

            vetorC[i] = vetorA[i] * vetorB[i];
        }

        System.out.println("\nVetor A:");
        for (int valor : vetorA) {
            System.out.print(valor + " ");
        }

        System.out.println("\nVetor B:");
        for (int valor : vetorB) {
            System.out.print(valor + " ");
        }

        System.out.println("\nVetor C (A[i] * B[i]):");
        for (int valor : vetorC) {
            System.out.print(valor + " ");
        }
    }
}