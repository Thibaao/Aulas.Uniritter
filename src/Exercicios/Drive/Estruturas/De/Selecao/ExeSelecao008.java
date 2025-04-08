package Exercicios.Drive.Estruturas.De.Selecao;

import java.util.Scanner;

public class ExeSelecao008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        float A = scanner.nextFloat();

        System.out.print("Digite o lado B: ");
        float B = scanner.nextFloat();

        System.out.print("Digite o lado C: ");
        float C = scanner.nextFloat();

        if (A < B + C && B < A + C && C < A + B) {

            if (A == B && B == C) {
                System.out.println("É um triângulo equilátero.");
            } else if (A == B || A == C || B == C) {
                System.out.println("É um triângulo isósceles.");
            } else {
                System.out.println("É um triângulo escaleno.");
            }
        } else {
            System.out.println("Os lados fornecidos NÃO formam um triângulo.");
        }
    }
}