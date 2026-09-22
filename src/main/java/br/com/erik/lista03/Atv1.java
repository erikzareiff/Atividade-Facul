package br.com.erik.lista03;

import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Não há valores para exibir!");

        }
        else {

            int contador = 1;

            while (contador <= n) {

                System.out.println(contador);

                contador++;


            }
        }
        sc.close();

    }

}
