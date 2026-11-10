package list05;

import java.util.Scanner;

public class Exercicio07 {

    public static String gerarIniciais(String nomeCompleto) {

        String[] palavras = nomeCompleto.trim().toUpperCase().split(" ");

        String iniciais = "";

        for (int i = 0; i < palavras.length; i++) {

            if (palavras[i].length() > 0) {

                iniciais = iniciais + palavras[i].charAt(0) + ".";


            }
        }
        return iniciais;
    }

    public static void exibirChamada(String[] nomes) {

        for (int i = 0; i < nomes.length; i++) {

            String iniciaisAluno = gerarIniciais(nomes[i]);

            System.out.printf("%d. %s (%s)%n", i + 1, nomes[i], iniciaisAluno);

        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[4];

        for (int i = 0; i < nomes.length; i++ ) {

            System.out.printf("Digite o nome completo do %dª aluno: ", i + 1);
            nomes[i] = sc.nextLine();

        }

        System.out.println();

        exibirChamada(nomes);

        sc.close();

    }
}
