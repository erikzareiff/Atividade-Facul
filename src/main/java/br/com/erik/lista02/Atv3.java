package br.com.erik.lista02;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em ºC: ");
        double temp = sc.nextDouble();

        System.out.print("Digite a umidade relativa do ar: ");
        double r = sc.nextDouble();

        if (temp >= 38) {
            System.out.println("Alerta de calor extremo");

        }
        if (r < 30) {
            System.out.println("Alerta de umidade baixa");

        }
        if (temp >= 35 && r < 20) {
            System.out.println("Risco de queimada");

        }
        sc.close();
    }

    }