package br.com.erik.lista02;

import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do usuário: ");
        String nome = sc.nextLine();

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        if (nome.equals("admin")) {
            if (senha.equals("java123")) {
                System.out.println("Acesso liberado!");
            }
            else {
                System.out.println("Senha invalida!");
            }

            }
        else {
            System.out.println("Usuário inválido!");

        }
        sc.close();
        }

    }


