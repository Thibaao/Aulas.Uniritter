package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int HORAS_REGULARES = 160;

        System.out.print("Número de horas trabalhas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Salário recebido por hora: R$");
        double salarioPorHora = scanner.nextDouble();

        double salarioTotal;

        if (horasTrabalhadas > HORAS_REGULARES) {
            int horasExtras = horasTrabalhadas - HORAS_REGULARES;
            double valorHoraExtra = salarioPorHora * 1.5;
            salarioTotal = (HORAS_REGULARES * salarioPorHora) + (horasExtras * valorHoraExtra);
        } else {
            salarioTotal = horasTrabalhadas * salarioPorHora;
        }

        System.out.printf("O salário total do funcionário é de: R$ %.2f%n", salarioTotal);
    }
}