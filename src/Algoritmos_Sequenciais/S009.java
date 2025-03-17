package Algoritmos_Sequenciais;

import java.util.Scanner;

public class S009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para que informe os coeficientes
        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        System.out.print("Digite o valor de d: ");
        double d = scanner.nextDouble();

        System.out.print("Digite o valor de e: ");
        double e = scanner.nextDouble();

        System.out.print("Digite o valor de f: ");
        double f = scanner.nextDouble();

        // Calcule o denominador comum
        double denominador = (a * e) - (b * d);

        // Verificar se o sistema de equações tem solucão
        if (denominador != 0) {
            // Calular os valores de x e y
            double x = (c * e - b * f) / denominador;
            double y = (a * f - c * d) / denominador;

        // Exibir os resultados
            System.out.printf("O valor de x é: %.2f%n", x);
            System.out.printf("O valor de y é: %.2f%n", y);
        } else {
            System.out.println("O sistema de equações não tem solução única! D: ");
        }
        scanner.close();
    }
}
