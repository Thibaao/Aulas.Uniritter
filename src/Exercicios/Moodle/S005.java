package Exercicios.Moodle;

import java.util.Scanner;

public class S005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número inteiro: ");
        int numero = scanner.nextInt();

        int dobro = numero * 2;
        double tercaParte = numero / 3.0;
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O dobro do número é: " + dobro);
        System.out.printf("A terça parte do número é: %.2f%n", tercaParte);
        System.out.println("O seu antecessor é: " + antecessor);
        System.out.println("O seu sucessor é: " + sucessor);
    }
}