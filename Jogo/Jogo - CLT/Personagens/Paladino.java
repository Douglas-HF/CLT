package Personagens;

public class Paladino extends Personagem {

    public Paladino(String nome, int nivel) {
        super(nome, 90, 60, nivel, 8); 
        setDexterity(5);
        setConstitution(7);
        setIntelligence(6);
        setWisdom(8);
        setCharisma(7);
    }

    @Override
    public String getClasse() {
        return "Paladino";
    }
}
