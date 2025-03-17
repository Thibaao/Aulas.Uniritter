package Exercícios_PDF.Lista01;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float compPolegadas, compMilimetros, tamanhoPolegada = (float) 25.4;

        System.out.println("Digite o comprimento em polegadas: ");
        compPolegadas = input.nextFloat();

        compMilimetros = compPolegadas * tamanhoPolegada;

        System.out.printf("Comprimento em milimetros é = %.1f\n", compMilimetros);

    }
}
