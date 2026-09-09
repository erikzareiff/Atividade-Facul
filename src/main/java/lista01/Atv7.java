package lista01;

import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = sc.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);
        double diagonal = Math.sqrt( Math.pow(altura, 2) + Math.pow(base, 2) );

        System.out.printf("Base: %.2f%n", base);
        System.out.printf("Altura: %.2f%n", altura);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimetro: %.2f%n", perimetro);
        System.out.printf("Diagonal: %.2f%n", diagonal);
        sc.close();

    }
}

