package Exercicios.Drive.Sequenciais;

import java.util.Scanner;

public class Lista07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento em polegadas: ");
        float polegadas = scanner.nextFloat();

        float milimetros = polegadas * 25.4f;

        System.out.printf("O comprimento em milimetros é: %.1f mm\n", milimetros);
    }
}