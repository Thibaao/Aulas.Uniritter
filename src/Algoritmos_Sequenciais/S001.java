package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S001 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor do produto ao usuário
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        // Calcula o acréscimo de 30%
        double acrescimo = valorProduto * 0.30;

        // Calcula o valor final do produto com o acréscimo
        double valorFinal = valorProduto + acrescimo;

        // Imprime o valor final na console
        System.out.printf("O valor do produto com 30%% de acréscimo é: R$ %.2f%n", valorFinal);

        // Fecha o Scanner
        scanner.close();
    }
}
