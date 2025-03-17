package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual mensal do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Digite o percentual de reajuste (em %): ");
        double percentualReajuste = scanner.nextDouble();

        double novoSalario = salarioAtual + (salarioAtual * percentualReajuste / 100);

        System.out.printf("O novo salário do funcionário será: R$ %.2f%n", novoSalario);
    }
}