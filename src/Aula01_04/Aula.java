package Aula01_04;

import java.util.Scanner;

public class Aula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] a = {{1, 2}, {3, 4, 5}};
        System.out.println("Imprimindo matriz a 2x3");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%d", a[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}