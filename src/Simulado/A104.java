package Simulado;

import java.util.Scanner;

public class A104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[7][7];

        System.out.println("Informe os elementos da matriz 7x7:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        int somaDiagonal = 0;
        for (int i = 0; i < 7; i++) {
            somaDiagonal += matriz[i][i];
        }

        System.out.println("A soma dos elemsnetos da diagonal principal é: " + somaDiagonal);
    }
}