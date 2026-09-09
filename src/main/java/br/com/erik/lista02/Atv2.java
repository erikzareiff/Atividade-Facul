package br.com.erik.lista02;

import  java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();


        if (n > 0) {
            System.out.println("É positivo");


        }
        if (n % 2 == 0) {
            System.out.println("É par");

        }
        if (n % 5 == 0) {
            System.out.println("É múltiplo de 5");


        }
        if (Math.abs(n) >= 10 && Math.abs(n) <= 99 ) {
            System.out.println("Tem dois digitos");

        }
        sc.close();

    }
}