package br.com.erik.lista02;

import java.util.Scanner;

public class Atv15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Carro - 1 %nMoto - 2 %n");
        System.out.print("Selecione entre carro ou moto: ");
        int veiculo = sc.nextInt();

        double tarifa;

        switch (veiculo) {
            case 1 -> tarifa = 8;
            case 2 -> tarifa = 5;
            default -> {
                System.out.println("Opção invalida!");
                return;
            }
        }
        System.out.print("Digite a quantidade de horas: ");
        int horas = sc.nextInt();

        double tarifahora = horas * tarifa;
        double valor = tarifahora;

        System.out.printf("O valor das horas ficou R$ %.2f", valor);

        System.out.print("Você tem cupom de desconto sim ou não? ");
        String cupom = sc.next();

        if (cupom.equalsIgnoreCase("sim")) {
            if (valor >= 50){
                double desconto = valor *0.20;
                valor = valor - desconto;
                System.out.printf("O desconto R$ %.2f aplicado", desconto);

            } else {
                System.out.println("Desconto apenas para compras acima de R$ 50,00");

            }
            if (horas > 12) {
                System.out.println("Permanência longa");
            }
            if  (horas > 24) {
                System.out.println("Cobrança de diária");
            }



        }
        if (horas <= 2) {
            System.out.println("Permanência curta");

        } else if (horas <= 6) {
            System.out.println("Permanência média");

        } else {

            System.out.println("Permanência longa");
        }
        sc.close();


        }

    }

