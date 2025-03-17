package Estruturas_De_Repeticao;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Digite o primeiro valor: ");
            int primeiro = scanner.nextInt();

            System.out.print("Digite o segundo valor: ");
            int segundo = scanner.nextInt();

            if (primeiro == segundo) {
                System.out.println("Valor iguais fornecidos. Encerrando...");
                break;
            }

            if (primeiro < segundo) {
                System.out.println("A dupla está em ordem crescente.");
            } else {
                System.out.println("A dupla está em ordem descrescente. ");
            }
        }

        scanner.close();
    }
}