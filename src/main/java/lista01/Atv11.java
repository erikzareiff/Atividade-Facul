package lista01;

import java.util.Scanner;

public class Atv11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int n2 = sc.nextInt();

        System.out.print("Digite o terceiro inteiro: ");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("O número " + n1 + " é o maior!" );

        } else if (n2 > n3) {
            System.out.println("O número " + n2 + " é o maior!");

        } else{
            System.out.println("O número " + n3 + " é o maior");

        }
        sc.close();
    }
}
