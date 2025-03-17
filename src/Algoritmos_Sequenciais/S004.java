package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inserir os valores de entrada
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        // Calcular a variação percentual
        double variacaoPercentual = ((valor1 - valor2) / valor1) * 100;

        // Exibir a variação percentual
        if (variacaoPercentual > 0) {
            System.out.printf("Houve um acréscimo de %.2f%%.%n", variacaoPercentual);
        } else if (variacaoPercentual < 0) {
            System.out.printf("Hoube uma diminuição de %.2f%%.%n", Math.abs(variacaoPercentual));
        } else {
            System.out.println("Não houve variação percentual.");
        }
        scanner.close();
    }
}
