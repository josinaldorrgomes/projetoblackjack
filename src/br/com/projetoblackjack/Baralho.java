package br.com.projetoblackjack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Baralho {

    private List<Carta> cartas;

    public Baralho() {

        cartas = new LinkedList<>();
        String numero = "0";
        String naipe = "fake";
        int valor = 0;
        int contador = 0;
        for (int num = 1; num < 14; num++) {
            for (int naip = 1; naip < 5; naip++) {
                Carta carta = new Carta();
                switch (num) {
                    case 1:
                        numero = "A";
                        valor = 1;
                        break;
                    case 11:
                        numero = "J";
                        valor = 11;
                        break;
                    case 12:
                        numero = "Q";
                        valor = 12;
                        break;
                    case 13:
                        numero = "K";
                        valor = 13;
                        break;
                    default:
                        numero = String.valueOf(num);
                        valor = num;
                        break;
                }

                switch (naip) {
                    case 1:
                        naipe = "Paus";
                        break;
                    case 2:
                        naipe = "Ouros";
                        break;
                    case 3:
                        naipe = "Copas";
                        break;
                    case 4:
                        naipe = "Espadas";
                        break;
                    default:
                        naipe = "fake";
                        break;
                }
                carta.setNumero(numero);
                carta.setNaipe(naipe);
                carta.setValor(valor);
                this.cartas.add(carta);
                contador++;
            }
        }
    }

    public void listarCartas() {
        for (int i = 0; i < 52; i++) {
            System.out.println(cartas.get(i).getNumero() + " de " + cartas.get(i).getNaipe() + ". Valor: " + cartas.get(i).getValor());
        }
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    public void pegarCarta() throws ExcecaoBaralhoVazio {
        try {
            if (cartas.size() > 0) {
                Carta c = cartas.remove(0);
                System.out.println("Carta retirada: " + c.getNumero() + " de " + c.getNaipe());
            }
        } catch (Exception e) {
            new RuntimeException("Baralho vazio!", e);
        }
    }

}
