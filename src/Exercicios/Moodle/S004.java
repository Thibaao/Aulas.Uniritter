package Exercicios.Moodle;

// Faça um algoritmo que leia dois valores e mostre o ponto percentual de acréscimo ou diminuição
// que ocorreu entre o primeiro e o segundo valor.

import java.util.Scanner;

public class S004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double primeiro = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double segundo = scanner.nextDouble();

        double percentual = ((segundo - primeiro) / primeiro) * 100;

        if (percentual > 0){
            System.out.printf("Acréscimo de %.2f%%\n", percentual);
        } else if (percentual < 0) {
            System.out.printf("Diminuição de %.2f%%\n", Math.abs(percentual));
        } else {
            System.out.println("Não houve alteração de percentuais.");
        }
    }
}