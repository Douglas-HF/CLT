package Inimigos;

public class SoldadoDasSombras extends Inimigo {

    public SoldadoDasSombras(int level) {
        super("Soldado das Sombras", 70, 20, 200, level);
        setForca(4);
        setDestreza(3);
        setInteligencia(2);
        setSabedoria(2);
    }

    @Override
    public String getClasse() {
        return "Soldado das Sombras";
    }
}
