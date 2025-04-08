package Exercicios.Drive.Funcoes;

import java.util.Scanner;

public class RefExeSelecao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = lerNumero(scanner);
        verificarParOuImpar(valor);
    }

    public static int lerNumero(Scanner scanner) {
        System.out.print("Digite um número inteiro: ");
        return scanner.nextInt();
    }

    public static void verificarParOuImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("O valor é PAR.");
        } else {
            System.out.println("O valor é ÍMPAR.");
        }
    }
}