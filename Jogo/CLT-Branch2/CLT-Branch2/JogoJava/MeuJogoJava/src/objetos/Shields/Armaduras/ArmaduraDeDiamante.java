package MeuJogoJava.src.objetos.Shields.Armaduras;

import MeuJogoJava.src.objetos.Item;

public class ArmaduraDeDiamante extends Item {
    private int defesa;

    public ArmaduraDeDiamante(int nivel) {
        super("Armadura de Diamante", 500, nivel);
        this.defesa = 30 * nivel;
    }

    @Override
    public String getTipo() {
        return "Armadura";
    }

    @Override
    public String getDescricao() {
        return "Uma armadura de diamante que oferece " + defesa + " de defesa.";
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
