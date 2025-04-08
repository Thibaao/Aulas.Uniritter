package Aula10_03;

import java.util.Scanner;

public class R008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número: ");

        int numero = scanner.nextInt();

        int fatorialFor = fatorialFor(numero);
        int fatorialWhile = fatorialWhile(numero);

        System.out.println("Fatorial For = "+fatorialFor);
        System.out.println("Fatorial While = "+fatorialWhile);
    }

    private static int fatorialWhile(int numero) {
        int fatorial = 1,
                fator = 1;

        while (fator <= numero){
            fatorial *= fator;
            fator++;
        }

        return fatorial;
    }

    private static int fatorialFor(int numero) {
        int fatorial = 1;

        for (int fator = 1; fator <= numero; fator++){
            fatorial = fatorial * fator;
        }

        return fatorial;
    }
}
