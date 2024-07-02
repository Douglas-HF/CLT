package Itens.Armas.Espadas;

import Itens.Item;

public class EspadaDeMadeira extends Item {
    private int dano;

    public EspadaDeMadeira(int nivel) {
        super("Espada de Madeira", 50, nivel);
        this.dano = 10 * nivel;
    }

    @Override
    public String getTipo() {
        return "Espada";
    }

    @Override
    public String getDescricao() {
        return "Uma espada de madeira que causa " + dano + " de dano.";
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
}
