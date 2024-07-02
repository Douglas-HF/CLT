package MeuJogoJava.src.objetos.Shields.Armaduras;

import MeuJogoJava.src.objetos.Item;

public class ArmaduraDePrata extends Item {
    private int defesa;

    public ArmaduraDePrata(int nivel) {
        super("Armadura de Prata", 300, nivel);
        this.defesa = 25 * nivel;
    }

    @Override
    public String getTipo() {
        return "Armadura";
    }

    @Override
    public String getDescricao() {
        return "Uma armadura de prata que oferece " + defesa + " de defesa.";
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
