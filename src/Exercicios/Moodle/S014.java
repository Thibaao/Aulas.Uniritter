package Exercicios.Moodle;

import java.util.Scanner;

public class S014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe a medida em pés: ");
        double pes = scanner.nextDouble();

        double polegadas = pes * 12;
        double jardas = pes / 3;
        double milhas = pes / (3 * 1760);

        System.out.printf("A medida em polegadas é: %.2f\n", polegadas);
        System.out.printf("A medida em jardas é: %.2f\n", jardas);
        System.out.printf("A medida em milhas é: %.2f\n", milhas);
    }
}