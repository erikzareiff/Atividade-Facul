package List04;

import java.util.Scanner;

public class Atv09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] codigos = {101, 205, 310, 420, 550};
        double [] precos = {4.50, 12.00, 7.90, 25.00, 3.20};


        System.out.print("Digite o codigo do produto: ");
        int buscarCodigo = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < codigos.length; i++){

            if (codigos[i] == buscarCodigo){
                System.out.printf("Preço do produto: R$ %.2f%n", precos[i]);
                encontrado = true;

            }
        }
        if (!encontrado){
            System.out.println("O produto não foi encontrado");
        }
        sc.close();


    }
}
