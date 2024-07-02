package MeuJogoJava.src.objetos.Armas.Martelos;

import MeuJogoJava.src.objetos.Item;

public class MarteloDeDiamante extends Item {
    private int dano;

    public MarteloDeDiamante(int nivel) {
        super("Martelo de Diamante", 200, nivel);
        this.dano = 20 * nivel;
    }

    @Override
    public String getTipo() {
        return "Martelo";
    }

    @Override
    public String getDescricao() {
        return "Um martelo de diamante que causa " + dano + " de dano.";
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
}
