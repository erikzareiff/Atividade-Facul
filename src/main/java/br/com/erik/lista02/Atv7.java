package br.com.erik.lista02;

import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora do dia: ");
        int hora = sc.nextInt();

        if (hora >= 0 &&  hora <= 11) {
            System.out.print("Bom dia ");

        }
        else if (hora >= 12 && hora <= 17) {
            System.out.print("Boa tarde!");

        }
        else if (hora >= 18 && hora <= 23) {
            System.out.print("Boa noite!");
        }
        else {
            System.out.print("Hora invalida!");

        }
        sc.close();
    }
    }

