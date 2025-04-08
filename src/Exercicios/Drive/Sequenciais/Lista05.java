package Exercicios.Drive.Sequenciais;

import java.util.Scanner;

public class Lista05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        float raio = scanner.nextFloat();

        final float PI = 3.141592f;

        float area = PI * raio * raio;

        System.out.printf("Á area do círculo é: %.2f\n", area);
    }
}