package Estruturas_De_Repeticao;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero <=0) {
            System.out.println("Favor informar um número positivo.");
        } else {
            int totalPares = 0;
            int totalImpares = 0;
            int somaPares = 0;
            int somaImpares = 0;

            for (int i = 1; i <=numero; i++) {
                if (i % 2 == 0) {
                    totalPares++;
                    somaPares += i;
                } else {
                    totalImpares++;
                    somaImpares += i;
                }
            }

            System.out.println("Total de números pares: " + totalPares);
            System.out.println("Soma dos números pares: " + somaPares);
            System.out.println("Total de números impares " + totalImpares);
            System.out.println("Soma dos números impares " + somaImpares);
        }

        scanner.close();
    }
}
