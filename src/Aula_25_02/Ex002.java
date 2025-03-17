package Aula_25_02;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        if (valor %2 == 0) {
            System.out.println("O valor " + valor + " é par! ");
        } else {
            System.out.println("O valor " + valor + " é ímpar! ");
        }

        scanner.close();
    }
}
