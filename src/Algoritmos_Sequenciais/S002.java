package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler os valores
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        // Calcular o resto da divisão
        double resto = calcularResto(valor1, valor2);

        // Calcular a exponenciação
        double exponenciacao = calcularExponenciacao(valor1, valor2);

        // Imprimir os resultados
        System.out.println("O resto da divisão de " + valor1 + " por " + valor2 + " é " + resto);
        System.out.println(valor2 + " elevado a " + valor1 + " é " + exponenciacao);
    }

    // Método para calcular o resto da divisão
    public static double calcularResto(double valor1, double valor2) {
        return valor1 % valor2;
    }

    // Método para calcular a exponenciação
    public static double calcularExponenciacao(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}