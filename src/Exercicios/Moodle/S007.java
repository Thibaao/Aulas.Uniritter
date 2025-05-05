package Exercicios.Moodle;

import java.util.Scanner;

public class S007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.printf("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.println("Você tem " + idade + " anos de idade.");
    }
}