package List04;

import java.util.Scanner;

public class Atv03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double [] notas = new double[4];
        double soma = 0;
        double media = 0;

        for (int i = 0; i < notas.length; i++) {

            System.out.printf("Digite a %d nota: ", i + 1);
            notas[i] = sc.nextDouble();

            soma += notas[i];

        }

        media = soma / notas.length;

        if (media >= 6) {
            System.out.printf("A sua média é %.2f e você está APROVADO",  media);

        } else {
            System.out.printf("A sua média é %.2f e você está REPROVADO",  media);
        }
        sc.close();


    }
}
