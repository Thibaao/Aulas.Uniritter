package Exercicios.Drive.Estruturas.De.Selecao;

import java.util.Scanner;

public class ExeSelecao004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        float valor1 = scanner.nextFloat();

        System.out.print("Digite o segundo valor: ");
        float valor2 = scanner.nextFloat();

        if (valor1 < valor2) {
            System.out.println("O menor valor é: " + valor1);
        } else if (valor2 < valor1) {
            System.out.println("O menor valor é: " + valor2);
        } else {
            System.out.println("Os dois valores são iguais.");
        }
    }
}