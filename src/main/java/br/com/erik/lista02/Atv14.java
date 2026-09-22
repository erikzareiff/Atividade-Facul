package br.com.erik.lista02;

import java.util.Scanner;

public class Atv14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("1- Janeiro %n2- Fevereiro %n3 – Março %n4 – Abril %n5 – Maio %n6 – Junho %n07 – Julho %n08 – Agosto %n9 – Setembro %n10 – Outubro %n11 – Novembro %n12 – Dezembro%n");
        System.out.print("Digite o número do mês desejado: ");
        int mes = sc.nextInt();


        switch (mes) {

            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Esse mês tem 31 dias!");
            case 4, 6, 9, 11 -> System.out.println("Esse mês tem 30 dias!");
            case 2 -> System.out.println("Esse mês tem 28 dias!");
            default -> System.out.println("Opção invalida!");

        }

        sc.nextLine();

    }
}
