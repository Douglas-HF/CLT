package MeuJogoJava.src.objetos.Armas.Espadas;

import MeuJogoJava.src.objetos.Item;

public class EspadaDePrata extends Item {
    private int dano;

    public EspadaDePrata(int nivel) {
        super("Espada de Prata", 100, nivel);
        this.dano = 15 * nivel;
    }

    @Override
    public String getTipo() {
        return "Espada";
    }

    @Override
    public String getDescricao() {
        return "Uma espada de prata que causa " + dano + " de dano.";
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
}
