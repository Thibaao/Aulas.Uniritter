package Exercicios.Drive.Sequenciais;

import java.util.Scanner;

public class Lista06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        float tempFahrenhent = scanner.nextFloat();

        float tempCelsius = 5 * (tempFahrenhent - 32) / 9;

        System.out.printf("A temperatura em Celsius é: %.1fºC\n", tempCelsius);
    }
}