package Itens.Shields.Escudos;

import Itens.Item;

public class EscudoDeFerro extends Item {
    private int defesa;

    public EscudoDeFerro(int nivel) {
        super("Escudo de Ferro", 150, nivel);
        this.defesa = 20 * nivel;
    }

    @Override
    public String getTipo() {
        return "Escudo";
    }

    @Override
    public String getDescricao() {
        return "Um escudo de ferro que oferece " + defesa + " de defesa.";
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
