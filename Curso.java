public class Curso {

    private String nomeCurso;
    private int anoCurso;


    //Metodo Construtor
    public Curso(String nomeCurso, int anoCurso) {
        this.nomeCurso = nomeCurso;
        this.anoCurso = anoCurso;
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
}
