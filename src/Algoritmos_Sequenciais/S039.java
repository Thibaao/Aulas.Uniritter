package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário fixo do vendedor: R$ ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite a comissão fixa por carro vendido: R$ ");
        double comissaoPorCarro = scanner.nextDouble();

        System.out.print("Digite o número de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total das vendas: R$ ");
        double valorTotalVendas = scanner.nextDouble();

        double comissaoFinal = carrosVendidos * comissaoPorCarro;
        double bonusVendas = valorTotalVendas * 0.05;
        double salarioFinal = salarioFixo + comissaoFinal + bonusVendas;

        System.out.printf("O salário final do vendedor será: R$ %.2f%n", salarioFinal);
    }
}