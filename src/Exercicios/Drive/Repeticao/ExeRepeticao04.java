package Exercicios.Drive.Repeticao;

import java.util.Scanner;

public class ExeRepeticao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.println("Digite duplas de números (o programa encerra quando os dois forem iguais):");

        while (true) {

            System.out.print("\nDigite o primeiro número: ");
            a = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            b = scanner.nextInt();


            if (a == b) {
                System.out.println("Valores iguais informados. Encerrando o programa...");
                break;
            }

            if (a < b) {
                System.out.println("Ordem CRESCENTE.");
            } else {
                System.out.println("Ordem DECRESCENTE.");
            }
        }
    }
}