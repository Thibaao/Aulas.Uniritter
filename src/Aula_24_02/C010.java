package Aula_24_02;

import java.util.Scanner;

public class C010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float nota1, nota2, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = input.nextFloat();

        System.out.print("Digite a segunda nota: ");
        nota2 = input.nextFloat();

        media = (nota1 + nota2 )/2;

        if (media >=7){
            System.out.print("Parabéns! Você foi aprovado!");}
        else {
            System.out.print("Infelizmente, você foi reprovado.");
        }
    }
}