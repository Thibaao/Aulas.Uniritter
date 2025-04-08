package Exercicios.Drive.Estruturas.De.Selecao;

import java.util.Scanner;

public class ExeSelecao007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        System.out.print("Digite o número de votos brancos: ");
        int brancos = scanner.nextInt();

        System.out.print("Digite o número de votos nulos: ");
        int nulos = scanner.nextInt();

        System.out.print("Digite o número de votos válidos: ");
        int validos = scanner.nextInt();

        int somaVotos = brancos + nulos + validos;

        if (somaVotos > totalEleitores) {
            System.out.println("Erro: a soma dos votos é maior que o total de eleitores.");
        } else {

            float percBrancos = (brancos * 100.0f) / totalEleitores;
            float percNulos = (nulos * 100.0f) / totalEleitores;
            float percValidos = (validos * 100.0f) / totalEleitores;

            System.out.printf("Percentual de votos brancos: %.1f%%\n", percBrancos);
            System.out.printf("Percentual de votosnulos: %.1f%%\n", percNulos);
            System.out.printf("Percentual de votos válidos: %.1f%%\n", percValidos);
        }
    }
}