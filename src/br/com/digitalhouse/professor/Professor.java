package br.com.digitalhouse.professor;

import java.util.Objects;

public class Professor {

    private String nome;
    private String sobrenome;
    private Integer tmpDeCasa;
    private Integer cdProfessor;

    public Professor(String nome, String sobrenome, Integer tmpDeCasa, Integer cdProfessor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tmpDeCasa = tmpDeCasa;
        this.cdProfessor = cdProfessor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Professor){
            return ((Professor) obj).getCdProfessor().equals(this.getCdProfessor());
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getTmpDeCasa() {
        return tmpDeCasa;
    }

    public void setTmpDeCasa(Integer tmpDeCasa) {
        this.tmpDeCasa = tmpDeCasa;
    }

    public Integer getCdProfessor() {
        return cdProfessor;
    }

    public void setCdProfessor(Integer cdProfessor) {
        this.cdProfessor = cdProfessor;
    }
}
