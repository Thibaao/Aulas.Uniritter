package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média das notas é: " + media);

        if (media >= 7) {
            System.out.println("Você foi: Aprovado! Parabéns!");
        } else if (media >= 4) {
            System.out.println("Você precisa fazer: A PROVA FINAL! Boa sorte!");
        } else {
            System.out.println("Você foi: Reprovado! Tente novamente!");
        }

        scanner.close();
    }
}