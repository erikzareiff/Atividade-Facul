package lista01;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em R$ : ");
        double valorrs = sc.nextDouble();

        System.out.print("Digite o valor em $ da cotação de hoje: ");
        double valorcota = sc.nextDouble();

        double valUS =  valorrs / valorcota;

        System.out.printf("O valor de R$ %.2f equivalem a $ %.2f%n", valorrs, valUS);
        sc.close();

    }
}

