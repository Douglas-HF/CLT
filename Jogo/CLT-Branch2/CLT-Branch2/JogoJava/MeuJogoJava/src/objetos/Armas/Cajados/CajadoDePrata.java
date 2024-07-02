package MeuJogoJava.src.objetos.Armas.Cajados;

import MeuJogoJava.src.objetos.Item;

public class CajadoDePrata extends Item {
    private int consumoMana;

    public CajadoDePrata(int nivel) {
        super("Cajado de Prata", 100, nivel);
        this.consumoMana = 15 * nivel;
    }

    @Override
    public String getTipo() {
        return "Cajado";
    }

    @Override
    public String getDescricao() {
        return "Um cajado de prata que consome " + consumoMana + " de mana.";
    }

    public int getConsumoMana() {
        return consumoMana;
    }

    public void setConsumoMana(int consumoMana) {
        this.consumoMana = consumoMana;
    }
}
