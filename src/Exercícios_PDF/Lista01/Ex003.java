package Exercícios_PDF.Lista01;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qdeNumeroslidos = 4;
        int num1, num2, num3, num4, soma, media;

        System.out.println("Digite quatro numeros: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();

        soma = num1 + num2 + num3 + num4;
        media = soma / qdeNumeroslidos;

        System.out.printf("A media aritmetica é: %d (%d/%d)\n", media, soma, qdeNumeroslidos);

        System.out.println("A media aritmetica é: "+ media +" (" + soma + "/" + qdeNumeroslidos + ")");
    }
}
