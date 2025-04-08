package Exercicios.Drive.Repeticao;

import java.util.Scanner;

public class ExeRepeticao06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("=== TABUADA INTERATIVA ===");
        System.out.println("Digite um número para ver a tabuada (número negativo para sair)");

        while (true) {
            System.out.print("\nInforme um número: ");
            numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("Número negativo informado. Encerrando o programa...");
                break;
            }

            System.out.println("Tabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }
}