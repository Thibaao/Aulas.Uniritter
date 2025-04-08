package Exercicios.Drive.Repeticao;

import java.util.Scanner;

public class ExeRepeticao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Número inválido! Digite um valor maior que zero.");
        } else {
            int qtdPares = 0, qtdImpares = 0;
            int somaPares = 0, somaImpares = 0;

            for (int i = 1; i <= numero; i++) {
                if (i % 2 == 0) {
                    qtdPares++;
                    somaPares += i;
                } else {
                    qtdImpares++;
                    somaImpares += i;
                }
            }

            System.out.println("--- RESULTADOS ---");
            System.out.println("Quantidade de números pares: " + qtdPares);
            System.out.println("Soma dos números pares: " + somaPares);
            System.out.println("Quantidade de números ímpares: " + qtdImpares);
            System.out.println("Soma dos números ímpares: " + somaImpares);
        }
    }
}