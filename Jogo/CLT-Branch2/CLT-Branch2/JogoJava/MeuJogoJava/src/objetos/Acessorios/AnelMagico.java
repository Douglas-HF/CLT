package MeuJogoJava.src.objetos.Acessorios;

import MeuJogoJava.src.objetos.Item;

public class AnelMagico extends Item {
    private int bonusMagico;

    public AnelMagico(int nivel) {
        super("Anel Mágico", 300, nivel);
        this.bonusMagico = 3 * nivel;
    }

    @Override
    public String getTipo() {
        return "Anel";
    }

    @Override
    public String getDescricao() {
        return "Um anel mágico que aumenta o dano mágico em " + bonusMagico + ".";
    }

    public int getBonusMagico() {
        return bonusMagico;
    }

    public void setBonusMagico(int bonusMagico) {
        this.bonusMagico = bonusMagico;
    }
}
