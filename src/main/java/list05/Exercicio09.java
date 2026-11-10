package list05;

import java.util.Scanner;

public class Exercicio09 {

    public static long potencia(int base, int expoente) {

        if (expoente == 0) {
            return 1;

        }

        return base * potencia(base, expoente - 1);
    }

    public static void exibirPotencias(int[] bases, int expoente) {

        for (int i = 0; i < bases.length; i++) {

            long resultado = potencia(bases[i], expoente);

            System.out.printf("%d^%d = %d%n", bases[i], expoente, resultado);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] bases = new int[5];

        System.out.print("Digite o expoente: ");
        int expoente = sc.nextInt();

        for (int i = 0; i < bases.length; i++) {

            System.out.printf("Digite a %dª base: ", i + 1);
            bases[i] = sc.nextInt();
        }

        System.out.println();

        exibirPotencias(bases, expoente);

        sc.close();
    }
}