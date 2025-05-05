package Exercicios.Drive.Matrizes;

import java.util.Random;

public class Exe002 {
    public static void main(String[] args) {
        int[][] matriz = new int[6][8];
        int[] vetorC = new int[6];
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = random.nextInt(200) - 100;
            }
        }

        for (int i = 0; i < 6; i++) {
            int negativos = 0;
            for (int j = 0; j < 8; j++) {
                if (matriz[i][j] < 0) {
                    negativos++;
                }
            }
            vetorC[i] = negativos;
        }

        System.out.println("Matriz 6x8 gerada aleatoriamente:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Vetor C (quantidade de elementos negativos por linha):");
        for (int i = 0; i < 6; i++) {
            System.out.println("Linha " + (i + 1) + ": " + vetorC[i] + " elementos negativos");
        }
    }
}