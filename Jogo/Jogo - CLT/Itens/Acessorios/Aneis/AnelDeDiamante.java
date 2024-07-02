package Itens.Acessorios.Aneis;

import Itens.Item;

public class AnelDeDiamante extends Item {
    private int bonusMagico;

    public AnelDeDiamante(int nivel) {
        super("Anel de Diamante", 200, nivel);
        this.bonusMagico = 2 * nivel;
    }

    @Override
    public String getTipo() {
        return "Anel";
    }

    @Override
    public String getDescricao() {
        return "Um anel de diamante que aumenta o dano mágico em " + bonusMagico + ".";
    }

    public int getBonusMagico() {
        return bonusMagico;
    }

    public void setBonusMagico(int bonusMagico) {
        this.bonusMagico = bonusMagico;
    }
}
