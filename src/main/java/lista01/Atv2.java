package lista01;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o primeiro número inteiro: ");
        int num = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();

        System.out.println("A soma é: " + (num+num2));
        System.out.println("A subtração:  " + (num-num2));
        System.out.println("Multiplicação: " +  (num*num2));
        System.out.println("Divisão: " +  (num/num2));
        System.out.println("Resto: " +  (num%num2));

        sc.close();
    }
}
