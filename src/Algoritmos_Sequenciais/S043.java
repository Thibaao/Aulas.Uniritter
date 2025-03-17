package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade do latão em gramas: ");
        double quantidadeLatao = scanner.nextDouble();

        double quantidadeCobre = quantidadeLatao * 0.7;
        double quantidadeZinco = quantidadeLatao * 0.3;

        System.out.printf("Para %.2f gramas de latão, são necessários: %n", quantidadeLatao);

        System.out.printf("- %.2f gramas de Cobre%n", quantidadeCobre);

        System.out.printf("- %.2f gramas de Zinco", quantidadeZinco);
    }
}