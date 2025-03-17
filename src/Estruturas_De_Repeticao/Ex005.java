package Estruturas_De_Repeticao;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Digite um número para ver a tabuada ( ou um número negativo para sair): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("Número negativo detectado. Encerrando o programa...");
                break;
            }

            System.out.println("Tabuada do " + numero + ": ");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }

        scanner.close();
    }
}