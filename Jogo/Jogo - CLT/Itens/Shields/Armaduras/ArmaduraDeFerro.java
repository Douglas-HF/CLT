package Itens.Shields.Armaduras;

import Itens.Item;

public class ArmaduraDeFerro extends Item {
    private int defesa;

    public ArmaduraDeFerro(int nivel) {
        super("Armadura de Ferro", 150, nivel);
        this.defesa = 20 * nivel;
    }

    @Override
    public String getTipo() {
        return "Armadura";
    }

    @Override
    public String getDescricao() {
        return "Uma armadura de ferro que oferece " + defesa + " de defesa.";
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
