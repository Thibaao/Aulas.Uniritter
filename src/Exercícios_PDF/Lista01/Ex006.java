package Exercícios_PDF.Lista01;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float tempC, tempF;

        System.out.println("Digite a temperatura em Graus Fahrenheit: ");
        tempF = input.nextFloat();
        tempC = (5*(tempF - 32))/9;

        System.out.printf("Temperatura em Graus Celsius = %.1f\n", tempC);
    }
}
