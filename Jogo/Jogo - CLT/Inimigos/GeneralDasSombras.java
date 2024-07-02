package Inimigos;

public class GeneralDasSombras extends Inimigo {

    public GeneralDasSombras(int level) {
        super("General das Sombras", 100, 30, 500, level);
        setForca(5);
        setDestreza(4);
        setInteligencia(3);
        setSabedoria(3);
    }

    @Override
    public String getClasse() {
        return "General das Sombras";
    }
}
