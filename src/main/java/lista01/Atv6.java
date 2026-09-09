package lista01;

import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Fale o raio para saber a área e perímetro: ");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;

        System.out.printf("Para o raio de %.2f a área é de %.2f e o perímetro é %.2f%n", raio, area, perimetro);
        sc.close();

    }
}
