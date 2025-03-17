package Estruturas_De_Repeticao;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorPrimos = 0; // Contador de números primos
        int numero = 101; // Iniciar a busca a partir do número 101

        System.out.println("Os 50 primeiros números primos maiores que 100 são:");

        while (contadorPrimos < 50) {
            if (ehPrimo(numero)) {
                System.out.println(numero);
                contadorPrimos++;
            }
            numero++; // Avançar para o próximo número
        }
    }

    // Método para verificar se um número é primo
    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Não é primo se for divisível por qualquer número menor que ele
            }
        }
        return true; // É primo se passar nos testes acima
    }

}
