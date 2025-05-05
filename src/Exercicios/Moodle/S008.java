package Exercicios.Moodle;

import java.util.Scanner;

public class S008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite a sua idade: ");
        int idade = scanner.nextInt();

        long segundos = idade * 365 * 24 * 3600;

        System.out.println("Você já viveu aproximadamente: " + segundos + " de vividos");
    }
}
