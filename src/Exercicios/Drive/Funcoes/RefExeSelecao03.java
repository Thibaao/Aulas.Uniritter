package Exercicios.Drive.Funcoes;

import java.util.Scanner;

public class RefExeSelecao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float valor1 = lerValor(scanner, 1);
        float valor2 = lerValor(scanner, 2);

        mostrarMaiorValor(valor1, valor2);
    }

    public static float lerValor(Scanner scanner, int numero) {
        System.out.print("Digite o valor " + numero + ": ");
        return scanner.nextFloat();
    }

    public static void mostrarMaiorValor(float v1, float v2) {
        if (v1 > v2) {
            System.out.println("O maior valor é a opção 1: "+ v1);
        } else if (v2 > v1) {
            System.out.println("O maior valor é a opção 2: "+ v2);
        } else {
            System.out.println("Os dois valores são iguais.");
        }
    }
}