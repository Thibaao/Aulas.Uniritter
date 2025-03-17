package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de anos que você fuma: ");
        int anosFumando = scanner.nextInt();

        System.out.print("Número de cigarros fumados por dia: ");
        int cigarrosPorDia = scanner.nextInt();

        System.out.print("Custo de uma carteira de cigarros: ");
        double precoCarteira = scanner.nextDouble();

        final int CIGARROS_POR_DIA = 20;
        int totalCigarros = anosFumando * 365 * cigarrosPorDia;
        double custoTotal = (totalCigarros / (double) CIGARROS_POR_DIA) * precoCarteira;

        System.out.printf("O total gasto em cigarros é de: R$ %.2f%n", custoTotal);
    }
}