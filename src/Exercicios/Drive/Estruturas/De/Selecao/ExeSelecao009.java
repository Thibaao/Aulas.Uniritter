package Exercicios.Drive.Estruturas.De.Selecao;

import java.util.Scanner;

public class ExeSelecao009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de laranjas compradas: ");
        int quantidade = scanner.nextInt();

        if (quantidade <= 0) {
            System.out.println("Quantidade inválida! Deve ser maior que zero.");
        } else {
            double precoPorUnidade;
            if (quantidade < 12) {
                precoPorUnidade = 0.30;
            } else {
                precoPorUnidade = 0.25;
            }

            double total = quantidade * precoPorUnidade;
            System.out.printf("Valor total da compra: R$ %.2f\n", total);
        }
    }
}