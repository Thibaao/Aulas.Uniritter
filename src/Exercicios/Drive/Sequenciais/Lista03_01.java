package Exercicios.Drive.Sequenciais;

import java.util.Scanner;

public class Lista03_01 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float num1 = scanner.nextFloat();

        System.out.print("Digite o segundo número: ");
        float num2 = scanner.nextFloat();

        System.out.print("Digite o terceiro número: ");
        float num3 = scanner.nextFloat();

        System.out.print("Digite o quarto número: ");
        float num4 = scanner.nextFloat();

        float media = (num1 + num2 + num3 + num4) / 4;

        System.out.printf("A média aritmética é: %.2f\n", media);
    }
}