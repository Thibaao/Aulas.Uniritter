package Exercicios.Drive.Vetores;

import java.util.Scanner;

public class ExeVetor01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        System.out.println("Digite 5 números inteiros para o vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("A[" + i + "]: ");
            vetorA[i] = scanner.nextInt();
            vetorB[i] = vetorA[i] * 2;
        }

        System.out.println("\nVetor A: ");
        for (int valor : vetorA) {
            System.out.print(valor + " ");
        }

        System.out.println("\nVetor B (dobro de A): ");
        for (int valor : vetorB) {
            System.out.print(valor + " ");

        }
    }
}