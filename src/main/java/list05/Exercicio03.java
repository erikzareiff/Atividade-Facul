package list05;

import java.util.Scanner;

public class Exercicio03 {

    public static boolean ehPrimo(int numero) {

        if (numero <= 1) {

            return false;

        }

        for (int i = 2; i < numero; i++) {

            if (numero % i == 0) {

                return false;

            }

        }
        return true;


    }

    public static int contarPrimos(int[] v) {

        int contador = 0;

        for (int i = 0; i < v.length; i++) {

            if (ehPrimo(v[i])) {

                contador++;

            }

        }
        return contador;

    }

    public static void exibirPrimos(int[] v) {

        System.out.println("Os números primos são:");

        for (int i = 0; i < v.length; i++) {

            if (ehPrimo(v[i])) {

                System.out.println(v[i] + " ");


            }


        }
        System.out.println();

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {

            System.out.printf("Digite o %dº número inteiro: ", i + 1);
            numeros[i] = sc.nextInt();

        }

        exibirPrimos(numeros);

        int totalPrimos = contarPrimos(numeros);

        System.out.printf("A quantidade total de primos são: %d%n", totalPrimos);

        sc.close();
    }
}

