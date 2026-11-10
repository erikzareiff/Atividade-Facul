package List06;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [][] m = new int[2][3];

        int pares = 0;

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.printf("Digite o número da posição [%d] [%d]: ", i, j);
                m[i][j] = sc.nextInt();

                if (m[i][j] % 2 == 0) {
                    pares++;

                }

            }
        }
        System.out.println();
        System.out.println("Quantidade de pares: "+ pares);

        sc.close();
    }
}
