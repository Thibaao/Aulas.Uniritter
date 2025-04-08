package Exercicios.Drive.Funcoes;

import java.util.Scanner;

public class RefExeVetor03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[8];

        lerVetor(vetorA, scanner);
        calcularVetorB(vetorA, vetorB);
        exibirVetor("Vetor A", vetorA);
        exibirVetor("Vetor B (A[i] * índice)", vetorB);
    }

    public static void lerVetor(int[] vetor, Scanner scanner) {
        System.out.println("Digite 8 números inteiros para o vetor A:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("A[" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }
    }

    public static void calcularVetorB(int[] vetorA, int[] vetorB) {
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i] * i;

        }
    }

    public static void exibirVetor(String titulo, int [] vetor) {
        System.out.println("\n" + titulo + ":");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}