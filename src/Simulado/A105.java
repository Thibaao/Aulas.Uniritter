package Simulado;

import java.util.Scanner;

public class A105 {
    public static boolean ehPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int num = scanner.nextInt();

        if (ehPrimo(num)) {
            System.out.println(num + " é um número primo!");
        } else {
            System.out.println(num + " NÃO é um número primo.");
        }
    }
}