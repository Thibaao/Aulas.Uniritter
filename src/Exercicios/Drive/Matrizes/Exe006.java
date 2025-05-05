package Exercicios.Drive.Matrizes;

import java.util.Scanner;

public class Exe006 {
    public static void main(String[] args) {
        int[][] matriz = new int[6][6];
        int[] vetorV = new int[36];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz M (6x6):");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("Elemento M[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("\nDigite o valor de A: ");
        int A = scanner.nextInt();

        int k = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                vetorV[k] = matriz[i][j] * A;
                k++;
            }
        }

        System.out.println("\nVetor V (valores da matriz M multiplicados por A):");
        for (int i = 0; i < 36; i++) {
            System.out.print(vetorV[i] + " ");
        }
    }
}