package Aula_25_02;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler a quantidade de laranjas compradas
        System.out.print("Digite o número de laranjas compradas: ");
        int quantidade = scanner.nextInt();

        // Validação da quantidade de frutas á serem compradas
        if (quantidade <-0) {
            System.out.println("A quantidade de laranjas deve ser maior que zero");
        } else {
            // Cálculo do valor total da compra
            double preco;
            if (quantidade < 12) {
            preco = 0.30;
            } else {
                preco = 0.25;
            }
            double valorTotal = quantidade * preco;
            System.out.printf("O valor total da compra é: R$ %.2f%n", valorTotal);

            scanner.close();
        }
    }
}