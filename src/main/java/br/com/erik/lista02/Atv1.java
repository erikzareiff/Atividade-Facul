package br.com.erik.lista02;

import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 16) {
            System.out.println("Com essa idade você pode votar");

        }

        if (idade >= 18) {
            System.out.println("Com essa idade você pode dirigir");


        }

        if (idade >= 60) {
            System.out.println("Com essa idade você é idoso");

        }
        sc.close();
    }
}
