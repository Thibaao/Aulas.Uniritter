package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar que o usuário informe a medida em pés
        System.out.print("Digite a medida em pés: ");
        double pes = scanner.nextDouble();

        // Converta a medida para polegadas
        double polegadas = pes * 12;

        // Converta a medida para jardas
        double jardas = pes / 3;

        // Converta a medida para milhas
        double milhas = pes / 1760;

        // Exibir os resultados
        System.out.printf("A medida em polegadas é: %.2f polegadas%n", polegadas);
        System.out.printf("A medida em jardas é: %.2f jardas%n", jardas);
        System.out.printf("A medida em milhas é: %.2f milhas%n", milhas);

        scanner.close();
    }
}