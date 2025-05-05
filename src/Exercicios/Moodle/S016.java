package Exercicios.Moodle;

import java.util.Scanner;

public class S016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do cômodo em metros: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite o comprimento do cômodo em metros: ");
        double comprimento = scanner.nextDouble();

        double area = largura * comprimento;

        double potencia = area * 18;

        System.out.printf("Área do cômodo: %.2f m2\n", area);
        System.out.printf("Potência de iluminação necessária: %.2f W\n", potencia);
    }
}