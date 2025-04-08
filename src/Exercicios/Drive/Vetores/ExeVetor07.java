package Exercicios.Drive.Vetores;

import java.util.Scanner;

public class ExeVetor07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[8];
        int[] vetorC = new int[8];

        System.out.println("Digite 8 valores inteiros para o vetor A:");
        for (int i = 0; i < 8; i++) {
            System.out.print("A[" + i + "]: ");
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("Digite 8 valores inteiros para o vetor B:");
        for (int i = 0; i < 8; i++) {
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