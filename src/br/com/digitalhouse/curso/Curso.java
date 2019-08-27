package br.com.digitalhouse.curso;

import br.com.digitalhouse.aluno.Aluno;
import br.com.digitalhouse.professor.ProfessorAdjunto;
import br.com.digitalhouse.professor.ProfessorTitular;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private Integer cdCurso;
    private Integer qtdeMaxAlunos;
    private List<Aluno> listaAlunosMatriculados = new ArrayList<>();
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Curso){
            return ((Curso) obj).getCdCurso().equals(this.getCdCurso());
        }
        return false;
    }

    public Curso(String nome, Integer cdCurso, Integer qtdeMaxAlunos) {
        this.nome = nome;
        this.cdCurso = cdCurso;
        this.qtdeMaxAlunos = qtdeMaxAlunos;
    }

    public boolean adicionarUmAluno (Aluno umAluno){

        if (qtdeMaxAlunos >= listaAlunosMatriculados.size()){
            listaAlunosMatriculados.add(umAluno);
            System.out.println("Lista de alunos: "+ listaAlunosMatriculados.size());
            System.out.println("Aluno adicionado");
            return true;
        }else{
            System.out.println("Não há vagas disponíveis");
            return false;
        }

    }

    public void excluirAluno(Aluno umAluno){
        int valor = 0;
        for (int i = 0; i < listaAlunosMatriculados.size(); i++){
            if (umAluno.getCdAluno() == listaAlunosMatriculados.get(i).getCdAluno()){
                listaAlunosMatriculados.remove(i);
                System.out.println("Aluno excluído com sucesso!");
                valor = 1;
            }
        }
        if (valor == 0){
            System.out.println("Não há alunos com o códigpo informado!");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCdCurso() {
        return cdCurso;
    }

    public void setCdCurso(Integer cdCurso) {
        this.cdCurso = cdCurso;
    }

    public Integer getQtdeMaxAlunos() {
        return qtdeMaxAlunos;
    }

    public void setQtdeMaxAlunos(Integer qtdeMaxAlunos) {
        this.qtdeMaxAlunos = qtdeMaxAlunos;
    }

    public List<Aluno> getAlunosMatriculados() {
        return listaAlunosMatriculados;
    }

    public void setAlunosMatriculados(Aluno alunosMatriculados) {
        this.listaAlunosMatriculados.add(alunosMatriculados);
    }

    public List<Aluno> getListaAlunosMatriculados() {
        return listaAlunosMatriculados;
    }


    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }
}
