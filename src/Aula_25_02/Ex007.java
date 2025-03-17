package Aula_25_02;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o número de eleitores
        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        System.out.print("Digite o número total de votos brancos: ");
        int votosBrancos = scanner.nextInt();

        System.out.print("Digite o número total de votos nulos: ");
        int votosNulos = scanner.nextInt();

        System.out.print("Digite o número total de votos válidos: ");
        int votosValidos = scanner.nextInt();

        // Calcular os percentuais
        double percentualBrancos = (double) votosBrancos * 100 / totalEleitores;
        double percentualNulos = (double) votosNulos * 100 / totalEleitores;
        double percentualValidos = (double) votosValidos * 100 / totalEleitores;

        // Exibir os resultados
        System.out.printf("O percentual de votos brancos foi de: %.2f%%\n", percentualBrancos);
        System.out.printf("O percentual de votos nulos foi de: %.2f%%\n", percentualNulos);
        System.out.printf("O percentual de votos válidos foi de: %.2f%%\n", percentualValidos);

        scanner.close();
    }
}