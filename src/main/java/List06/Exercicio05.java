package List06;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] m = new int[3][3];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.printf("Informe os valores da posição [%d] [%d]: ", i, j);
                m[i][j] = sc.nextInt();

            }

        }
        System.out.println();
        System.out.print("Diagonal principal: ");

        for (int i = 0; i < 3; i++) {

            System.out.print(m[i][i] + " ");
        }

        sc.close();
    }
}
