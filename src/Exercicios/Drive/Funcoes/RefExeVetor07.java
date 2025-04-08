package Exercicios.Drive.Funcoes;

import java.util.Scanner;

public class RefExeVetor07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[8];
        int[] vetorC = new int[8];

        lerVetor(scanner, vetorA, "A");
        lerVetor(scanner, vetorB, "B");
        multiplicarVetores(vetorA, vetorB, vetorC);

        exibirVetor("Vetor A", vetorA);
        exibirVetor("Vetor B", vetorB);
        exibirVetor("Vetor C (A[i] * B[i]", vetorC);
    }

    public static void lerVetor(Scanner scanner, int[] vetor, String nome) {
        System.out.println("Digite 8 valores inteiros para o vetor " + nome + ": ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(nome + "[" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }
    }

    public static void multiplicarVetores(int[] vetorA, int[] vetorB, int[] vetorC) {
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] * vetorB[i];
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
