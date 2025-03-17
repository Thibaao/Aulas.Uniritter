package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar que o usuário informe a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        // Calcula a temperatura em Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Exibir o resultado
        System.out.printf("A temperatura equivalente em Fahrenheit é: %.2fºF%n", fahrenheit);

        scanner.close();
    }
}