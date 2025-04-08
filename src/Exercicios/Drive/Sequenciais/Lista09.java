package Exercicios.Drive.Sequenciais;

import java.util.Scanner;

public class Lista09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de homens: ");
        int homens = scanner.nextInt();

        System.out.print("Digite o número de mulheres: ");
        int mulheres = scanner.nextInt();

        System.out.print("Digite o número de crianças: ");
        int criancas = scanner.nextInt();

        int carneTotalGramas = (homens * 650) + (mulheres * 420) + (criancas * 290);

        float carneTotalKg = carneTotalGramas / 1000.0f;

        System.out.printf("Quantidade total de carne necessária: %.2f kg\n", carneTotalKg);

    }
}