package scr.objetos.Shields.Mantos;

import scr.objetos.Itens;

public class MantoMagico extends Itens {
    private int defesa;

    public MantoMagico(int nivel) {
        super("Manto Mágico", 200, nivel);
        this.defesa = 15 * nivel;
    }

    @Override
    public String getTipo() {
        return "Manto";
    }

    @Override
    public String getDescricao() {
        return "Um manto mágico que oferece " + defesa + " de defesa.";
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
