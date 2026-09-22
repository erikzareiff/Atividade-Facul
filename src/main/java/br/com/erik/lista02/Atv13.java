package br.com.erik.lista02;

import java.util.Scanner;

public class Atv13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.printf("Digite 1 para somar %nDigite 2 para subtrair %nDitige 3 para multiplicar %nDigite 4 para dividir %n");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> System.out.println("O resultado da soma " + (n1 + n2));
            case 2 -> System.out.print("O resultado da subtração é " + (n1 - n2));
            case 3 -> System.out.print("O resultado da multiplição é " + (n1 * n2));
            case 4 -> {
                if (n2 == 0) {
                  System.out.println("Impossivel dividir por zero!");

                } else {
                    System.out.println("O resultado da divisão é " + (n1 / n2));
                }
            }
            default -> System.out.print("Opção inválida");

        }
        sc.close();

    }
}
