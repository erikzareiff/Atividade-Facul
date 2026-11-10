package List04;

import java.util.Scanner;

public class Atv07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double [] salarios = new double [6];

        double maiorSalario;
        double menorSalario;
        double mediaSalario;
        double soma = 0;
        int quantidadeMedia = 0;

        for (int i = 0; i < salarios.length; i++){

            System.out.printf("Digite o salário do %dº funcionário: ", i + 1);
            salarios[i] = sc.nextDouble();

            soma += salarios[i];



        }

        mediaSalario = soma / salarios.length;

        maiorSalario = salarios[0];
        menorSalario = salarios[0];



        for (int i = 0; i < salarios.length; i++) {

            if (salarios[i] > maiorSalario) {
                maiorSalario = salarios[i];

            }
            if (salarios[i] < menorSalario) {
                menorSalario = salarios[i];

            }
            if (salarios[i] > mediaSalario) {
                quantidadeMedia++;

            }

        }
        System.out.printf("Maior salário: R$ %.2f%nMenor salário: R$ %.2f%nMédia: R$ %.2f%nQuantos funcionários ganham acima da média: %d", maiorSalario, menorSalario, mediaSalario, quantidadeMedia);

        sc.close();
    }
}
