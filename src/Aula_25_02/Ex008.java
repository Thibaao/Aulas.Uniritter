package Aula_25_02;

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Digite o valor do lado A: ");
                double A = scanner.nextDouble();

                System.out.print("Digite o valor do lado B: ");
                double B = scanner.nextDouble();

                System.out.print("Digite o valor do lado C: ");
                double C = scanner.nextDouble();

                if (A < B + C && B < A + C && C < A + B) {
                    if (A == B && B == C) {
                        System.out.println("O triângulo é Equilátero.");
                    } else if (A == B || A == C || B == C) {
                        System.out.println("O triângulo é Isósceles.");
                    } else {
                        System.out.println("O triângulo é Escaleno.");
                    }
                } else {
                    System.out.println("Os valores fornecidos não formam um triângulo.");
                }

                scanner.close();
            }
        }