package Exercicios.Drive.Matrizes;

import java.util.Random;

public class Exe001 {
    public static void main(String[] args) {
        int[][] matriz = new int[7][9];
        Random random = new Random();

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 9; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Matriz 7x9 gerada aleatoriamente:");
        int soma = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz[i][j] + " ");
                soma += matriz[i][j];
            }
            System.out.println();
        }

        System.out.println("Soma dos elementos da matriz: " + soma);
    }
}