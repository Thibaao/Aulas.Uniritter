package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir para o usuário informar seu ano de nascimento
        System.out.print("Digite o seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        // Pedir para o usuário informar o ano atual
        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        // Calcular idade do usuário
        int idade = anoAtual - anoNascimento;

        // Exibir a idade do usuário
        System.out.println("A idade do usuário é " + idade + " Anos de idade.");

        scanner.close();
    }
}
