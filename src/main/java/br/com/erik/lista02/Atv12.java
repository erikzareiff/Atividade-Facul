package br.com.erik.lista02;

import java.util.Scanner;

public class Atv12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor que vocêr quer sacar hoje em R$: ");
        double valor = sc.nextDouble();

        System.out.print("Digite o valor do seu saldo em R$: ");
        double saldo = sc.nextDouble();

        System.out.print("Digite o valor do seu limite diário em R$: ");
        double limite = sc.nextDouble();



        if (valor > saldo) {
            System.out.printf("O valor solicitado para saque foi de R$ %.2f e o seu saldo é de R$ %.2f, saldo insuficiente!%n", valor, saldo);

        }
        else {
            if (valor > limite) {
                System.out.printf("O seu limite diário disponível é de R$ %.2f, limite indisponível!%n", limite);

            }
            else {
                double saque = saldo - valor;
                System.out.printf("Transação realizada com sucesso, seu saldo agora é de R$ %.2f%n", saque);

            }
        }
        sc.close();
    }
}
