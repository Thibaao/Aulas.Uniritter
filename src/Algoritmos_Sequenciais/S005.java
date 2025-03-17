package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário um número inteiro
        System.out.print("Digite um número de valor inteiro: ");
        int numero = scanner.nextInt();

        // Calcular as informações solicitadas na questão
        int dobro = numero * 2;
        double tercaParte = numero / 3.0;
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        // Exibir os resultados
        System.out.println("O dobro do número digitado é: " + dobro);
        System.out.println("A terça parte do número digitado é: " + tercaParte);
        System.out.println("O antecessor do número digitado é: " + antecessor);
        System.out.println("O aucessor do número digitado é: " + sucessor);

        scanner.close();
    }
}
