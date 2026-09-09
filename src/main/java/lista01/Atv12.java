package lista01;

import java.util.Scanner;

public class Atv12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o consumo de energia em kWh: ");
        double consumo = sc.nextDouble();

        double preco;

        if (consumo <= 100) {
            preco = 0.5;

        } else if (consumo <= 300){
            preco = 0.75;

        } else{
            preco = 1.10;
        }

        double valor =  preco * consumo;

        System.out.printf("Com o consumo de %.0fkWh o gasto por kWh fica %.2f e o valor total da conta é %.2f%n", consumo, preco, valor);

        sc.close();
    }
}
