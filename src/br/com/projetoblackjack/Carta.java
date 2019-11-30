package br.com.projetoblackjack;

public class Carta {

    private String numero;
    private String naipe;
    private int valor;

    public Carta() {
        this.numero = "0";
        this.naipe = "fake";
        this.valor = 0;
    }

    public Carta(String numero_, String naipe_, int valor_) {
        this.numero = numero_;
        this.naipe = naipe_;
        this.valor = valor_;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}
