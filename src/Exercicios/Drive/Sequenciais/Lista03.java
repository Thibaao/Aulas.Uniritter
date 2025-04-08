package Exercicios.Drive.Sequenciais;

import java.util.Scanner;

public class Lista03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = scanner.nextInt();

        System.out.print("Digite o quarto número inteiro: ");
        int num4 = scanner.nextInt();

        float media = (num1 + num2 + num3 + num4) /4.0f;

        System.out.printf("A média aritmética é: %.2f\n", media);
    }
}