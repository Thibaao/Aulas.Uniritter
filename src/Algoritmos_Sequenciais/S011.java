package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar que o usuário informe as dimensões da sala
        System.out.print("Digite o comprimento da sala em metros: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite a largura da sala em metros: ");
        double largura = scanner.nextDouble();

        // Calcular a quantidade de rodapé necessária
        double perimetro = 2 * (comprimento + largura);

        // Calcular a área do piso necessário
        double area = comprimento * largura;

        // Exibir os resultados
        System.out.printf("Você vai precisar de %.2f metros de rodapé.%n", perimetro);
        System.out.printf("Você vai precisar de %.2f metros quadrados de piso.%n  ", area);

        scanner.close();
    }
}
