package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar que o usuário informe a altura de cada degrau
        System.out.print("Digite a altura de cada degrau em metros: ");
        double alturaDegrau = scanner.nextDouble();

        // Solicitar que o usuário informe a algura desejada
        System.out.print("Digite a altura que deseja alcançar em metros: ");
        double alturaDesejada = scanner.nextDouble();

        // Calcule o número de degraus necessários
        int numeroDegraus = (int) Math.ceil(alturaDesejada / alturaDegrau);

        // Exibir o resultado
        System.out.println("Você precisará subir: " + numeroDegraus + " degraus para atingir a altura desejada!");

        scanner.close();
    }
}