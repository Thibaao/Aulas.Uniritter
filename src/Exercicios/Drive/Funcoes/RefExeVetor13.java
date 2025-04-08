package Exercicios.Drive.Funcoes;

import java.util.Scanner;

public class RefExeVetor13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        lerVetor(scanner, vetorA, "A");
        lerVetor(scanner, vetorB, "B");
        multiplicadorVetores(vetorA, vetorB, vetorC);

        exibirVetor("Vetor A", vetorA);
        exibirVetor("Vetor B", vetorB);
        exibirVetor("Vetor C (A[i] * B[i]", vetorC);
    }

    public static void lerVetor(Scanner scanner, int[] vetor, String nome) {
        System.out.println("Digite os " + vetor.length + " elementos do vetor " + nome + ":");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(nome + "[" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }
    }

    public static void multiplicadorVetores(int [] vetorA, int[] vetorB, int[] vetorC) {
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