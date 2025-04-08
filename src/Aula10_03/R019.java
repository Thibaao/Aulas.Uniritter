package Aula10_03;

import java.util.Scanner;

public class R019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do número " + numero + ":");
        for (int fator = 1; fator <= 10; fator++) {
            System.out.println(numero + " x " + fator + " = " + (numero * fator));
        }
        scanner.close();
    }
}