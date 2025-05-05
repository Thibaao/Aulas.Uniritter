package Exercicios.Drive.Matrizes;

import java.util.Scanner;

public class Exe005 {
    public static void main(String[] args) {
        int[][] matrizA = new int[5][5];
        int[][] matrizB = new int[5][5];
        int[][] matrizS = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz A (5x5):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Elemento A [" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nDigite os elementos da matriz B (5x5):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Elemento B [" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrizS[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("\nMatriz S (soma de A e B):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizS[i][j] + " ");
            }

            System.out.println();
        }
    }
}
