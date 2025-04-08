package Exercicios.Drive.Sequenciais;

import java.util.Scanner;

public class Lista08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as horas: ");
        int horas = scanner.nextInt();

        System.out.print("Digite os minutos: ");
        int minutos = scanner.nextInt();

        System.out.print("Digite os segundos: ");
        int segundos = scanner.nextInt();

        int totalSegundos = (horas * 60 * 60) + (minutos * 60) + segundos;

        System.out.println("Total de segundos decorridos no dia: " + totalSegundos + " segundos");
    }
}