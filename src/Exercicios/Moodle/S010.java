package Exercicios.Moodle;

import java.util.Scanner;

public class S010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite a temperatura em Celcius: ");
        double celcius = scanner.nextDouble();

        double fahrenheit = (celcius * 1.8) + 32;

        System.out.println("A temperatura em Fahrenheit é: "+ fahrenheit + " Graus");
    }
}