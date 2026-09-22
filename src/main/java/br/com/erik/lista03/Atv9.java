package br.com.erik.lista03;

import java.util.Scanner;

public class Atv9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Digite um número de 1 a 9: ");
        int n = sc.nextInt();

        if (n < 1 || n > 9) {

            System.out.println("Entrada inválida!");

        } else {

            for (int i = 1; i <= n; i++) {

                System.out.println("Tabuada do " + i);

                for (int j = 1; j <= 10; j++) {

                    int resultado = i * j;

                    System.out.println(
                            i + " x " + j + " = " + resultado
                    );
                }

                System.out.println();
            }
        }

        sc.close();
    }
}