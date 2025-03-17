package Exercícios_PDF.Lista01;

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horas, segundos, minutos, totalSegundos;

        System.out.println("Digite as horas, minutos e segundos de um dia: " + "(todos inteiros): ");
        horas = input.nextInt();
        minutos = input.nextInt();
        segundos = input.nextInt();

        totalSegundos = (horas * 60 * 60) + (minutos * 60) + segundos;

        System.out.println("Total de segundos transcorridos no dia: " + totalSegundos);
    }
}
