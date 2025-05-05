package Revisao_280425; // M007

import java.util.Random;

public class Teste01 {
    public static void main(String[] args) {
        int ordem = 3;
        double[][] matriz = new double[ordem][ordem];
        Random random = new Random();

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                matriz[i][j] = random.nextDouble() * 100;
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.printf("%.2f ", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nSoma das colunas:");
        for (int j = 0; j < ordem; j++) {
            double somaColuna = 0;
            for (int i = 0; i < ordem; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.printf("Coluna %d: %.2f\n", j + 1, somaColuna);
        }

        double somaTotal = 0;
        int quantidadeValores = ordem * ordem;
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                somaTotal += matriz[i][j];
            }
        }
        double media = somaTotal / quantidadeValores;

        System.out.println("\nValores menores que a média (" + media + "):");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                if (matriz[i][j] < media) {
                    System.out.printf("%.2f ", matriz[i][j]);
                }
            }
        }

        double somaDiagonalSecundaria = 0;
        for (int i = 0; i < ordem; i++) {
            somaDiagonalSecundaria += matriz[i][ordem - 1 - i];
        }
        System.out.println("\n\nSoma dos elementos da diagonal secundária: " + somaDiagonalSecundaria);
    }
}