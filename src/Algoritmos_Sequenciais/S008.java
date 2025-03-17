package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário a sua idade
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        // Definir as constantes
        int diasPorAno = 365;
        int horasPorDia = 24;
        int minutosPorHora = 60;
        int segundosPorMinutos = 60;

        // Calcular o total de segundos
        int totalSegundos = idade * diasPorAno * horasPorDia*minutosPorHora * segundosPorMinutos;

        // Exibir o resultado
        System.out.println("Essa pessoa já viveu aproximadamente " + totalSegundos + " Segundos de vida.");

        scanner.close();
    }
}
