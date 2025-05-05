package Simulado;

import java.util.Scanner;

public class A102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a circunferência do quadril em centímetros: ");
        double quadril = scanner.nextDouble();

        System.out.print("Informe a altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Informe o sexo com M ou F: ");
        char sexo = scanner.next().charAt(0);

        double iac = quadril / (altura * Math.sqrt(altura)) - 18;

        System.out.printf("O IAC é: %.2f\n", iac);
        if (sexo == 'M' || sexo == 'm') {
            if (iac < 8) System.out.println("Abaixo do peso");
            else if (iac <= 20) System.out.println("Normal");
            else if (iac <= 25) System.out.println("Sobrepeso");
            else System.out.println("Obesidade");
        } else {
            if (iac < 20) System.out.println("Abaixo do peso");
            else if (iac <= 32) System.out.println("Normal");
            else if (iac <= 38) System.out.println("Sobrepeso");
            else System.out.println("Obesidade");
        }
    }
}