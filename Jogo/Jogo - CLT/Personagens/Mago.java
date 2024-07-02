package Personagens;

public class Mago extends Personagem {

    public Mago(String nome, int nivel) {
        super(nome, 50, 100, nivel, 3); 
        setDexterity(4);
        setConstitution(3);
        setIntelligence(10);
        setWisdom(8);
        setCharisma(5);
    }

    @Override
    public String getClasse() {
        return "Mago";
    }
}
