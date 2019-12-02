package br.com.projetoblackjack;

import java.util.Date;
import java.util.Scanner;

public class Mesa {

    private Jogador jogador1;
    private Jogador jogador2;
    private Baralho baralho;
    private int pontosJogador1;
    private int pontosJogador2;

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

    public void jogar() throws ExcecaoBaralhoVazio {
        try {
            do {
                Scanner entrada = new Scanner(System.in);
                System.out.println("Degite 1 para puxar uma carta ou 2 para passar a jogada:");
                int opcao = entrada.nextInt();
                switch (opcao) {
                    case 1:
                        if (pontosJogador1 < 21) {
                            baralho.pegarCarta();
                            pontosJogador1 += baralho.pegarCarta();
                            mostrarPlacar();
                        } else {
                            System.out.println("O jogador 2 " + mensagemVitoria());
                        }
                        break;
                    case 2:
                        if (pontosJogador2 < 21) {
                            baralho.pegarCarta();
                            pontosJogador2 += baralho.pegarCarta();
                            mostrarPlacar();
                        } else {
                            System.out.println("O jogador 1 " + mensagemVitoria());
                        }
                        break;
                }
                baralho.embaralhar();
            } while (baralho.getCartas().size() > 0);
        } catch (Exception e) {
            new RuntimeException("Ocorreu um erro no método jogar!", e);
        }
    }

    public void mostrarPlacar() {
        System.out.println("-----Placar-----");
        System.out.println(jogador1.getNome() + ": " + pontosJogador1 + " pontos");
        System.out.println(jogador2.getNome() + ": " + pontosJogador2 + " pontos");
        System.out.println("----------------");
    }

    public String mensagemVitoria() {
        return "venceu!!!";
    }
}
