package Exercicios.Drive.Selecoes;

import java.util.Scanner;

public class ExeSelecao001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        float valor = scanner.nextFloat();

        if (valor > 100) {
            System.out.println("O valor é maior do que 100.");
        } else if (valor < 100) {
            System.out.println("O valor é menor do que 100.");
        } else {
            System.out.println("O valor é igual a 100.");
        }
    }
}