package br.com.erik.lista03;

import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    int num = 0;
    int quantidade = 0;
    int soma = 0;
    int maior = 0;
    int menor = 0;

    System.out.println("Digite um número inteiro ou digite 0 para sair: ");
    num = sc.nextInt();

    if ( num == 0) {
        System.out.println("Nenhum resultado foi lido!");

    } else {
        maior = num;
        menor = num;

        while (num != 0) {

            quantidade++;
            soma = soma + num;

            if (num > maior) {
                maior = num;

            }

            if (num < menor) {
                menor = num;

            }

            System.out.println("Digite outro número ou digite 0 para sair: ");
            num = sc.nextInt();

        }
        System.out.println("Quantidade de valores: " + quantidade);
        System.out.println("Soma: " + soma);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

    }
    sc.close();


    }
}
