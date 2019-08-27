package br.com.digitalhouse.principal;

import br.com.digitalhouse.aluno.Aluno;
import br.com.digitalhouse.curso.Curso;
import br.com.digitalhouse.manager.DigitalHouseManager;
import br.com.digitalhouse.professor.Professor;
import br.com.digitalhouse.professor.ProfessorAdjunto;
import br.com.digitalhouse.professor.ProfessorTitular;

import java.util.List;

public class Principal {

    public static void main(String[] args) {

        DigitalHouseManager novaAlocacao = new DigitalHouseManager();
        novaAlocacao.registrarProfessorTitular("Jessica",
                "da Silva", 1, "Android");
        novaAlocacao.registrarProfessorAdjunto("João",
                "José", 2,  80);

        novaAlocacao.registrarProfessorAdjunto("João",
                "José", 2,  80);

        novaAlocacao.registrarCurso("Full Stack", 20001, 3);
        novaAlocacao.registrarCurso("Android", 20002, 2);

        novaAlocacao.alocarProfessores(20001, 1, 2);
        novaAlocacao.alocarProfessores(20002, 1, 2);

        novaAlocacao.matricularAluno("Lionel", "Messi", 10);
        novaAlocacao.matricularAluno("Cristiano", "Ronaldo", 7);
        novaAlocacao.matricularAluno("Ronaldo", "Nazario", 9);


        novaAlocacao.matricularAluno(10, 20001);
        novaAlocacao.matricularAluno(7, 20001);

        novaAlocacao.matricularAluno(10, 20002);
        novaAlocacao.matricularAluno(7, 20002);
        novaAlocacao.matricularAluno(9, 20002);
    }

}
