package Exercicios.Drive.Matrizes;

import java.util.Random;

public class Exe004 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Matriz 10x10 gerada aleatoriamente:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
    }

        int somaLinhasPares = 0;
        System.out.println("Soma das linhas pares:");
        for (int i = 0; i < 10; i+= 2) {
            int somaLinha = 0;
            for (int j = 0; j < 10; j++) {
                somaLinha += matriz[i][j];
            }
            somaLinhasPares +=somaLinha;
            System.out.println("Linha " + (i + 1) + ": " + somaLinha);
        }

        System.out.println("soma total das linhas pares: " + somaLinhasPares);
        }
}