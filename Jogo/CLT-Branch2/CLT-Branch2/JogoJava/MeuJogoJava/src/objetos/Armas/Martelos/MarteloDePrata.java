package MeuJogoJava.src.objetos.Armas.Martelos;

import MeuJogoJava.src.objetos.Item;

public class MarteloDePrata extends Item {
    private int dano;

    public MarteloDePrata(int nivel) {
        super("Martelo de Prata", 100, nivel);
        this.dano = 15 * nivel;
    }

    @Override
    public String getTipo() {
        return "Martelo";
    }

    @Override
    public String getDescricao() {
        return "Um martelo de prata que causa " + dano + " de dano.";
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
}
