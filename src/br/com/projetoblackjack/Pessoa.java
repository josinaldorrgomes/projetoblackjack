package br.com.projetoblackjack;

import java.util.Date;

public class Pessoa extends Humano {
    
    private String cpf;
    private String estadoCivil;
    private String nacionalidade;
    
    public Pessoa(String nome, Date dataDeNascimento, String corDosOlhos, String nomeDoPai, String nomeDaMae) {
        super(nome, dataDeNascimento, corDosOlhos, nomeDoPai, nomeDaMae);
    }

    protected String getCpf() {
        return cpf;
    }

    protected void setCpf(String cpf) {
        this.cpf = cpf;
    }

    protected String getEstadoCivil() {
        return estadoCivil;
    }

    protected void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    protected String getNacionalidade() {
        return nacionalidade;
    }

    protected void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    public void mensagemVitoria() {
        System.out.println("Venci");
    }
}
