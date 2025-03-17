package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro em segundos: ");
        int segundosTotais = scanner.nextInt();

        int horas = segundosTotais / 3600;
        int minutos = (segundosTotais % 3600) / 60;
        int segundos = segundosTotais % 60;

        System.out.printf("O tempo convertido é: %02d:%02d:%02d%n", horas, minutos, segundos);

        scanner.close();
    }
}