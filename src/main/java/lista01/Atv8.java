package lista01;

import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os graus Celsius: ");
        double celsius = sc.nextDouble();

        double f = celsius * 1.8 + 32;
        double k = celsius + 273.15;

        System.out.printf("Fahrenheit: %.2f%n", f);
        System.out.printf("Kelvin: %.2f%n", k);
        sc.close();

    }
}
