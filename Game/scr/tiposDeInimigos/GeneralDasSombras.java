package scr.tiposDeInimigos;

import scr.main.PainelDeJogo;
import scr.principais.Inimigos;

public class GeneralDasSombras extends Inimigos{
    //private String nomeInimigo = "General das Sombras";
    public GeneralDasSombras(PainelDeJogo gp, int dificuldadeInimigo, String nome){
        super(gp, dificuldadeInimigo);
        obterNomeInimigo("General das Sombras");
    }
}
