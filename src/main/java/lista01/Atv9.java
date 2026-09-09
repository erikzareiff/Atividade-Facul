package lista01;

import java.util.Scanner;

public class Atv9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro para saber se é par ou ímpar: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {

            System.out.println("O número " + n + " é par");

        } else {
            System.out.println("O número " + n + " é ímpar");
        }
        sc.close();

    }
}

