package Estruturas_De_Selecao;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        if (valor > 100) {
            System.out.println("O valor" + valor + " é maior que 100.");
        } else {
            System.out.println("O valor" + valor + "É menor ou igual a 100");
        }
    }
}