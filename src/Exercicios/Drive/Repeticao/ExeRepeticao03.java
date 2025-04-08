package Exercicios.Drive.Repeticao;

import java.util.Scanner;

public class ExeRepeticao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Número inválido. Digite um valor maior que zero.");
        } else {
            int somaDivisores = 0;

            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    somaDivisores += i;
                }
            }

            if (somaDivisores == numero) {
                System.out.println(numero + " é um número perfeito!");
            } else {
                System.out.println(numero + " NÃO é um número perfeito.");
            }
        }
    }
}