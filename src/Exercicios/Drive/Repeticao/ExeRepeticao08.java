package Exercicios.Drive.Repeticao;

public class ExeRepeticao08 {
    public static void main(String[] args) {
        int contadorPrimos = 0;
        int numero = 101;

        System.out.println("50 primeiros números primos maiores que 100:");

        while (contadorPrimos < 50) {
            if (ehPrimo(numero)) {
                System.out.println(numero);
                contadorPrimos++;
            }
            numero++;
        }
    }

    public static boolean ehPrimo(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}