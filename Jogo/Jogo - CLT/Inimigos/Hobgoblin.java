package Inimigos;

public class Hobgoblin extends Inimigo {

    public Hobgoblin(int level) {
        super("Hobgoblin", 50, 10, 100, level);
        setForca(3);
        setDestreza(2);
        setInteligencia(1);
        setSabedoria(1);
    }

    @Override
    public String getClasse() {
        return "Hobgoblin";
    }
}
