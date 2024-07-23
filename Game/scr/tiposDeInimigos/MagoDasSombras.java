package scr.tiposDeInimigos;

import scr.main.PainelDeJogo;
import scr.principais.Inimigos;

public class MagoDasSombras extends Inimigos {
    //private String nomeInimigo = "Mago das Sombras";
    public MagoDasSombras(PainelDeJogo gp, int dificuldadeInimigo, String nome){
        super(gp, dificuldadeInimigo);
        obterNomeInimigo("General das Sombras");
    }
}
