package Exercícios_PDF.Lista01;

import java.util.Scanner;

public class Ex003_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtdNumerolidos = 4;
        float num1, num2, num3, num4, soma, media;

        System.out.println("Digite quatro numeros: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();

        soma = num1 + num2 + num3 + num4;
        media = soma/qtdNumerolidos;
        System.out.printf("A media aritmetica é: %.2f (%.2f/%d\n", media, soma, qtdNumerolidos);

    }
}
