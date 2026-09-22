package br.com.erik.lista02;

import java.util.Scanner;

public class Atv11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a % da frequência: ");
        double frequencia = sc.nextDouble();

        System.out.print("Digite a sua média: ");
        double media = sc.nextDouble();

        if (frequencia < 75) {
            System.out.println("Você está reprovado por falta!");

        }
        else {

            if (media >= 7) {
                System.out.printf("Você tirou %.2f de média, você está aprovado!%n", media);

            }
            else if (media >= 5) {
                System.out.printf("Você tirou %.2f de média, você está de recuperação!%n", media);

            }
            else {
                System.out.printf("Você tirou %.2f de média, você está reprovado!%n", media);

            }

        }
        sc.close();
    }

}
