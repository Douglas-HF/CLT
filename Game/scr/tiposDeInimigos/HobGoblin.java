package scr.tiposDeInimigos;

import scr.main.PainelDeJogo;
import scr.principais.Inimigos;

public class HobGoblin extends Inimigos {
    //private String nomeInimigo = "HobGoblin";
    public HobGoblin(PainelDeJogo gp, int dificuldadeInimigo, String nome){
        super(gp, dificuldadeInimigo);
        obterNomeInimigo("General das Sombras");
    }
}
