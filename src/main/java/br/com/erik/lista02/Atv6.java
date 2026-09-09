package br.com.erik.lista02;

import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra em R$:  ");
        double compra = sc.nextDouble();

        double frete;

        double total;

        if (compra >= 199.00) {
            frete = 0.00;
            total = compra + frete;
            System.out.printf("O valor do frete é R$ %.2f e o valor total vai ficar R$ %.2f%n", frete, compra);

        }
        else {
            frete = 24.90;
            total = compra + frete;
            System.out.printf("O valor do frete é R$ %.2f e o valor somado com o frete ficou R$ %.2f%n", frete, total);

        }
        sc.close();
    }
}
