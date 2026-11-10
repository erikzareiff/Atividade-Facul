package List04;

import java.util.Scanner;

public class Atv06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do empréstimo: ");
        double valor = sc.nextDouble();

        System.out.print("Digite o valor da taxa de juros: ");
        double taxa = sc.nextDouble();

        double [] meses = new double [12];

        for (int i = 0; i < meses.length; i++) {

            int mes = i + 1;
            meses[i] = valor + valor * (taxa / 100) * mes;

            System.out.printf("Mes %d: R$ %.2f%n", mes,  meses[i]);
        }
        sc.close();

    }
}
