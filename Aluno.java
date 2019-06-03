public class Aluno {

    private String nomeAluno;
    private String loginAluno;
    private String senhaAluno;
    private Curso nomeCurso;

    //Getters e setters
    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getLoginAluno() {
        return loginAluno;
    }

    public void setLoginAluno(String loginAluno) {
        this.loginAluno = loginAluno;
    }

    public String getSenhaAluno() {
        return senhaAluno;
    }

    public void setSenhaAluno(String senhaAluno) {
        this.senhaAluno = senhaAluno;
    }

    public Curso getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(Curso nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
}
