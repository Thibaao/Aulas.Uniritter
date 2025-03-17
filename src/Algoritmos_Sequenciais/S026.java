package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double C = scanner.nextDouble();

        double resultado = (A - B) * C;

        System.out.println("O resultado da expressão (A - B) * C é: " + resultado);

        scanner.close();
    }
}