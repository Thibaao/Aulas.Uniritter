package Exercicios.Drive.Selecoes;

import java.util.Scanner;

public class ExeSelecao010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("""
        === MERCEARIA ORGANICA ===
        Escolha o produto:
        1 - Banana
        2 - Laranja
        3 - Maçã
        4 - Kiwi
        --------------------------
        Digite o número da fruta:\s""");

        int opcao = scanner.nextInt();

        System.out.print("Digite a quantidade desejada: ");
        int quantidade = scanner.nextInt();

        if (quantidade <= 0) {
            System.out.println("Quantidade inválida! Deve ser maior que zero.");
        } else {
            double precoUnitario;
            String nomeFruta;

            switch (opcao) {
                case 1:
                    nomeFruta = "Banana";
                    precoUnitario = (quantidade < 12) ? 0.30 : 0.25;
                    break;
                case 2:
                    nomeFruta = "Laranja";
                    precoUnitario = (quantidade < 12) ? 0.40 : 0.35;
                    break;
                case 3:
                    nomeFruta = "Maçã";
                    precoUnitario = (quantidade < 12) ? 0.50 : 0.45;
                    break;
                case 4:
                    nomeFruta = "Kiwi";
                    precoUnitario = (quantidade < 12) ? 0.40 : 0.30;
                    break;
                default:
                    System.out.println("Opção inválida de produto.");
                    scanner.close();
                    return;
            }

            double total = quantidade * precoUnitario;

            System.out.printf("Você comprou %d %s(s). Valor total: R$ %.2f\n",
                    quantidade, nomeFruta, total);
        }
    }
}
