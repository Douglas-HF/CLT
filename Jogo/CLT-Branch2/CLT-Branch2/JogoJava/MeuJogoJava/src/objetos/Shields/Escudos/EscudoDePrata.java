package MeuJogoJava.src.objetos.Shields.Escudos;

import MeuJogoJava.src.objetos.Item;

public class EscudoDePrata extends Item {
    private int defesa;

    public EscudoDePrata(int nivel) {
        super("Escudo de Prata", 300, nivel);
        this.defesa = 25 * nivel;
    }

    @Override
    public String getTipo() {
        return "Escudo";
    }

    @Override
    public String getDescricao() {
        return "Um escudo de prata que oferece " + defesa + " de defesa.";
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
