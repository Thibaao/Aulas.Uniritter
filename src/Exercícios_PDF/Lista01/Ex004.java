package Exercícios_PDF.Lista01;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;

        System.out.println("Digite um número para x: ");
        x = input.nextInt();

        System.out.printf("O conteúdo de X é: %d\n", x);
        System.out.printf("O quadrado de X é: %d\n", (x * x));
        System.out.printf("O resto da divisão de X por 3 é: %d\n", (x % 3));
        System.out.printf("A metade de X é: %.1f\n", (float) x / 2);
        System.out.printf("O produto de X pela metade de X é: %.2f\n", (float) x * ((float) x / 2 ));
    }
}
