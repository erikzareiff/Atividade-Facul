package br.com.erik.lista03;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n;

        do {
            System.out.print("Digite um numero entre 0 a 10: ");
            n = sc.nextDouble();

            if (n < 0 || n > 10) {
                System.out.println("Número inválido, digite um numero entre 0 a 10: ");

            }
        } while (n < 0 || n > 10);
            System.out.println("O número " + n + " é válido.");


            sc.close();


        }
    }
