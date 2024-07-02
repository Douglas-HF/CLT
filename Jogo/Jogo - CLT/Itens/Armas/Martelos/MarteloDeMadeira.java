package Itens.Armas.Martelos;

import Itens.Item;

public class MarteloDeMadeira extends Item {
    private int dano;

    public MarteloDeMadeira(int nivel) {
        super("Martelo de Madeira", 50, nivel);
        this.dano = 10 * nivel;
    }

    @Override
    public String getTipo() {
        return "Martelo";
    }

    @Override
    public String getDescricao() {
        return "Um martelo de madeira que causa " + dano + " de dano.";
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
}
