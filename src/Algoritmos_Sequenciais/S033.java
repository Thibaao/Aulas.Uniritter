package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar dados do funcionário
        System.out.print("Digite o nome do funcionário: ");
        String nomeFuncionario = scanner.nextLine();

        System.out.print("Digite o salário bruto: R$");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Digite o número de dependentes: ");
        int numDependentes = scanner.nextInt();

        // Calcular o desconto do INSS de acordo com a faixa salarial
        double descontoINSS;
        if (salarioBruto <= 300) {
            descontoINSS = salarioBruto * 0.08;
        } else if (salarioBruto <= 700) {
            descontoINSS = salarioBruto * 0.09;
        } else {
            descontoINSS = salarioBruto * 0.10;
        }

        // Definindo os valores constantes
        double valorDependente = 15.00;
        double auxilioPassagem = 40.00;
        double auxilioRefeicao = 100.00;

        // Cálculo do sálario líquido
        double salarioLiquido = salarioBruto - descontoINSS + (valorDependente * numDependentes) + auxilioPassagem + auxilioRefeicao;

        // Exibir resultado
        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}