package Exercicios.Drive.Sequenciais;

import java.util.Scanner;

public class Lista04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int x  = scanner.nextInt();

        int quadrado = x * x;
        int restoDiv3 = x % 3;
        float metade = x / 2.0f;
        float produtoCommetade = x * metade;

        System.out.println("Conteúdo de x: " + x);
        System.out.println("Quadrado de x: " + quadrado);
        System.out.println("Resto da divisão inteira por x por 3: " + restoDiv3);
        System.out.printf("Metade de x: %.2f\n", metade);
        System.out.printf("Produto de X pela metade de x: %.2f\n", produtoCommetade);
    }
}