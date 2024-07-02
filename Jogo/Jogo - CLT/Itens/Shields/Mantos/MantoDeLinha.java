package Itens.Shields.Mantos;

import Itens.Item;

public class MantoDeLinha extends Item {
    private int defesa;

    public MantoDeLinha(int nivel) {
        super("Manto de Linha", 100, nivel);
        this.defesa = 10 * nivel;
    }

    @Override
    public String getTipo() {
        return "Manto";
    }

    @Override
    public String getDescricao() {
        return "Um manto de linha que oferece " + defesa + " de defesa.";
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
