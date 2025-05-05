package Exercicios.Drive.Selecoes;

import java.util.Scanner;

public class ExeSelecao006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro segmento (A): ");
        float A = scanner.nextFloat();

        System.out.print("Digite o segundo segmento (B): ");
        float B = scanner.nextFloat();

        System.out.print("Digite o teiceiro segmento (C): ");
        float C = scanner.nextFloat();

        if (A < B + C && B < A + C && C < A + B) {
            System.out.println("Os segmentos podem formar um triângulo.");
        } else {
            System.out.println("Os segmentos NÃO podem formar um triângulo.");
        }
    }
}