package Exercicios.Drive.Matrizes;
import java.util.Scanner;

public class Exe007 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz M (5x5):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento M[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz M:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int somaLinha4 = 0;
        for (int j = 0; j < 5; j++) {
            somaLinha4 += matriz[3][j];
        }
        System.out.println("\nSoma da linha 4: " + somaLinha4);

        int somaColuna2 = 0;
        for (int i = 0; i < 5; i++) {
            somaColuna2 += matriz[i][1];
        }
        System.out.println("Soma da coluna 2: " + somaColuna2);

        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < 5; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }
        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);

        int somaTotal = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                somaTotal += matriz[i][j];
            }
        }
        System.out.println("Soma de todos os elementos da matriz: " + somaTotal);

        scanner.close();
    }
}