package br.com.projetoblackjack;

import java.util.Date;

public class Jogador extends Pessoa {

    private String email;

    public Jogador(String nome, Date dataDeNascimento, String corDosOlhos, String nomeDoPai, String nomeDaMae, String email) {
        super(nome, dataDeNascimento, corDosOlhos, nomeDoPai, nomeDaMae);
        this.email = email;
    }

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected String imprimeDadosJogador() {
        return "Jogador{" + "nome = " + nome + "\n"
                + "Data de nascimento = " + dataDeNascimento + "\n"
                + "Cor dos olhos = " + corDosOlhos + "\n"
                + "Nome do Pai = " + nomeDoPai + "\n"
                + "Nome da Mãe = " + nomeDaMae + "\n"
                + "E-mail = " + email
                + '}';
    }

    @Override
    public void mensagemVitoria() {
        System.out.println("Venci! O outro jogador muito noob!");
    }
}
