package br.com.projetoblackjack;

public class Teste {

    public static void main(String[] args) throws ExcecaoBaralhoVazio {
        
        Baralho baralho = new Baralho();
        baralho.listarCartas();
        baralho.embaralhar();
        baralho.listarCartas();
        baralho.pegarCarta();
        baralho.pegarCarta();

    }
}
