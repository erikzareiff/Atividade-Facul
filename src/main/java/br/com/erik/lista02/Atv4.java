package br.com.erik.lista02;

import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("Não será possível calcular!");

        } else if (a % b == 0) {
            System.out.println("O número " + a + " é múltiplo do número " + b);



        } else {
            System.out.println("O número " + a + " não é múltiplo do número " + b);
        }

        sc.close();
    }
}
