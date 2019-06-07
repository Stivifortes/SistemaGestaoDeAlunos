package main;

import main.Dados;
import main.Atendente;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(in);
        int opcao = 3;
        boolean sair = false;

        while (!sair) {
            out.println("\n*****Welcome*****\n"
                    + "Escolhe um usuario digitando:"
                    + "\n1 - Aluno"
                    + "\n2 - Atendente\n" + "3 - Sair");

            //Pegar a opcao escolhida
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Bem vindo ao Portal do Aluno!");

                    //implementar metodo listarAluno
                    break;
                    
                case 2:
                    out.println("Usuario:\n");
                    String usuario = ler.nextLine();

                    out.println("Senha: \n");
                    String senha = ler.nextLine();

                    //implementar class Atendente
                    break;
                    
                case 3:
                    sair = false;
                    break;
                    
                default:
                    throw new IllegalStateException("Unexpected value: " + opcao);
            }
        }
    }
}
