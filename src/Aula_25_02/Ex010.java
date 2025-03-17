package Aula_25_02;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lista de produtos disponíveis:");
        System.out.printf("1. Banana - R$ 0,30 (menos de 12), R$ 0,25 (12 ou mais)%n");
        System.out.printf("2. Laranja - R$ 0,40 (menos de 12), R$ 0,35 (12 ou mais)%n");
        System.out.printf("3. Maçã - R$ 0,50 (menos de 12), R$ 0,45 (12 ou mais)%n");
        System.out.printf("4. Kiwi - R$ 0,40 (menos de 12), R$ 0,30 (12 ou mais)%n");

        System.out.print("Escolha o produto (1-4): ");
        int produto = scanner.nextInt();

        System.out.print("Escolha a quantidade: ");
        int quantidade = scanner.nextInt();

        double preco = 0;

        switch (produto) {
            case 1:
                if (quantidade < 12) {
                    preco = 0.30 * quantidade;
                } else {
                    preco = 0.25 * quantidade;
                }
                break;
            case 2:
                if (quantidade < 12) {
                    preco = 0.40 * quantidade;
                } else {
                    preco = 0.35 * quantidade;
                }
                break;
            case 3:
                if (quantidade < 12) {
                    preco = 0.50 * quantidade;
                } else {
                    preco = 0.45 * quantidade;
                }
                break;
            case 4:
                if (quantidade < 12) {
                    preco = 0.40 * quantidade;
                } else {
                    preco = 0.30 * quantidade;
                }
                break;
            default:
                System.out.println("Produto inválido.");
                return;
        }

        System.out.printf("O valor total da compra é: R$ %.2f%n", preco);

        scanner.close();
    }
}
