package Estruturas_De_Repeticao;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Solicitar um número inteiro positivo ao usuário
            System.out.print("Digite um número inteiro positivo (ou 0 para encerrar): ");
            int numero = scanner.nextInt();

            // Verificar se o número é 0 para encerrar
            if (numero == 0) {
                System.out.println("Encerrando o programa...");
                break;
            }

            if (numero < 0) {
                System.out.println("Por favor, insira apenas números positivos.");
                continue;
            }

            // Imprimir a multiplicação de 1 até o número fornecido
            System.out.println("Resultados das multiplicações de 1 até " + numero + ":");
            for (int i = 1; i <= numero; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }

        scanner.close();
    }
}