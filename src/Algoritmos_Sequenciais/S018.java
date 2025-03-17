package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Informar o preço do litro da gasolina
        System.out.print("Digite o preço do litro da gasolina: ");
        double precoLitro = scanner.nextDouble();

        // Informar o valor que o motorista deseja abastecer
        System.out.print("Digite o valor em reais que o motorista deseja abastecer: ");
        double valor = scanner.nextDouble();

        // Cálculo da quantidade de litros
        double litros = valor / precoLitro;

        // Impressão da quantidade de litros abastecidos
        System.out.printf("Com R$ %.2f, você conseguirá abastecer %.2f litros de gasolina", valor, litros);

        scanner.close();
    }
}
