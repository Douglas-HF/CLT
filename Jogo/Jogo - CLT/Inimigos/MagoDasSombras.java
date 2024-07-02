package Inimigos;

public class MagoDasSombras extends Inimigo {

    public MagoDasSombras(int level) {
        super("Mago das Sombras", 60, 50, 300, level);
        setForca(2);
        setDestreza(3);
        setInteligencia(5);
        setSabedoria(4);
    }

    @Override
    public String getClasse() {
        return "Mago das Sombras";
    }
}
