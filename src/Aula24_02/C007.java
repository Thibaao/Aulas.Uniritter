package Aula24_02;

import java.util.Scanner;

public class C007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Número 1: ");
        int numero1 = input.nextInt();

        System.out.printf("Número 2: ");
        int numero2 = input.nextInt();

        if (numero1 < numero2) {
            System.out.printf("Primeiro número é menor que o segundo!");
        } else if (numero1 == numero2){
            System.out.printf("Primeiro número igual ao segundo!");
        } else {
            System.out.printf("O primeiro número é maior que o segundo!");
        }
    }
}