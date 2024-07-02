package Personagens;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome, int nivel) {
        super(nome, 100, 50, nivel, 10); 
        setDexterity(5);
        setConstitution(8);
        setIntelligence(3);
        setWisdom(4);
        setCharisma(6);
    }

    @Override
    public String getClasse() {
        return "Guerreiro";
    }
}
