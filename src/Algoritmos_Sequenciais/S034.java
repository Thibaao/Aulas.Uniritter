package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a entrada de um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Calcular o quadrado do número
        int quadrado = numero * numero;

        // Exibir o resultado
        System.out.println("O quadrado de " + numero + " é: " + quadrado);

        scanner.close();
    }
}