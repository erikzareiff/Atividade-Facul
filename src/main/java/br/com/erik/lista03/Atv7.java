package br.com.erik.lista03;

import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    System.out.print("Digite a quantidade de alunos: ");
    int qtdAlunos = sc.nextInt();

    if  (qtdAlunos < 1) {
        System.out.println("Quantidade inválida!");

    } else {

        double soma = 0;
        int acimaouIgualSeis = 0;
        int abaixoSeis = 0;

        for (int i = 1; i <= qtdAlunos; i++) {

            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = sc.nextDouble();

            soma = soma + nota;

            if (nota >= 6) {
                acimaouIgualSeis++;

            } else {
                abaixoSeis++;

            }


        }
        double media = soma / qtdAlunos;

        System.out.printf("A média é: %.2f%n ", media);
        System.out.println("Alunos com nota maior ou igual a 6: " + acimaouIgualSeis);
        System.out.println("Alunos com nota abaixo de 6: " + abaixoSeis);

    }



    }
}
