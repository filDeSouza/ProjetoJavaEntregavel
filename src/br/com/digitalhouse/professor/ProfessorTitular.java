package br.com.digitalhouse.professor;

public class ProfessorTitular extends Professor {



    private String especialidade;

    public ProfessorTitular(String nome, String sobrenome, Integer tmpDeCasa, Integer cdProfessor, String especialidade) {
        super(nome, sobrenome, tmpDeCasa, cdProfessor);
        this.especialidade = especialidade;
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
