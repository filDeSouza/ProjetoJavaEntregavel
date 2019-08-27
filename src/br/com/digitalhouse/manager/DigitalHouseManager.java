package br.com.digitalhouse.manager;

import br.com.digitalhouse.aluno.Aluno;
import br.com.digitalhouse.curso.Curso;
import br.com.digitalhouse.matricula.Matricula;
import br.com.digitalhouse.professor.Professor;
import br.com.digitalhouse.professor.ProfessorAdjunto;
import br.com.digitalhouse.professor.ProfessorTitular;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listaAlunos = new ArrayList<>();
    private List<Professor> listaProfessores = new ArrayList<>();
    private List<Curso> listaCursos = new ArrayList<>();
    private List<Matricula> listaMatriculas = new ArrayList<>();


    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos){


        Curso novoCurso = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);
        if (!listaCursos.contains(novoCurso)){
            listaCursos.add(novoCurso);
            System.out.println("Curso inserido com sucesso!");
        }else {
            System.out.println("O curso já existe");
        }

    }

    public void excluirCurso(Integer codigoCurso){

        int valor = 0;
        for (int i = 0; i < listaCursos.size(); i++){
            if (codigoCurso == listaCursos.get(i).getCdCurso()){
                listaCursos.remove(i);
                System.out.println("Curso excluído com sucesso!");
                valor = 1;
            }
        }
        if (valor == 0){
            System.out.println("Não há cursos com o código informado!");
        }

    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras){

        ProfessorAdjunto novoProfessorAdjunto = new ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantidadeDeHoras);

        if (!listaProfessores.contains(novoProfessorAdjunto)){
            this.listaProfessores.add(novoProfessorAdjunto);
            System.out.println("Professor inserido com sucesso!");
        }else {
            System.out.println("O professor já existe");
        }


    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade){

        ProfessorTitular novoProfessorTitular = new ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade);

        if (!listaProfessores.contains(novoProfessorTitular)){
            this.listaProfessores.add(novoProfessorTitular);
            System.out.println("Professor inserido com sucesso!");
        }else {
            System.out.println("O professor já existe");
        }


    }

    public void excluirProfessor(Integer codigoProfessor){

        int valor = 0;
        for (int i = 0; i < listaProfessores.size(); i++){
            if (codigoProfessor == listaProfessores.get(i).getCdProfessor()){
                listaProfessores.remove(i);
                System.out.println("Professor excluído com sucesso!");
                valor = 1;
            }
        }
        if (valor == 0){
            System.out.println("Não há professores com o códigpo informado!");
        }
    }


    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno){

        Aluno novoAluno = new Aluno(nome, sobrenome, codigoAluno);
        listaAlunos.add(novoAluno);
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){


        for (int i = 0; i < listaCursos.size(); i++){

            if (codigoCurso == listaCursos.get(i).getCdCurso().intValue()){
                System.out.println("Qtde maxima 1: "+ (listaCursos.get(i).getAlunosMatriculados().size()));
                System.out.println("Qtde maxima 2: "+ listaCursos.get(i).getQtdeMaxAlunos().intValue());
                if ((listaCursos.get(i).getAlunosMatriculados().size()) < listaCursos.get(i).getQtdeMaxAlunos().intValue()){
                    for (int l = 0; l < listaAlunos.size(); l++){

                        if (codigoAluno == listaAlunos.get(l).getCdAluno()){
                            Aluno novoAluno = new Aluno(listaAlunos.get(l).getNome(),
                                    listaAlunos.get(l).getSobrenome(), listaAlunos.get(l).getCdAluno());
                            Curso novoCurso = new Curso(listaCursos.get(i).getNome(),
                                    listaCursos.get(i).getCdCurso(), listaCursos.get(i).getQtdeMaxAlunos());

                            Matricula novaMatricula = new Matricula(novoAluno, novoCurso);
                            listaMatriculas.add(novaMatricula);
                            listaCursos.get(i).setAlunosMatriculados(novoAluno);
                            System.out.println("Matrícula realizada com sucesso");
                        }
                    }
                }else {
                    System.out.println("Não foi possível realizar a matrícula porque não há mais vagas disponíveis neste curso!");
                }
            } //aqui
            //novoCurso.setAlunosMatriculados(novoAluno);
        }
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){

        for (int valor1 = 0; valor1 < listaCursos.size(); valor1++){
            if (listaCursos.get(valor1).getCdCurso() == codigoCurso){
                for (int valor2 = 0; valor2 < listaProfessores.size(); valor2++){
                    if (listaProfessores.get(valor2).getCdProfessor() == codigoProfessorTitular){
                        listaCursos.get(valor2).setProfessorTitular((ProfessorTitular) listaProfessores.get(valor2));
                    }
                    if (listaProfessores.get(valor2).getCdProfessor() == codigoProfessorAdjunto){
                        listaCursos.get(valor2).setProfessorAdjunto((ProfessorAdjunto) listaProfessores.get(valor2));
                    }
                }
            }
        }


    }



    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public List<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public void setListaProfessores(List<Professor> listaProfessores) {
        this.listaProfessores = listaProfessores;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public List<Matricula> getListaMatriculas() {
        return listaMatriculas;
    }

    public void setListaMatriculas(List<Matricula> listaMatriculas) {
        this.listaMatriculas = listaMatriculas;
    }
}
