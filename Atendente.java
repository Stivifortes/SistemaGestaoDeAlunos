package main;

import main.Dados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atendente {

    public class Main {

        private Scanner l;
        private boolean execute;
        private List<Dados> dados;

        private Main(int numeroAluno) {
            l = new Scanner(System.in);
            execute = true;
            dados = new ArrayList<Dados>();

            System.out.println("BEM VINDO AO CADASTRO DE ALUNOS");

            while (execute) {
                String opcao = menu();

                if (opcao.equalsIgnoreCase("n")) {
                    matricular();
                } else if (opcao.equalsIgnoreCase("l")) {
                    listarAlunos();
                } else if (opcao.equalsIgnoreCase("r")) {
                    anularMatricula(numeroAluno);
                } else if (opcao.equalsIgnoreCase("x")) {
                    execute = false;
                } else {
                    System.out.println("\nOpcao invalida !!! \n");
                }
            }
        }

        private String menu() {
            System.out.println("Selecione a opcao:");
            System.out.println("N - Matricular Aluno");
            System.out.println("L - Listar Alunos");
            System.out.println("R - Anular Matricula");
            System.out.println("X - Sair");
            return l.nextLine();
        }

        private void matricular() {
            boolean cadastrando = true;

            while (cadastrando) {
                System.out.println("C");
                Dados d = new Dados();

                d.setNomeAluno(textInput("Nome:"));

                d.setNomeCurso(textInput("Curso:"));

                d.setEmailAluno(textInput("Email: "));

                d.setEnderecoAluno(textInput("Endereco:"));

                Integer ano = Integer.valueOf(textInput("Ano Curso:"));
                d.setAnoCurso(ano);

                Double telefone = Double.valueOf(textInput("Telefone"));
                d.setTelefoneAluno(telefone);

                Integer numero = dados.size() + 1;
                d.setNumeroAluno(numero);

                String cadastrar = textInput("Adicionar Matricula (S/N) ?");
                if (cadastrar.equalsIgnoreCase("s")) {
                    System.out.println("Aluno Matriculado !!!");
                    dados.add(d);
                } else if (cadastrar.equalsIgnoreCase("n")) {
                    System.out.println("Matricula ignorado !!!");
                } else {
                    System.out.println("\nOpcao invalida!!! \n");
                }

                String continua = textInput("Continuar a Matricular (S/N) ?");
                if (continua.equalsIgnoreCase("N")) {
                    cadastrando = false;
                } else if (continua.equalsIgnoreCase("s")) {
                    // se for s sai do if e volta para o inicio do while
                } else {
                    System.out.println("\nOpcao invalida!!! \n");
                    cadastrando = false;
                }
            }
        }

        private void listarAlunos() {
           
           
           if (dados.size() == 0) {

                System.out.println("\nNao existem Alunos Matriculados !!!\n");

            } else {

               int cont = 0;
                String curso = textInput("Qual o curso?");

                Integer ano = Integer.valueOf(textInput("Qual o Ano do Curso:"));

                
                for (int i = 0; i < dados.size(); i++) {

                    Dados d = dados.get(i);
                    if (d.getAnoCurso() == ano && d.getNomeCurso() == curso && d.getMatriculado() == Boolean.TRUE) {
                        cont++;
                    }
                }

                if (cont == 0) {
                    System.out.println("\nSem Alunos");
                } else {

                    System.out.println("\nLista de Alunos do " + ano + "º Ano de " + curso + "\n");
                    for (int i = 0; i < dados.size(); i++) {
                        Dados d = dados.get(i);
                        System.out.println("\nMatricula numero: " + d.getNumeroAluno());
                        System.out.println("\tNome: " + d.getNomeAluno());
                        System.out.println("\nCurso: " + d.getNomeCurso());
                        System.out.println("\nAno Curso: " + d.getAnoCurso() + "º Ano");
                    }

                }

            }
        }

        private void anularMatricula(int numeroAluno) {

            
            for (int i = 0; i < dados.size(); i++) {

                if (numeroAluno == dados.get(i).getNumeroAluno()) {
                    dados.get(i).setMatriculado(Boolean.FALSE);
                }
            }
        }

        private String textInput(String label) {
            System.out.println(label);
            return l.nextLine();
        }
    }

}
