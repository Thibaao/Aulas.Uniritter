package Exercicios.Moodle;

import java.util.Scanner;

public class S002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor (A): ");
        int A = scanner.nextInt();

        System.out.print("Digite o segundo valor (B): ");
        int B = scanner.nextInt();

        int resto = A % B;
        double exponenciacao = Math.pow(B, A);

        System.out.println("Resto da divisão de A por B: " + resto);
        System.out.println("B elevado à potência A: " + exponenciacao);
    }
}