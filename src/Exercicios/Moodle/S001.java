package Exercicios.Moodle;

import java.util.Scanner;

public class S001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: R$ ");
        double valorProduto = scanner.nextDouble();

        double valorComAumento = valorProduto * 1.30;

        System.out.printf("Valor com 30%% de acréscimo: R$ %.2f\n", valorComAumento);
    }
}