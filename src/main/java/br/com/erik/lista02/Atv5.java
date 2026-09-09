package br.com.erik.lista02;

import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.println("O ano " + ano + " é ano bissexto");

        } else {
            System.out.println("O ano " + ano +" não é ano bissexto");

        }
        sc.close();
    }
}
