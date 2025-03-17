package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S028 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite o peso da primeira nota: ");
        double peso1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite o peso da segunda nota: ");
        double peso2 = scanner.nextDouble();

        double somaPesos = peso1 + peso2;
        double mediaPonderada = ((nota1 * peso1) + (nota2 * peso2)) / somaPesos;

        System.out.println("A média pondera é: " +mediaPonderada);

        scanner.close();
    }
}