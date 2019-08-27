package br.com.digitalhouse.professor;

public class ProfessorAdjunto extends Professor {

    private Integer qtdeHrMonitoria;

    public ProfessorAdjunto(String nome, String sobrenome, Integer tmpDeCasa, Integer cdProfessor, Integer qtdeHrMonitoria) {
        super(nome, sobrenome, tmpDeCasa, cdProfessor);
        this.qtdeHrMonitoria = qtdeHrMonitoria;
    }


    public Integer getQtdeHrMonitoria() {
        return qtdeHrMonitoria;
    }

    public void setQtdeHrMonitoria(Integer qtdeHrMonitoria) {
        this.qtdeHrMonitoria = qtdeHrMonitoria;
    }
}
