package br.com.erik.lista03;

import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Digite um número válido!");


        } else {

            int fatorial = 1;

            for (int i = 1; i <= num; i++) {
                fatorial = fatorial * i;


            }
            System.out.println(fatorial);

        }
        sc.close();


    }
}
