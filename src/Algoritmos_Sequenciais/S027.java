package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        double x = scanner.nextDouble();

        System.out.print("Digite o valor de Y: ");
        double y = scanner.nextDouble();

        System.out.print("Digite o valor de Z ");
        double z = scanner.nextDouble();

        double resultado = ((x - 5) * y) - z;

        System.out.println("O resultado da expressão ((x - 5) * y) - z é: " + resultado);

        scanner.close();
    }
}