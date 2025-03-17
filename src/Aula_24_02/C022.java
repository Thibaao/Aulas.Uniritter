package Aula_24_02;

import java.util.Scanner;

public class C022 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tamanho lado A triangulo: ");
        int ladoA = input.nextInt();

        System.out.print("Tamanho lado B triangulo: ");
        int ladoB = input.nextInt();

        System.out.print("Tamanho lado C triangulo: ");
        int ladoC = input.nextInt();

        String tipoTriangulo;
        if ((ladoA == ladoB) && (ladoB == ladoC)){
            tipoTriangulo = "Equilátelo";
        } else if ((ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC)){
            tipoTriangulo = "Isósceles";
        } else {
            tipoTriangulo = "Escaleno";
        }
        System.out.printf("Triângulo do tipo %s", tipoTriangulo);
    }
}