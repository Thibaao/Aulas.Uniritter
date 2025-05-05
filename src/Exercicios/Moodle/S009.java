package Exercicios.Moodle;

import java.util.Scanner;

public class S009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o valor de a: ");
        double a = scanner.nextDouble();
        System.out.printf("Digite o valor de b: ");
        double b = scanner.nextDouble();
        System.out.printf("Digite o valor de c: ");
        double c = scanner.nextDouble();
        System.out.printf("Digite o valor de d: ");
        double d = scanner.nextDouble();
        System.out.printf("Digite o valor de e: ");
        double e = scanner.nextDouble();
        System.out.printf("Digite o valor de f: ");
        double f = scanner.nextDouble();

        double denominador = (a * e) - (b * d);
        if (denominador == 0) {
            System.out.println("Erro: O sistema não posseui solução única (denominador igual a zero).");
        } else {
            double x = ((c * e) - (b * f)) / denominador;
            double y = ((a * f) - (c * d)) / denominador;

            System.out.printf("O valor de x é: %.2f\n", x);
            System.out.printf("O valor de y é: %.2f\n", y);
        }
    }
}