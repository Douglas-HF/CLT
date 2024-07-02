package MeuJogoJava.src.objetos.Armas.Cajados;


import MeuJogoJava.src.objetos.Item;

public class CajadoDeMadeira extends Item {
    private int consumoMana;

    public CajadoDeMadeira(int nivel) {
        super("Cajado de Madeira", 50, nivel);
        this.consumoMana = 10 * nivel;
    }

    @Override
    public String getTipo() {
        return "Cajado";
    }

    @Override
    public String getDescricao() {
        return "Um cajado de madeira que consome " + consumoMana + " de mana.";
    }

    public int getConsumoMana() {
        return consumoMana;
    }

    public void setConsumoMana(int consumoMana) {
        this.consumoMana = consumoMana;
    }
}
