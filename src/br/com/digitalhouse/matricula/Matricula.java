package br.com.digitalhouse.matricula;

import br.com.digitalhouse.aluno.Aluno;
import br.com.digitalhouse.curso.Curso;

import java.util.Date;

public class Matricula {

    private Date dtMatricula;

    public Matricula(Aluno novoAluno, Curso novoCurso) {
        this.dtMatricula = new Date();
        Aluno aluno = novoAluno;
        Curso curso = novoCurso;
    }

    public Date getDtMatricula() {
        return dtMatricula;
    }

    public void setDtMatricula(Date dtMatricula) {
        this.dtMatricula = dtMatricula;
    }

}
