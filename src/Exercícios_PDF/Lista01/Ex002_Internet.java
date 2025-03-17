package Exercícios_PDF.Lista01;

import java.util.Scanner;

public class Ex002_Internet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float raio, areaCirculo, pi = (float) 3.141592;

        System.out.println("Digite o raio de um circulo: ");
        raio = input.nextInt();

        areaCirculo = pi * (raio * raio);

        System.out.printf("A área do circulo é: %2f%n", areaCirculo);
    }
}
