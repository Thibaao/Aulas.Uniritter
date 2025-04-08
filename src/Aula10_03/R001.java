package Aula10_03;

import java.util.Scanner;

public class R001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de referência: ");
        double referencia = scanner.nextDouble();

        System.out.print("Digite o número inicial: ");
        double numeroInicial = scanner.nextDouble();

        System.out.print("Digite o número final: ");
        double numeroFinal = scanner.nextDouble();

        if (numeroInicial <= referencia && referencia <= numeroFinal) {
            System.out.println("O valor de referência está entre o número inicial e o número final.");
        } else {
            System.out.println("O valor de referência NÃO está entre o número inicial e o número final.");
        }
        scanner.close();
    }
}