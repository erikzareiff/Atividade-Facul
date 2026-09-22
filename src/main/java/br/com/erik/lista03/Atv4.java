package br.com.erik.lista03;

import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        do {

            System.out.printf("Escolha as opções abaixo %n1 para dobro %n2 para metade %n3 para quadrado %n0 para sair%n");

            System.out.print("Escolha a opção: ");
            n = sc.nextInt();

            switch (n) {
                case 0 -> System.out.println("Sair");

                case 1 -> {
                    System.out.print("Digite um número para saber o dobro: ");
                    double dobro =  sc.nextDouble();
                    System.out.println("O dobro de "+ dobro + " é " + (dobro * 2));
                }

                case 2 -> {
                    System.out.print("Digite o número para saber a metade: ");
                    double metade =  sc.nextDouble();
                    System.out.println("A metade de " + metade + " é "+ (metade / 2));
                }

                case 3 -> {
                    System.out.print("Digite o número para saber o quadrado: ");
                    double quadrado =  sc.nextDouble();
                    System.out.println("O quadrado de " + quadrado + " é " + (quadrado * quadrado));

                }

                default -> System.out.println("Opção Inválida");

            }
        }

        while (n != 0) ;

        sc.close();

        }
    }

