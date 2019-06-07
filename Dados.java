package main;

import main.Atendente;

public class Dados {

    private String nomeAluno;
    private Double numeroAluno;
    private String emailAluno;
    private String enderecoAluno;
    private Double telefoneAluno;
    private String nomeCurso;
    private int anoCurso;
    private Boolean matriculado = Boolean.TRUE;

    public Boolean getMatriculado() {
        return matriculado;
    }

    public void setMatriculado(Boolean matriculado) {
        this.matriculado = matriculado;
    }

    //Getters e Setters
    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public Double getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
        numeroAluno = numeroAluno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }

    public String getEnderecoAluno() {
        return enderecoAluno;
    }

    public void setEnderecoAluno(String enderecoAluno) {
        this.enderecoAluno = enderecoAluno;
    }

    public Double getTelefoneAluno() {
        return telefoneAluno;
    }

    public void setTelefoneAluno(Double telefoneAluno) {
        this.telefoneAluno = telefoneAluno;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getAnoCurso() {
        return anoCurso;
    }

    public void setAnoCurso(int anoCurso) {
        this.anoCurso = anoCurso;
    }

//    private void listarAlunos() {
//        if (dados.size() == 0) {
//            System.out.println("\nNao existem Alunos Matriculados !!!\n");
//        } else {
//            System.out.println("\nLista de Alunos:\n");
//            for (int i = 0; i < dados.size(); i++) {
//                Dados d = dados.get(i);
//                System.out.println("Matricula numero: " + i + 1);
//                System.out.println("\tNome: " + d.getNomeAluno());
//                System.out.println("\nCurso: " + d.getNomeCurso());
//                System.out.println("\nAno Curso: " + d.getAnoCurso());
//
//            }
//            System.out.println("\nFim da lista\n");
//        }
//    }
}
