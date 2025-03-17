package Exercícios_PDF.Lista01;

import java.util.Scanner;

public class Ex001_Internet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int sum;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextInt();

        sum = num1 + num2;

        System.out.printf("A soma é: %d%n", sum);
    }
}
