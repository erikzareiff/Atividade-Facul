package br.com.erik.lista03;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        {

            System.out.print("Digite o valor para saber a tabuada: ");
            int num = sc.nextInt();

            if (num < 1) {
                System.out.println("Valor inválido");

            }
            else {

                int contador = 0;

                while (contador < 10) {
                    contador ++;
                    int resultado = num * contador;

                    System.out.println(num + " x " + contador + " = " + resultado);
                }
            }
            sc.close();

        }
    }
}