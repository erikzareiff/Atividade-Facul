package List04;

import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de itens: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Quantidade inválida!");

        } else {

            double[] preco = new double[n];
            int[] quantidade = new int[n];

            double mulltItem = 0;
            double somaTotal = 0;
            double desconto = 0;

            for (int i = 0; i < n; i++) {

                System.out.printf("Valor do produto %d: ", i + 1);
                preco[i] = sc.nextDouble();

                System.out.printf("Quantidade do produto %d: ", i + 1);
                quantidade[i] = sc.nextInt();

                mulltItem = preco[i] * quantidade[i];
                somaTotal += mulltItem;


            }
            System.out.println();
            System.out.println("==============Subtotal===============");
            System.out.println();

            for (int i = 0; i < n; i++) {

                System.out.printf("Valor do produto %d: R$ %.2f%n", i + 1, (preco[i] * quantidade[i]));

            }


            if (somaTotal > 200) {

                desconto = somaTotal - (somaTotal * 0.05);

                System.out.println();
                System.out.println("======================Total====================");
                System.out.println();

                System.out.printf("Total com desconto: R$ %.2f", desconto);

            } else {

                System.out.println();
                System.out.println("======================Total====================");
                System.out.println();

                System.out.printf("Total sem desconto: R$ %.2f", somaTotal);
            }


        }
        sc.close();
    }
}
