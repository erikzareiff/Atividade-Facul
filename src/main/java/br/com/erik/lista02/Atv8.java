package br.com.erik.lista02;

import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a velocidade do veículo em Kmh? ");
        double veloveic = sc.nextDouble();

        System.out.print("Qual a velocidade máxima da via em Kmh? ");
        double velomax = sc.nextDouble();

        if (veloveic <= velomax) {
            System.out.printf("A velocidade permitida é %.2f kmh, e o carro estava a %.2f    kmh, não cobra multa", velomax, veloveic);

        }
        else if (veloveic <= velomax * 1.20) {
            System.out.printf("A velocidade permitida é %.2f, e o carro estava a %.2f, multa média!", velomax, veloveic);

        }
        else if (veloveic <= velomax * 1.50) {
            System.out.printf("A velocidade permitida é %.2f, e o carro estava a %.2f, multa grave!", velomax, veloveic);
        }
        else {
            System.out.printf("A velocidade permitida é %.2f, e o carro estava a %.2f, multa gravissima!", velomax, veloveic);
        }
        sc.close();
    }
}
