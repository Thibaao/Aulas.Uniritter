package Exercicios.Drive.Funcoes;

import java.util.Scanner;

public class RefLista03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numeros = new int[4];

        for (int i = 0; i < 4; i++) {
            numeros[i] = lerNumero(scanner, "Digite o " + (i + 1) + "º número inteiro: ");
        }

        float media = calcularMedia(numeros);

        exibirResultado(media);
    }

    public static int lerNumero(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    public static float calcularMedia(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        return soma / (float) numeros.length;
    }

    public static void exibirResultado(float media) {
        System.out.printf("A média aritmética é: %.2f\n", media);
    }
}
