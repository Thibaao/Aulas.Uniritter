package Exercicios.Drive.Lista_OO_Basico.Exe005;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("12345-6");
        conta.depositar(500);
        conta.sacar(100);
        System.out.println("Saldo final: " + conta.getSaldo());
    }
}