package Aula_10_03;

import java.util.Scanner;

public class R002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero, menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE;

        System.out.println("Digite números (0 para encerrar): ");

        while (true) {
            numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero < menor) {
                menor = numero;
            }
            if (numero < maior) {
                maior = numero;
            }
        }

        if (menor == Integer.MAX_VALUE && maior == Integer.MIN_VALUE) {
        } else {
            System.out.println("Menor número: " + menor);
            System.out.println("Maior número: " + maior);
        }

        scanner.close();
    }
}
