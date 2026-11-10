package list05;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Exercicio06 {

    public static int contarVogais(String texto) {

        String minusculo = texto.toLowerCase();

        int contador = 0;

        for (int i = 0; i < minusculo.length(); i++) {

            char letra = minusculo.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {

                contador ++;

            }
        }
        return contador;

    }

    public static void exibirContagem(String[] frases) {

        String frasMaisVogais = frases[0];

        int maiorQtdVogais = contarVogais(frases[0]);

        for (int i = 0; i < frases.length; i++) {

            int qtdAtual = contarVogais(frases[i]);

            System.out.printf("Frase %d: %s = %d vogais%n", i + 1, frases[i], qtdAtual);

            if (qtdAtual > maiorQtdVogais) {

                maiorQtdVogais = qtdAtual;

                frasMaisVogais = frases[i];

            }

        }
        System.out.println();

        System.out.printf("Frase com mais vogais: %s (%d vogais)%n", frasMaisVogais, maiorQtdVogais);


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] frases = new String[3];

        for (int i = 0; i < frases.length; i++) {

            System.out.printf("Digite a %d frase: ", i +1);
            frases[i] = sc.nextLine();


        }
        System.out.println();

        exibirContagem(frases);

        sc.close();
    }

}
