package br.com.digitalhouse.aluno;

public class Aluno {

    private String nome;
    private String sobrenome;
    private Integer cdAluno;



    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Aluno){
            return ((Aluno) obj).getCdAluno().equals(this.getCdAluno());
        }
        return false;
    }

    public Aluno(String nome, String sobrenome, Integer cdAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cdAluno = cdAluno;
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

    public Integer getCdAluno() {
        return cdAluno;
    }

    public void setCdAluno(Integer cdAluno) {
        this.cdAluno = cdAluno;
    }
}
