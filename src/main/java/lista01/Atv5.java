package lista01;

import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o valor da hora trabalhada em R$? ");
        double valortrab =  sc.nextDouble();

        System.out.print("Qual a quantidade de horas trabalhadas por mês? ");
        double horastrab =  sc.nextDouble();

        double salario = valortrab * horastrab;

        double inss = salario * 0.08;

        double liquido = salario - inss;

        System.out.printf("O seu salário é de R$ %.2f e com o desconto do INSS no valor de R$ %.2f ele fica R$ %.2f%n", salario, inss, liquido);
        sc.close();
    }
}
