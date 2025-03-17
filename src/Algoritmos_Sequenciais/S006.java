package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Informe o valor de número inteiro
        System.out.print("Digite o valor de número inteiro: ");
        int numero = scanner.nextInt();

        // Calcular o valor ao quadrado do número
        int quadrado = numero * numero;

        // Exibir o resultado
        System.out.println("O quadrado do número informado é: " + quadrado);

        scanner.close();
    }
}
