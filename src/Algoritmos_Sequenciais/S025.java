package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();

        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = scanner.nextLine();

        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();

        int somaIdades = idade1 + idade2;

        System.out.println("A soma das idades de " + nome1 + " e " + nome2 + " é " + somaIdades);

        scanner.close();
    }
}