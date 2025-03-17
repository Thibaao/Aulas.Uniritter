package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Informe um algoritmo de número inteiro
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        int inteiro = (int) numero;

        System.out.println("O valor inteiro do número digitado é: " + inteiro);

        scanner.close();
    }
}