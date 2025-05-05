package Exercicios.Moodle;

import java.util.Scanner;

public class S012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe o valor da dimensão de A: ");
        double a = scanner.nextDouble();
        System.out.printf("Informe o valor da dimensão de B: ");
        double b = scanner.nextDouble();
        System.out.printf("Informe o valor da dimensão de C: ");
        double c = scanner.nextDouble();

        double diagonal = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 3));

        System.out.printf("A diagonal da caixa é: %.2f metros\n", diagonal);
    }
}