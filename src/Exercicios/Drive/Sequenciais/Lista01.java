package Exercicios.Drive.Sequenciais;

import java.util.Scanner;

public class Lista01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        int produto = num1 * num2;

        System.out.println("O produto entre " + num1 + " e " + num2 + " é " + produto);
    }
}