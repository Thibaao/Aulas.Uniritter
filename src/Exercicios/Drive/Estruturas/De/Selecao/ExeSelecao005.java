package Exercicios.Drive.Estruturas.De.Selecao;

import java.util.Scanner;

public class ExeSelecao005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        float valor = scanner.nextFloat();

        if (valor > 100 && valor < 200) {
            System.out.println("O valor está dentro do intervalo (100, 200).");
        } else {
            System.out.println("O valor está fora do intervalo (100, 200).");
        }
    }
}