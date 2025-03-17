package Exercícios_PDF.Lista01;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtdHomens, qtdMulheres, qtdCriancas, totalCarne;
        int mediaHomens = 650, mediaMulheres = 420, mediaCriancas = 290;

        System.out.println("Digite o número de convidados homens: ");
        qtdHomens = input.nextInt();
        System.out.println("Digite o número de convidados mulheres: ");
        qtdMulheres = input.nextInt();
        System.out.println("Digite o número de convidados criancas: ");
        qtdCriancas = input.nextInt();

        totalCarne = (qtdHomens * mediaHomens) + (qtdMulheres * mediaMulheres) + (qtdCriancas * mediaCriancas);

        System.out.println("Quantidade de carne sugerida em gramas é: " + totalCarne);
    }
}