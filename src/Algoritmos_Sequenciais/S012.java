package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar que o usuário informe as dimensões da caixa
        System.out.print("Digite o valor de A: ");
        double a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        double b = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        double c = scanner.nextInt();

        // Calcule a diagonal da caixa
        double diagonal = Math.sqrt(a * a + b * b + c * c);

        // Exibir o resultado
        System.out.printf("A diagonal da caixa é: %.2f%n", diagonal);

        scanner.close();
    }
}