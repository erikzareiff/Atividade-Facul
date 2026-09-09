package lista01;

import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite a sua altura: ");
        double altura = sc.nextDouble();

        System.out.print("O seu nome é " + nome + ", a sua idade é " + idade + ", e sua altura é " + altura);

        sc.close();
    }
}

