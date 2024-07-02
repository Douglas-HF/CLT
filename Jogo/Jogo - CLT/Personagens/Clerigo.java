package Personagens;

public class Clerigo extends Personagem {

    public Clerigo(String nome, int nivel) {
        super(nome, 70, 70, nivel, 5); 
        setDexterity(6);
        setConstitution(5);
        setIntelligence(6);
        setWisdom(7);
        setCharisma(10);
    }

    @Override
    public String getClasse() {
        return "Clerigo";
    }
}
