package List04;

import java.util.Scanner;

public class Atv05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double [] preco = new double [5];
        double [] desconto = new double [5];

        for (int i = 0; i < preco.length; i++) {

            System.out.printf("Digite o preço do %dº item: ",  i + 1);
            preco[i] = sc.nextDouble();
            desconto[i] = preco[i] - (preco[i] * 0.1);

        }

        for (int i = 0; i < desconto.length; i++) {

        System.out.printf("O preço do produto %d: sem desconto é R$ %.2f e com desconto é R$ %.2f%n", i + 1, preco[i], desconto[i]);

        }
        sc.close();

    }
}
