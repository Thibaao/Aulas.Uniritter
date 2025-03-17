package Estruturas_De_Repeticao;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("O número deve ser inteiro e positivo: ");
            return;
        }

        int somaDivisores = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0){
                somaDivisores +=i;
            }
        }

        if (somaDivisores == numero) {
            System.out.println(numero + " É um número perfeito! ");
        } else {
            System.out.println(numero + " Não é um número perfeito. ");
        }

        scanner.close();
    }
}