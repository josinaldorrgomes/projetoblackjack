package br.com.projetoblackjack;

import java.util.Date;

public class Mesa {

    private Jogador jogador1;
    private Jogador jogador2;
    private Baralho baralho;

    public Mesa() {
        this.jogador1 = new Jogador("João da Silva", new Date(1900, 01, 10), "Castanho", "Silva", "Silva", "silva@gmail.com");
        this.jogador2 = new Jogador("Maria da Silva", new Date(1900, 01, 10), "verde", "Silva", "Silva", "silva@gmail.com");
    }

    Mesa(Jogador jogador1, Jogador jogador2, Baralho baralho) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.baralho = baralho;
    }

    public String getNomeJogador1() {
        return this.jogador1.getNome();
    }

    public String getNomeJogador2() {
        return this.jogador2.getNome();
    }

    protected void imprimeDadosJogador1() {
        System.out.println(jogador1.imprimeDadosJogador());
    }

    protected void imprimeDadosJogador2() {
        System.out.println(jogador2.imprimeDadosJogador());
    }

    public void listarCartas() {
        listarCartas();
    }

    public void embaralhar() {
        embaralhar();
    }

    protected void pegarCarta() {
        pegarCarta();
    }
}
