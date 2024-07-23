package scr.principais;

import java.util.Random;
import scr.main.PainelDeJogo;
import scr.tiposDeInimigos.CavaleiroDasSombras;
import scr.tiposDeInimigos.GeneralDasSombras;
import scr.tiposDeInimigos.Goblin;
import scr.tiposDeInimigos.HobGoblin;
import scr.tiposDeInimigos.Javali;
import scr.tiposDeInimigos.MagoDasSombras;
import scr.tiposDeInimigos.SoldadoDasSombras;

public class Inimigos extends SerVivo{
    private int XP;
    private double coeficienteXP;
    private int dificuldadeInimigo;
    private String nomeInimigo;
    public Inimigos(PainelDeJogo gp, int dificuldadeInimigo){
        super(gp);
        this.dificuldadeInimigo = dificuldadeInimigo;
    }
    public String obterNomeInimigo(String nome){
        this.nomeInimigo = nome;
        return nomeInimigo;

    }
    public static Inimigos escolherInimigo(PainelDeJogo gp, int dificuldadeInimigo) {
        Random random = new Random();
        int personagemIndex = random.nextInt(7) + 1;

        switch (personagemIndex) {
            case 1:
                return new Javali(gp, dificuldadeInimigo, "Javali");
            case 2:
                return new Goblin(gp, dificuldadeInimigo, "Goblin");
            case 3:
                return new HobGoblin(gp, dificuldadeInimigo, "Hobgoblin");
            case 4:
                return new SoldadoDasSombras(gp, dificuldadeInimigo, "Soldado");
            case 5:   
                return new CavaleiroDasSombras(gp, dificuldadeInimigo, "Cavaleiro");
            case 6:
                return new MagoDasSombras(gp, dificuldadeInimigo, "Mago Sombrio");
            case 7:
                return new GeneralDasSombras(gp, dificuldadeInimigo, "General das Sombras");
            default:
                System.out.println("Escolha inválida");
                return null;
        }
    }

    public int gerarXP(){
        switch (dificuldadeInimigo) {
            case 1:
                coeficienteXP = 0.50;
                break;
        
            case 2:
                coeficienteXP = 0.70;
                break;
            
            case 3:
                coeficienteXP = 1;
                break;
            case 4:
                coeficienteXP = 1.25;
                break;
            case 5:
                coeficienteXP = 1.50;
                break;
            case 6:
                coeficienteXP = 1.75;
                break;
            case 7:
                coeficienteXP = 2;
                break;
        }

        XP = (int) ((double)(coeficienteXP*300));
        return XP;
    }
    public int getXP() {
        return XP;
    }
    public void setXP(int xP) {
        XP = xP;
    }

    public double getCoeficienteXP() {
        return coeficienteXP;
    }
    public void setCoeficienteXP(int coeficienteXP) {
        this.coeficienteXP = coeficienteXP;
    }

    public int getDificuldadeInimigo() {
        return dificuldadeInimigo;  
    }
    public void setDificuldadeInimigo(int dificuldadeInimigo) {
        this.dificuldadeInimigo = dificuldadeInimigo;
    }

    }