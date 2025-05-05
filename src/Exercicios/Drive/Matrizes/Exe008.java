package Exercicios.Drive.Matrizes;

import java.util.Random;

public class Exe008 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Matriz 10x10 gerada aleatóriamente:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int somaDiagonal = 0;
        for (int i = 0; i < 10; i++) {
            somaDiagonal += matriz[i][i];
        }

        double mediaDiagonal = somaDiagonal / 10.0;

        System.out.println("\nMédia dos elementos da diagonal principal: " + mediaDiagonal);
    }
}
