/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stiven_&_Linda
 */
public class GuardarCadastros {
    
    private String Nomeusuario;
    private String BI;
    private String email;
    private String Telefone;
    private String Endereco;
    private String Sexo;
    private String Curso;
    private String AnoCurso;

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public String getAnoCurso() {
        return AnoCurso;
    }

    public void setAnoCurso(String AnoCurso) {
        this.AnoCurso = AnoCurso;
    }
    
    
    
    
    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
    

    public String getNomeusuario() {
        return Nomeusuario;
    }

    public void setNomeusuario(String Nomeusuario) {
        this.Nomeusuario = Nomeusuario;
    }

    public String getBI() {
        return BI;
    }

    public void setBI(String BI) {
        this.BI = BI;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }
    
    //GUARDAR OS DADOS NO FIXEIRO TEXTO
    
    public String Guardar(){
        try {
            try (FileWriter fw = new FileWriter("Alunos_Cadastrados.txt", true); PrintWriter pw = new PrintWriter(fw)) {
                
                pw.println("Nome: "+ this.Nomeusuario);
                pw.println("Sexo: " + this.Sexo);
                pw.println("BI: "+ this.BI);
                pw.println("Curso: "+ this.Curso);
                pw.println("Ano Curso: "+ this.AnoCurso);
                pw.println("Telefone: "+ this.Telefone);
                pw.println("E_mail: "+ this.email);
                pw.println("Endereco: " + this.Endereco);
                
                pw.println();
                pw.flush();
            }
            
            
            System.out.println(this.Nomeusuario);
           

        } catch (IOException ex) {
            Logger.getLogger(GuardarCadastros.class.getName()).log(Level.SEVERE, null, ex);
        }
    return "Aluno Matriculado com sucesso";
   
}

    public void getnome(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
        
    }

}
