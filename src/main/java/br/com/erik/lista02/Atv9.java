package br.com.erik.lista02;

import java.util.Scanner;

public class Atv9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quanto tempo em anos você tem de empresa? ");
        int ano = sc.nextInt();

        System.out.print("Qual o seu salário? ");
        double salario = sc.nextDouble();

        double bonus = 0.0;
        int percentual = 0;

        if (ano < 1) {

            System.out.print("Com o tempo menor que 1 ano você não terá bônus!");

        }
        else if (ano <= 3) {
            bonus = salario * 0.05;
            percentual = 5;
            System.out.printf("Com o tempo de %d ano (s) você tem direito a %d%% de bônus, o valor do bônus ficará R$ %.2f%n ", ano, percentual, bonus);

        }
        else if (ano <= 10) {
            bonus = salario * 0.1;
            percentual = 10;
            System.out.printf("Com o tempo de %d ano (s) você tem direito a %d%% de bônus, o valor do bônus ficará R$ %.2f%n ", ano, percentual, bonus);

        }
        else{
            bonus = salario * 0.15;
            percentual = 15;
            System.out.printf("Com o tempo de %d ano (s) você tem direito a %d%% de bônus, o valor do bônus ficará R$ %.2f%n ", ano, percentual, bonus);

        }
        sc.close();
    }
}
