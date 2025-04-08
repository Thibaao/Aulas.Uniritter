package Exercicios.Drive.Funcoes;

import java.util.Scanner;

public class RefLista01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = lerNumero(scanner, "Digite o primeiro número inteiro: ");
        int num2 = lerNumero(scanner, "Digite o segundo número inteiro: ");

        int produto = calcularProduto(num1, num2);

        exibirResultado(num1, num2, produto);
    }

    public static int lerNumero(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    public static int calcularProduto(int a, int b) {
        return a * b;
    }

    public static void exibirResultado(int num1, int num2, int resultado) {
        System.out.println("O produto entre " + num1 + " e " + num2 + " é " + resultado);
    }
}