package Aula25_02;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler os três segmentos de reta
        System.out.print("Digite o comprimento do segmento A: ");
        double A = scanner.nextDouble();

        System.out.print("Digite o comprimento do segmento B: ");
        double B = scanner.nextDouble();

        System.out.print("Digite o comprimento do segmento C: ");
        double C = scanner.nextDouble();

        // Verificar se com esses segmentos é possível compor um triângulo
        if ((A < B + C) && (B < A + C) && (C < A + B)) {
            System.out.println("Os segmentos podem formar um triângulo.");
        } else {
            System.out.println("Os segmentos não podem formar um triângulo.");
        }

        scanner.close();
    }
}