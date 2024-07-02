package MeuJogoJava.src.objetos.Armas.Espadas;

import MeuJogoJava.src.objetos.Item;

public class EspadaDeDiamante extends Item {
    private int dano;

    public EspadaDeDiamante(int nivel) {
        super("Espada de Diamante", 200, nivel);
        this.dano = 20 * nivel;
    }

    @Override
    public String getTipo() {
        return "Espada";
    }

    @Override
    public String getDescricao() {
        return "Uma espada de diamante que causa " + dano + " de dano.";
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
}