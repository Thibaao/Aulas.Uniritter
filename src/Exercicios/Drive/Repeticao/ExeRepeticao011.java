package Exercicios.Drive.Repeticao;

import java.util.Scanner;

public class ExeRepeticao011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaHomens = 0, somaMulheres = 0;
        int contHomens = 0, contMulheres = 0;

        while (true) {
            System.out.print("\nDigite o sexo (M para Masculino, F para Feminino ou outro para sair): ");
            String sexo = scanner.next().toUpperCase();

            if (!sexo.equals("M") && !sexo.equals("F")) {
                System.out.println("\nSexo inválido digitado. Encerrando o programa...");
                break;
            }

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            if (sexo.equals("M")) {
                somaHomens += idade;
                contHomens++;
            } else {
                somaMulheres += idade;
                contMulheres++;
            }
        }

        double mediaHomens = contHomens > 0 ? (double) somaHomens / contHomens : 0;
        double mediaMulheres = contMulheres > 0 ? (double) somaMulheres / contMulheres : 0;

        System.out.printf("\nMédia de idade dos homens: %.2f\n", mediaHomens);
        System.out.printf("Média de idade das mulheres: %.2f\n", mediaMulheres);
    }
}