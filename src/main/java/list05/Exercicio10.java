package list05;

import java.util.Scanner;

public class Exercicio10 {

    public static int fibonacci(int n) {

        if (n == 0) {

            return 0;

        }

        if (n == 1) {

            return 1;

        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static int somar(int[] v) {

        int total = 0;

        for (int i = 0; i < v.length; i++) {
            total += v[i];

        }

        return total;

    }

    public static void exibir(int[] v) {

        for (int i = 0; i < v.length; i++) {

            System.out.print(v[i] + " ");

        }

        System.out.println();

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite N (de 1 a 30): ");
        int n = sc.nextInt();

        if (n < 1 || n > 30) {

            System.out.println("quantidade inválida");

            sc.close();

            return;
        }

        int[] v = new int[n];

        for (int i = 0; i < v.length; i++) {

            v[i] = fibonacci(i);

        }

        System.out.println();

        exibir(v);

        System.out.println("Soma: " + somar(v));

        sc.close();
    }
}