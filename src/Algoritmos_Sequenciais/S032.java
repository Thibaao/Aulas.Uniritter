package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas: ");
        int horas = scanner.nextInt();

        int minutos = horas * 60;
        int segundos = horas * 3600;

        System.out.println("No intervalo de: " + horas + " horas, há: ");
        System.out.println(horas + " horas");
        System.out.println(minutos + " minutos");
        System.out.println(segundos + " segundos");

        scanner.close();
    }
}