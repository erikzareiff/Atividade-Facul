package List04;

import java.util.Scanner;

public class Atv08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int aprovados;
        int reprovados;
        int recuperacao;

        double [] nota = new double [10];

        for (int i = 0; i < nota.length; i++) {

            System.out.printf("Digite a nota do %dº aluno: ", (i + 1));
            nota[i] = sc.nextDouble();


        }
        aprovados = 0;
        reprovados = 0;
        recuperacao = 0;

        for (int i = 0; i < nota.length; i++) {

            if (nota[i] >= 6) {
                aprovados++;

            } else if (nota[i] < 6 && nota[i] >= 4 ) {
                recuperacao++;

            } else {
                reprovados++;

            }

        }
        System.out.printf("Aprovados: %d\nReprovados: %d\nRecuperação: %d\n", aprovados, reprovados, recuperacao );

        sc.close();
    }
}
