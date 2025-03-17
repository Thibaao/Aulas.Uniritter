package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura de quantidade de sanduíches
        System.out.print("Digite a quantidade de sanduíches a serem montados: ");
        int quantSanduiches = scanner.nextInt();

        // Definição dos pesos dos ingredientes
        int queijo = 50;
        int presunto = 50;
        int hamburguer = 100;

        // Cálcular a quantidade total em gramas
        int kiloDoQueijo = quantSanduiches * 2 * queijo;
        int kiloDoPresunto = quantSanduiches * presunto;
        int kiloDoHamburguer = quantSanduiches * hamburguer;

        // Conversão das quantidades em kilos
        double totalQueijo = kiloDoQueijo / 1000.0;
        double totalPresunto = kiloDoPresunto / 1000.0;
        double totalHamburguer = kiloDoHamburguer / 1000.0;

        // Impressão dos resultados
        System.out.printf("Quantidade de queijo necessário: %.2f kg%n", totalQueijo);
        System.out.printf("Quantidade de presunto necessário: %.2f kg%n", totalPresunto);
        System.out.printf("Quantidade de hamburguer necessário: %.2f kg%n", totalHamburguer);

        scanner.close();
    }
}
