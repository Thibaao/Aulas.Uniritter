package Exercicios.Drive.Selecoes;

import java.util.Scanner;

public class ExeSelecao002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int valor = scanner.nextInt();

        if (valor % 2 == 0) {
            System.out.println("O valor é PAR.");
        } else {
            System.out.println("O valor é ÍMPAR.");
        }
    }
}