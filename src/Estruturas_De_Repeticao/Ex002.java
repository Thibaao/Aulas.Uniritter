package Estruturas_De_Repeticao;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B;

        do {
            System.out.print("Digite um número inteiro positivo A: ");
            A = scanner.nextInt();

            System.out.print("Digite um número inteiro positivo B: ");
            B = scanner.nextInt();

            if (A <= 0 || B <= 0) {
                System.out.println("Favor inserir apenas número positivos.");
            } else if (A >= B) {
                System.out.println("Garanta que A seja menor que B.");
            }
        } while (A >= B);

        System.out.println("Números divisiveis por 5 no intervalo [" + A + "," + B + "]:");
            for (int i = A; i <= B; i++) {
                if (i % 5 == 0) {
                    System.out.println(i);
                }
            }
        }
    }