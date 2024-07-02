package Personagens;

public class Arqueiro extends Personagem {

    public Arqueiro(String nome, int nivel) {
        super(nome, 80, 60, nivel, 7); 
        setDexterity(10);
        setConstitution(6);
        setIntelligence(5);
        setWisdom(5);
        setCharisma(4);
    }

    @Override
    public String getClasse() {
        return "Arqueiro";
    }
}
