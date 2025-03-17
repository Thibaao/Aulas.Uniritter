package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Realizar a leitura das dimensões do cômodo
        System.out.print("Digite a largura do cômodo em metros: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite o comprimento do cômodo em metros: ");
        double comprimento = scanner.nextDouble();

        // Realizar o cálculo em m²
        double area = largura * comprimento;

        // Realizar o cálculo da potência necessãria ( 18W por m² )
        double potenciaIluminacao = area * 18;

        // Impressão dos resultados
        System.out.printf("A área do cômodo é de: %.2f m²%n", area);
        System.out.printf("A potência necessária é de: %.2f W%n", potenciaIluminacao);

        scanner.close();
    }
}