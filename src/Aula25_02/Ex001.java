package Aula25_02;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero1 = scanner.nextInt();

        if (numero1 <= 100) {
            System.out.println("O número lido não é maior que 100.");
        } else if (numero1 > 100) {
            System.out.println("O número lido é maior que 100");
        } else {
            System.out.println("O número lido não é maior que 100");
        }
    }
}
