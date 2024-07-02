package Itens.Acessorios.Aneis;

import Itens.Item;

public class AnelDeOuro extends Item {
    private int bonusMagico;

    public AnelDeOuro(int nivel) {
        super("Anel de Ouro", 100, nivel);
        this.bonusMagico = 1 * nivel;
    }

    @Override
    public String getTipo() {
        return "Anel";
    }

    @Override
    public String getDescricao() {
        return "Um anel de ouro que aumenta o dano mágico em " + bonusMagico + ".";
    }

    public int getBonusMagico() {
        return bonusMagico;
    }

    public void setBonusMagico(int bonusMagico) {
        this.bonusMagico = bonusMagico;
    }
}
