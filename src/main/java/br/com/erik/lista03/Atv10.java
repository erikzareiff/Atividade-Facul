package br.com.erik.lista03;

import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo;
        int quantidadeItens = 0;
        double total = 0;

        do {
            System.out.print("Digite o código do produto ou 0 para sair: ");
            codigo = sc.nextInt();

            if (codigo != 0) {

                System.out.print("Digite o preço unitário: ");
                double preco = sc.nextDouble();

                System.out.print("Digite a quantidade: ");
                int quantidade = sc.nextInt();

                double subtotal = preco * quantidade;

                total += subtotal;
                quantidadeItens += quantidade;
            }

        } while (codigo != 0);

        System.out.println("1 - Dinheiro");
        System.out.println("2 - Débito");
        System.out.println("3 - Crédito");
        System.out.print("Escolha a forma de pagamento: ");
        int pagamento = sc.nextInt();

        switch (pagamento) {

            case 1 -> total = total - (total * 0.05);

            case 2 -> {
                // sem alteração
            }

            case 3 -> total = total + (total * 0.03);

            default -> System.out.println("Forma de pagamento inválida!");
        }

        if (total > 300) {
            System.out.println("Aviso: compra grande.");
        }

        if (quantidadeItens > 20) {
            System.out.println("Aviso: muitos itens.");
        }

        System.out.printf("Total final: R$ %.2f%n", total);

        sc.close();
    }
}