package Exercicios.Moodle;

import java.util.Scanner;

public class S011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento da sala ( em metros ): ");
        double comprimento = scanner.nextDouble();
        System.out.print("Digite a largura da sama  ( em metros ): ");
        double largura = scanner.nextDouble();

        double rodape = 2 * (comprimento + largura);

        double areaPiso = comprimento + largura;

        System.out.printf("Comprimento: %.2f metros\n", comprimento);
        System.out.printf("Largura: %.2f metros\n", largura);
        System.out.printf("Metros de rodapé necessários: %.2f metros\n", rodape);
        System.out.printf("Metros quadrados de piso necessários> %.2f m²\n", areaPiso);
    }
}
