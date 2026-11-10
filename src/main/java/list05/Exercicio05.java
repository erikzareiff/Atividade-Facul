package list05;

import java.util.Scanner;

public class Exercicio05 {

    public static String paraBinario(int n) {

        if (n == 0) {

            return "0";

        }

        String binario = "";

        while (n > 0) {

            int resto = n % 2;

            binario = resto + binario;

            n = n / 2;

        }

        return binario;

    }

    public static void exibirTabela(int [] v) {

        for (int i = 0; i < v.length; i++) {

            String resultadoBinario = paraBinario(v[i]);

            System.out.printf("%d = %s%n", v[i], resultadoBinario);

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] numero = new int[5];

        for (int i = 0; i < numero.length; i++) {

            System.out.printf("Digite o número %dº número: ", i + 1);
            numero[i] = sc.nextInt();


        }
        System.out.println();

        exibirTabela(numero);

        sc.close();
    }
}

