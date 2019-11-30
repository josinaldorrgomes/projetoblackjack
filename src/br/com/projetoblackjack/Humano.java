package br.com.projetoblackjack;

import java.util.Date;

public class Humano {

    protected String nome;
    protected Date dataDeNascimento;
    protected String corDosOlhos;
    protected String nomeDoPai;
    protected String nomeDaMae;

    public Humano(String nome, Date dataDeNascimento, String corDosOlhos, String nomeDoPai, String nomeDaMae) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.corDosOlhos = corDosOlhos;
        this.nomeDoPai = nomeDoPai;
        this.nomeDaMae = nomeDaMae;
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    protected void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    protected String getCorDosOlhos() {
        return corDosOlhos;
    }

    protected void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    protected String getNomeDoPai() {
        return nomeDoPai;
    }

    protected void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    protected String getNomeDaMae() {
        return nomeDaMae;
    }

    protected void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }
}
