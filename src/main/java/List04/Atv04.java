package List04;

import java.util.Scanner;

public class Atv04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double [] precos = new double[5];

        double soma = 0.0;

        for (int i = 0; i < precos.length; i++) {

            System.out.printf("Digite o preço do produto %d :", i + 1);
            precos[i] = sc.nextDouble();

            soma += precos[i];

        }

        for (int i = 0; i < precos.length; i++) {

            System.out.printf("Os preços dos produtos são: Produto %d R$ %.2f%n", i + 1, precos[i] );

        }
        System.out.printf("O valor total é R$ %.2f%n", soma);
    }

}
