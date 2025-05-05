package Exercicios.Drive.Matrizes;

import java.util.Scanner;

public class Exe009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[3][3];

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + (i + 1) + "," + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        double[] diagonalPrincipal = new double[3];
        for (int i = 0; i < 3; i++) {
            diagonalPrincipal[i] = matriz[i][i];
        }

        double[] diagonalSecundaria = new double[3];
        for (int i = 0; i < 3; i++) {
            diagonalSecundaria[i] = matriz[i][2 - i];
        }

        double somaDiagonalSecundaria = 0;
        for (double elemento : diagonalSecundaria) {
            somaDiagonalSecundaria += elemento;
        }
        double mediaDiagonalSecundaria = somaDiagonalSecundaria / 3;

        double[] resultado = new double[3];
        for (int i = 0; i < 3; i++) {
            resultado[i] = diagonalPrincipal[i] * mediaDiagonalSecundaria;
        }

        System.out.println("Resultado da multiplicação dos elementos da diagonal principal pela média da diagonal secundária:");
        for (double valor : resultado) {
            System.out.println(valor);
        }
    }
}