package Aula18_03;

import java.util.Scanner;

public class Vetores_Funcoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (ehPar(numero)) {

            System.out.println(ehPar(numero));
            imprimeString("É par...");

        } else {

            imprimeString("É ímpar...");
            System.out.println(ehPar(numero));
        }
    }
    public static void imprimeString(String string) {
            System.out.println();
        }

    public static boolean ehPar (int numero) {
        return (numero % 2 == 0);
    }
}