package Simulado;

import java.util.Scanner;

public class A101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o custo para embrulhar o presente (X): ");
        double x  = scanner.nextDouble();

        System.out.print("Informe o valor adicional do presente (Y): ");
        double y = scanner.nextDouble();

        double total = x + (x + y);

        System.out.println("O valor total para comprar e empacotar o presente vai ser: " + total + " reais");
    }
}