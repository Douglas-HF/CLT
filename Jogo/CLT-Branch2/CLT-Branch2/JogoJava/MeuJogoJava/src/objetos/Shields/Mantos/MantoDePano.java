package MeuJogoJava.src.objetos.Shields.Mantos;

import MeuJogoJava.src.objetos.Item;

public class MantoDePano extends Item {
    private int defesa;

    public MantoDePano(int nivel) {
        super("Manto de Pano", 50, nivel);
        this.defesa = 5 * nivel;
    }

    @Override
    public String getTipo() {
        return "Manto";
    }

    @Override
    public String getDescricao() {
        return "Um manto de pano que oferece " + defesa + " de defesa.";
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
