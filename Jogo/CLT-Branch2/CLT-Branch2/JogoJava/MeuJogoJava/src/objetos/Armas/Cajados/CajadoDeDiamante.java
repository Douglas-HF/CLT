package MeuJogoJava.src.objetos.Armas.Cajados;


import MeuJogoJava.src.objetos.Item;

public class CajadoDeDiamante extends Item {
    private int consumoMana;

    public CajadoDeDiamante(int nivel) {
        super("Cajado de Diamante", 200, nivel);
        this.consumoMana = 20 * nivel;
    }

    @Override
    public String getTipo() {
        return "Cajado";
    }

    @Override
    public String getDescricao() {
        return "Um cajado de diamante que consome " + consumoMana + " de mana.";
    }

    public int getConsumoMana() {
        return consumoMana;
    }

    public void setConsumoMana(int consumoMana) {
        this.consumoMana = consumoMana;
    }
}

