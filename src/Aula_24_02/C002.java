package Aula_24_02;

import java.util.Scanner;

public class C002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.printf("Número: ");
        numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("O número " + numero + " é par!\n ");
        } else {
            System.out.printf("O número " + numero + " é ímpar!\n ");
        }
    }
}