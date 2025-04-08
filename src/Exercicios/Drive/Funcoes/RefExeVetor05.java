package Exercicios.Drive.Funcoes;

import java.util.Scanner;

public class RefExeVetor05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[8];

        lerVetor(vetorA, scanner);
        calcularQuadrados(vetorA, vetorB);
        exibirVetor("Vetor A", vetorA);
        exibirVetor("Vetor B (quadrado de A[i]", vetorB);
    }

    public static void lerVetor(int[] vetor, Scanner scanner) {
        System.out.println("Digite 8 números inteiros para o vetor A:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("A[" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }
    }

    public static void calcularQuadrados(int[] origem, int[] destino) {
        for (int i = 0; i < origem.length; i++) {
            destino[i] = origem[i] * origem[i];
        }
    }

    public static void exibirVetor(String titulo, int[] vetor) {
        System.out.println("\n" + titulo + ":");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}