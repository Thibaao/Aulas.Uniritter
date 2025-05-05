package Simulado;

import java.util.Scanner;

public class A103 {
    public static long calcularFatorial(int n) {
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inform um número inteiro para calcular seu fatorial: ");
        int num = scanner.nextInt();

        System.out.println("O fatorial de " + num + " é: " + calcularFatorial(num));
    }
}