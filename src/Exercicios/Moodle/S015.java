package Exercicios.Moodle;

import java.util.Scanner;

public class S015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura de cada degrau em metros: ");
        double alturaDegrau = scanner.nextDouble();

        System.out.print("Digite a altura que queira alcançar em metros: ");
        double alturaObjetivo = scanner.nextDouble();

        int quantidadeDegraus = (int) Math.ceil(alturaObjetivo / alturaDegrau);

        System.out.println("Você precisará subir " + quantidadeDegraus + " degraus para alcançar a altura desejada.");
    }
}