package Estruturas_De_Repeticao;

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdadesHomens = 0, somaIdadesMulheres = 0;
        int contadorHomens = 0, contadorMulheres = 0;

        while (true) {
            // Solicitar o sexo
            System.out.print("Digite o sexo (M para Masculino, F para Feminino ou qualquer outro para sair): ");
            String sexo = scanner.next().toUpperCase(); // Converter para maiúsculas para evitar problemas

            // Verificar se é um sexo válido
            if (!sexo.equals("M") && !sexo.equals("F")) {
                System.out.println("Sexo inválido. Encerrando o programa...");
                break;
            }

            // Solicitar a idade
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            // Acumular soma e contagem de acordo com o sexo
            if (sexo.equals("M")) {
                somaIdadesHomens += idade;
                contadorHomens++;
            } else if (sexo.equals("F")) {
                somaIdadesMulheres += idade;
                contadorMulheres++;
            }
        }

        // Calcular e exibir as médias
        if (contadorHomens > 0) {
            System.out.println("Média de idade dos homens: " + (double) somaIdadesHomens / contadorHomens);
        } else {
            System.out.println("Nenhum homem foi registrado.");
        }

        if (contadorMulheres > 0) {
            System.out.println("Média de idade das mulheres: " + (double) somaIdadesMulheres / contadorMulheres);
        } else {
            System.out.println("Nenhuma mulher foi registrada.");
        }

        scanner.close();
    }
}