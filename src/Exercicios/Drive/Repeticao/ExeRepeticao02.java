package Exercicios.Drive.Repeticao;

import java.util.Scanner;

public class ExeRepeticao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B;

        do {
            System.out.print("Digite o valor de A (inteiro positivo): ");
            A = scanner.nextInt();
            System.out.print("Digite o valor de B (inteiro positivo e maior que A): ");
            B = scanner.nextInt();

            if (A >= B || A <= 0) {
                System.out.println("Valores inválidos! A deve ser menor que B e ambos devem ser positivos.");
            }

        } while (A >= B || A <= 0);

        int soma = 0;

        System.out.println("\nNúmeros divisíveis por 5 no intervalo de " + A + " a " + B + ":");

        for (int i = A; i <= B; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
                soma += i;
            }
        }

        System.out.println("Soma dos números divisíveis por 5: " + soma);
    }
}
