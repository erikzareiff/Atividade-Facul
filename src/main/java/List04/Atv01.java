package List04;

import java.util.Scanner;

public class Atv01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double [] notas = {7.5, 6.0, 8.0, 5.5};

        System.out.println("Quantidade total de notas: " + notas.length);
        System.out.println("Primeira nota: " + notas[0]);
        System.out.println("Última nota: " + notas[notas.length - 1]);

        sc.close();
    }
}
