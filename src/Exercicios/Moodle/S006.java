package Exercicios.Moodle;

import java.util.Scanner;

public class S006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de valor inteiro: ");
        int numero = scanner.nextInt();

        double quadrado = numero * numero;

        System.out.println("O valor inteiro elevado ao quadrado é: " + quadrado);
    }
}