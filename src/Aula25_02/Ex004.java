package Aula25_02;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        if (valor1 < valor2) {
            System.out.println("O menor valor é: " + valor1 + " ( Primeira opção ) ");
        } else if
        (valor2 < valor1) {
            System.out.println("O menor valor é: " + valor2 + " ( Segunda opção ) ");
        } else {
            System.out.println("Os dois valores são iguais");

            scanner.close();
        }
    }
}