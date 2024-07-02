package Itens.Shields.Escudos;

import Itens.Item;

public class EscudoDeMadeira extends Item {
    private int defesa;

    public EscudoDeMadeira(int nivel) {
        super("Escudo de Madeira", 50, nivel);
        this.defesa = 10 * nivel;
    }

    @Override
    public String getTipo() {
        return "Escudo";
    }

    @Override
    public String getDescricao() {
        return "Um escudo de madeira que oferece " + defesa + " de defesa.";
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
