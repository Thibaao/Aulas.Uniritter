package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        double percentualDistribuidor = 28;
        double percentualImpostos = 45;

        double valorDistribuidor = custoFabrica * percentualDistribuidor / 100;
        double valorImpostos = custoFabrica * percentualImpostos / 100;
        double custoFinal = custoFabrica + valorDistribuidor + valorImpostos;

        System.out.printf("O custo final do carro ao consumidor é: R$ %.2f%n", custoFinal);
    }
}