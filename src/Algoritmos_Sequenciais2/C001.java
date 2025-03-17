package Algoritmos_Sequenciais2;

import java.util.Scanner;

public class C001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        double resultado = valor1 * valor2;

        if (resultado > Math.pow(valor1, 2)) {
            System.out.println("O resultado da multiplicação é: " + resultado);
        } else {
            System.out.println("O resultado da multiplicação não é maior que o primeiro valor ao quadrado.");
        }
    }
}
